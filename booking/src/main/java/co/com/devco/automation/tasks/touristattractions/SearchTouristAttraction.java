package co.com.devco.automation.tasks.touristattractions;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;

import static co.com.devco.automation.userinterfaces.touristattractions.SearchAttractionsPage.*;
import static co.com.devco.automation.userinterfaces.touristattractions.TouristAttractionPage.*;

public class SearchTouristAttraction implements Task {
    private String destination;
    private String pickupDate;
    private String hour;
    private String tickets;

    public SearchTouristAttraction(DataTable dataTable) {
        List<String> data = dataTable.raw().get(1);
        this.destination = data.get(0);
        this.pickupDate = data.get(1);
        this.hour = data.get(2);
        this.tickets = data.get(3);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TOURIST_ATTRACTIONS_BUTTON),
                Enter.theValue(destination).into(SEARCH_FIELD),
                WaitUntil.the(FIRST_SEARCH_ELEMENT, WebElementStateMatchers.isClickable()),
                Click.on(FIRST_SEARCH_ELEMENT),
                Click.on(PICKUP_DATE_BUTTON),
                Click.on(GENERAL_DATE_BUTTON.of(pickupDate)),
                WaitUntil.the(SELECT_HOUR, WebElementStateMatchers.isClickable()),
                SelectFromOptions.byVisibleText(hour).from(SELECT_HOUR),
                Click.on(SELECT_TICKET_BUTTON)
        );

        for (int i = 0; i < Integer.parseInt(tickets); i++) {
            actor.attemptsTo(Click.on(ADD_TICKETS_BUTTON));
        }

        actor.attemptsTo(Click.on(SELECT_TICKET_BUTTON));
    }

    public static SearchTouristAttraction with(DataTable dataTable) {
        return Tasks.instrumented(SearchTouristAttraction.class, dataTable);
    }
}
