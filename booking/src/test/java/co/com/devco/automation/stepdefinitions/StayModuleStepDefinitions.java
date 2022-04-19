package co.com.devco.automation.stepdefinitions;

import co.com.devco.automation.tasks.stays.FilterAndSearch;
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

    }

    @Then("^He should see that the stay has the correct data$")
    public void heShouldSeeThatTheStayHasTheCorrectData() {

    }

}
