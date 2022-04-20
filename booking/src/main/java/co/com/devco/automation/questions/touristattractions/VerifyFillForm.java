package co.com.devco.automation.questions.touristattractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.devco.automation.userinterfaces.touristattractions.ClientFormPage.MESSAGE_ERROR;

public class VerifyFillForm implements Question<Boolean> {
    private String message;

    public VerifyFillForm(String message) {
        this.message = message;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(MESSAGE_ERROR).viewedBy(actor).asString().equals(message);
    }

    public static VerifyFillForm with(String message) {
        return new VerifyFillForm(message);
    }
}
