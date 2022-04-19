package co.com.devco.automation.stepdefinitions;

import co.com.devco.automation.exceptions.FilterLowerPriceException;
import co.com.devco.automation.exceptions.ReservationException;
import co.com.devco.automation.questions.stays.ValidateQuantityStaysFiltered;
import co.com.devco.automation.questions.stays.ValidateReservation;
import co.com.devco.automation.tasks.stays.FilterAndSearch;
import co.com.devco.automation.tasks.stays.FilterWithLowPrice;
import co.com.devco.automation.tasks.stays.SelectReservation;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.devco.automation.exceptions.FilterLowerPriceException.MESSAGE_FAILED_FILTER_PRICE;
import static co.com.devco.automation.exceptions.ReservationException.MESSAGE_FAILED_RESERVATION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class StayModuleStepDefinitions {

    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^The user enters the main page$")
    public void theUserEntersTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com/"));
    }


    @When("^He performs the search through the filters$")
    public void hePerformsTheSearchThroughTheFilters(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterAndSearch.with(dataTable));
    }

    @When("^He selects the stay$")
    public void heSelectsTheStay() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectReservation.on());
    }

    @Then("^He should see that the stay has the correct data$")
    public void heShouldSeeThatTheStayHasTheCorrectData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateReservation.with(dataTable)).orComplainWith(ReservationException.class, MESSAGE_FAILED_RESERVATION));
    }

    @When("^He selects the lowest prices to filter$")
    public void heSelectsTheLowestPricesToFilter() {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterWithLowPrice.inPage());
    }

    @Then("^He should see that the number of options is equal to the view in the filter$")
    public void heShouldSeeThatTheNumberOfOptionsIsEqualToTheViewInTheFilter() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateQuantityStaysFiltered.inPage()).orComplainWith(FilterLowerPriceException.class, MESSAGE_FAILED_FILTER_PRICE));
    }

}
