package co.com.devco.automation.questions.stays;

import co.com.devco.automation.userinterfaces.stays.LastStepPage;
import cucumber.api.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class ValidateReservation implements Question<Boolean> {
    private String arriveDate;
    private String returnDate;
    private String destination;

    public ValidateReservation(DataTable dataTable) {
        List<String> data = dataTable.raw().get(1);
        this.arriveDate = data.get(0);
        this.returnDate = data.get(1);
        this.destination = data.get(2);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String[] arriveDateVec = arriveDate.split(" ");
        String[] returnDateVec = returnDate.split(" ");
        String arriveDateEdit = arriveDateVec[0] + " " + arriveDateVec[1].substring(0, 3) + " " + arriveDateVec[2];
        String returnDateEdit = returnDateVec[0] + " " + returnDateVec[1].substring(0, 3) + " " + returnDateVec[2];


        return Text.of(LastStepPage.ARRIVE_DATE_TEXT).viewedBy(actor).asString().substring(5).equals(arriveDateEdit)
                && Text.of(LastStepPage.RETURN_DATE_TEXT).viewedBy(actor).asString().substring(5).equals(returnDateEdit)
                && Text.of(LastStepPage.ADDRESS_TEXT).viewedBy(actor).asString().contains(destination);
    }

    public static ValidateReservation with(DataTable dataTable) {
        return new ValidateReservation(dataTable);
    }
}
