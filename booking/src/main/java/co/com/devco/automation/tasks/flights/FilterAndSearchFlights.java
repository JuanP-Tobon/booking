package co.com.devco.automation.tasks.flights;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.devco.automation.userinterfaces.flights.SearchFlightsPage.*;

public class FilterAndSearchFlights implements Task {
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;


    public FilterAndSearchFlights(DataTable dataTable) {
        List<String> data = dataTable.raw().get(1);
        this.origin = data.get(0);
        this.destination = data.get(1);
        this.departureDate = data.get(2);
        this.returnDate = data.get(3);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FLIGHT_COMPONENT_BUTTON),
                WaitUntil.the(ORIGIN_BUTTON, WebElementStateMatchers.isClickable()),
                Click.on(ORIGIN_BUTTON),
                Enter.theValue(origin).into(ORIGIN_FILTER_FIELD),
                Enter.theValue(origin).into(ORIGIN_FILTER_FIELD).thenHit(Keys.TAB),
                WaitUntil.the(DESTINATION_BUTTON, WebElementStateMatchers.isClickable()),
                Click.on(DESTINATION_BUTTON),
                Enter.theValue(destination).into(DESTINATION_FILTER_FIELD),
                Enter.theValue(destination).into(DESTINATION_FILTER_FIELD).thenHit(Keys.TAB),
                Click.on(DATE_BUTTON.of(departureDate)),
                Click.on(DATE_BUTTON.of(returnDate)),
                Click.on(SEARCH_BUTTON)
        );
    }

    public static FilterAndSearchFlights with(DataTable dataTable) {
        return Tasks.instrumented(FilterAndSearchFlights.class, dataTable);
    }
}
