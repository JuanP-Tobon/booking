package co.com.devco.automation.stepdefinitions;

import co.com.devco.automation.exceptions.BestFlyException;
import co.com.devco.automation.exceptions.LowestPriceException;
import co.com.devco.automation.questions.flights.ValidateBestFly;
import co.com.devco.automation.questions.flights.ValidateLowestPrice;
import co.com.devco.automation.tasks.flights.FilterAndSearchFlights;
import co.com.devco.automation.tasks.flights.FilterLowestPrice;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.devco.automation.exceptions.BestFlyException.MESSAGE_FAILED_BEST_FLY;
import static co.com.devco.automation.exceptions.LowestPriceException.MESSAGE_LOWEST_PRICE_FAILED;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FlightModuleStepDefinitions {

    @When("^the user enters the flight component and filters the desired characteristics$")
    public void theUserEntersTheFlightComponentAndFiltersTheDesiredCharacteristics(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterAndSearchFlights.with(dataTable));
    }


    @Then("^He should see that the characteristics of the flight is (.*)$")
    public void heShouldSeeThatTheCharacteristicsOfTheFlightIs(String flyTag) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateBestFly.with(flyTag)).orComplainWith(BestFlyException.class, MESSAGE_FAILED_BEST_FLY));
    }

    @When("^He filters by the cheapest flights$")
    public void heFiltersByTheCheapestFlights() {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterLowestPrice.inList());
    }

    @Then("^He should see that the price is less than or equal to the price that appeared without filtering$")
    public void heShouldSeeThatThePriceIsLessThanOrEqualToThePriceThatAppearedWithoutFiltering() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateLowestPrice.inList()).orComplainWith(LowestPriceException.class, MESSAGE_LOWEST_PRICE_FAILED));
    }
}
