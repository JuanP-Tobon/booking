package co.com.devco.automation.tasks.touristattractions;

import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.devco.automation.userinterfaces.touristattractions.ClientFormPage.*;

public class FillClientForm implements Task {
    private String name;
    private String lastName;
    private String email;
    private String phone;

    public FillClientForm(DataTable dataTable) {
        List<String> data = dataTable.raw().get(1);
        this.name = data.get(0);
        this.lastName = data.get(1);
        this.email = data.get(2);
        this.phone = data.get(3);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(NAME_FIELD),
                Enter.theValue(lastName).into(LASTNAME_FIELD),
                Enter.theValue(email).into(EMAIL_FIELD),
                Enter.theValue(email).into(EMAIL_CONFIRMATION_FIELD),
                Enter.theValue(phone).into(PHONE_FIELD).thenHit(Keys.ENTER)
        );
    }

    public static FillClientForm with(DataTable dataTable) {
        return Tasks.instrumented(FillClientForm.class, dataTable);
    }
}
