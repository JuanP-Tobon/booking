package co.com.devco.automation.questions.flights;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidateLowestPrice implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        return Integer.parseInt(actor.recall("lowestPrice")) <= Integer.parseInt(actor.recall("normalPrice"));
    }

    public static ValidateLowestPrice inList() {
        return new ValidateLowestPrice();
    }
}
