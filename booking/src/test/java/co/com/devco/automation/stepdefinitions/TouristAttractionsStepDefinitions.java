package co.com.devco.automation.stepdefinitions;

import co.com.devco.automation.exceptions.FillFormException;
import co.com.devco.automation.questions.touristattractions.VerifyFillForm;
import co.com.devco.automation.tasks.touristattractions.FillClientForm;
import co.com.devco.automation.tasks.touristattractions.SearchTouristAttraction;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.devco.automation.exceptions.FillFormException.MESSAGE_EMPTY_NAME_NOT_FOUND;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class TouristAttractionsStepDefinitions {

    @When("^The user filters by the characteristics that best tour their like$")
    public void theUserFiltersByTheCharacteristicsThatBestTourTheirLike(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchTouristAttraction.with(dataTable));
    }

    @When("^The user enters his data$")
    public void theUserEntersHisData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(FillClientForm.with(dataTable));
    }

    @Then("^He should see that it does not let continue to the payment module and that the message (.*)$")
    public void heShouldSeeThatItDoesNotLetContinueToThePaymentModuleAndThatTheMessage(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(VerifyFillForm.with(message)).orComplainWith(FillFormException.class, MESSAGE_EMPTY_NAME_NOT_FOUND));
    }
}
