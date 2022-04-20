package co.com.devco.automation.tasks.stays;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.automation.userinterfaces.stays.StaysFoundPage.PRICE_LOW_FILTER_CHECKBOX;
import static co.com.devco.automation.userinterfaces.stays.StaysFoundPage.QUANTITY_OF_STAYS_FILTER_TEXT;

public class FilterWithLowPrice implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(QUANTITY_OF_STAYS_FILTER_TEXT, WebElementStateMatchers.isVisible()));
        actor.remember("quantityStays", Text.of(QUANTITY_OF_STAYS_FILTER_TEXT).viewedBy(actor).asString());
        actor.attemptsTo(Click.on(PRICE_LOW_FILTER_CHECKBOX));
    }

    public static FilterWithLowPrice inPage() {
        return Tasks.instrumented(FilterWithLowPrice.class);
    }
}
