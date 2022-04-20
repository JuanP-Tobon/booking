package co.com.devco.automation.questions.flights;

import co.com.devco.automation.userinterfaces.flights.FlightListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateBestFly implements Question<Boolean> {
    private String flyTag;

    public ValidateBestFly(String flyTag) {
        this.flyTag = flyTag;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(FlightListPage.TAG_BEST_FLY).viewedBy(actor).asString().equals(flyTag);
    }

    public static ValidateBestFly with(String flyTag) {
        return new ValidateBestFly(flyTag);
    }
}
