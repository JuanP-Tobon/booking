package co.com.devco.automation.tasks.flights;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.automation.userinterfaces.flights.FlightListPage.LOWEST_PRICE_BUTTON;
import static co.com.devco.automation.userinterfaces.flights.FlightListPage.PRICE_FIRST_FLIGHT;

public class FilterLowestPrice implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String normalPrice;
        String lowestPrice;
        String[] priceVec;
        actor.attemptsTo(WaitUntil.the(LOWEST_PRICE_BUTTON, WebElementStateMatchers.isClickable()));
        priceVec = Text.of(PRICE_FIRST_FLIGHT).viewedBy(actor).asString().split(" ");
        normalPrice = priceVec[1];
        actor.remember("normalPrice", normalPrice);
        actor.attemptsTo(Click.on(LOWEST_PRICE_BUTTON));
        priceVec = Text.of(PRICE_FIRST_FLIGHT).viewedBy(actor).asString().split(" ");
        lowestPrice = priceVec[1];
        actor.remember("lowestPrice", lowestPrice);
    }

    public static FilterLowestPrice inList() {
        return Tasks.instrumented(FilterLowestPrice.class);
    }
}
