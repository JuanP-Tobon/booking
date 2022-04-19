package co.com.devco.automation.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flight_module.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.devco.automation.stepdefinitions"
)
public class FlightModule {

}
