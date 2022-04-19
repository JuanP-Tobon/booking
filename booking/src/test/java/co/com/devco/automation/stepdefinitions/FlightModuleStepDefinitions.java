package co.com.devco.automation.stepdefinitions;

import co.com.devco.automation.questions.flights.ValidateBestFly;
import co.com.devco.automation.tasks.flights.FilterAndSearchFlights;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class FlightModuleStepDefinitions {

    @When("^the user enters the flight component and filters the desired characteristics$")
    public void theUserEntersTheFlightComponentAndFiltersTheDesiredCharacteristics(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FilterAndSearchFlights.with(dataTable));
    }


    @Then("^He should see that the characteristics of the flight is (.*)$")
    public void heShouldSeeThatTheCharacteristicsOfTheFlightIs(String flyTag) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateBestFly.with(flyTag)));
    }

}
