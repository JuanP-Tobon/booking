package co.com.devco.automation.tasks.stays;

import co.com.devco.automation.interactions.ChangeWindow;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.automation.userinterfaces.stays.StaysFoundPage.*;

public class SelectReservation implements Task {
    public static final String APARTMENTS = "1";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(STAY_AVAILABILITY_BUTTON),
                ChangeWindow.conTitulo(Text.of(STAY_NAME_DESCRIPTION).viewedBy(actor).asString()),
                Click.on(RESERVE_NOW_BUTTON)

        );
        WaitUntil.the(APARTMENTS_SELECTOR_FIELD, WebElementStateMatchers.isClickable());
        actor.attemptsTo(SelectFromOptions.byValue(APARTMENTS).from(APARTMENTS_SELECTOR_FIELD));
        actor.attemptsTo(Click.on(I_WILL_RESERVE_BUTTON));
    }

    public static SelectReservation on() {
        return Tasks.instrumented(SelectReservation.class);
    }
}
