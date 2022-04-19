package co.com.devco.automation.questions.stays;

import co.com.devco.automation.userinterfaces.stays.StaysFoundPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValidateQuantityStaysFiltered implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.the(StaysFoundPage.QUANTITY_STAYS_SEARCHING, WebElementStateMatchers.isVisible()));

        return Text.of(StaysFoundPage.QUANTITY_STAYS_SEARCHING).viewedBy(actor).asString().contains(actor.recall("quantityStays"));
    }

    public static ValidateQuantityStaysFiltered inPage() {
        return new ValidateQuantityStaysFiltered();
    }
}
