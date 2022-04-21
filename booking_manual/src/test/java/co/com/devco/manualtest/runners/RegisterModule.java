package co.com.devco.manualtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/register_module.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.devco.manualtest.stepdefinitions"
)
public class RegisterModule {
}
