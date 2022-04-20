package co.com.devco.automation.tasks.stays;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static co.com.devco.automation.userinterfaces.stays.MainPage.*;

public class FilterAndSearch implements Task {
    private String destination;
    private String arriveDate;
    private String returnDate;
    private String adultsPassengers;
    private String bedrooms;

    public FilterAndSearch(DataTable dataTable) {
        List<String> data = dataTable.raw().get(1);
        this.destination = data.get(0);
        this.arriveDate = data.get(1);
        this.returnDate = data.get(2);
        this.adultsPassengers = data.get(3);
        this.bedrooms = data.get(4);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(destination).into(DESTINATION_FILTER_FIELD),
                Click.on(DATE_FILTER),
                Click.on(DATE_ARRIVAL_FILTER.of(arriveDate)),
                Click.on(DATE_ARRIVAL_FILTER.of(returnDate)),
                Click.on(PASSENGERS_FIELD)
        );

        while (!Text.of(ADULTS_QUANTITY_TEXT).viewedBy(actor).asString().equals(adultsPassengers)) {
            int adults = Integer.parseInt(Text.of(ADULTS_QUANTITY_TEXT).viewedBy(actor).asString());
            if (adults < Integer.parseInt(adultsPassengers))
                actor.attemptsTo(Click.on(ADD_ADULTS_BUTTON));
            if (adults > Integer.parseInt(adultsPassengers))
                actor.attemptsTo(Click.on(SUBTRACTION_ADULTS_BUTTON));
        }

        while (!Text.of(BEDROOMS_QUANTITY_TEXT).viewedBy(actor).asString().equals(bedrooms)) {
            int bedroomsPage = Integer.parseInt(Text.of(BEDROOMS_QUANTITY_TEXT).viewedBy(actor).asString());
            if (bedroomsPage < Integer.parseInt(bedrooms))
                actor.attemptsTo(Click.on(ADD_BEDROOMS_BUTTON));
            if (bedroomsPage > Integer.parseInt(bedrooms))
                actor.attemptsTo(Click.on(SUBTRACTION_BEDROOMS_BUTTON));
        }

        actor.attemptsTo(Click.on(SEARCH_BUTTON));
    }

    public static FilterAndSearch with(DataTable dataTable) {
        return Tasks.instrumented(FilterAndSearch.class, dataTable);
    }
}
