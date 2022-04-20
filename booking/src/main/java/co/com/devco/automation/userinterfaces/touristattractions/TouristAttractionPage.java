package co.com.devco.automation.userinterfaces.touristattractions;

import net.serenitybdd.screenplay.targets.Target;

public class TouristAttractionPage {
    public static final Target PICKUP_DATE_BUTTON = Target.the("Calendar to select the date to pickup").locatedBy("//div[@data-testid='datepicker']");
    public static final Target GENERAL_DATE_BUTTON = Target.the("particular date for a calendar").locatedBy("//span[@aria-label='{0}']");
    public static final Target SELECT_HOUR = Target.the("Selector to pickup the hour").locatedBy("//select[@class='e3fc724322']");
    public static final Target SELECT_TICKET_BUTTON = Target.the("Button to select the ticket value").locatedBy("(//button[@data-testid='select-ticket'])[1]");
    public static final Target ADD_TICKETS_BUTTON = Target.the("Button to add tickets").locatedBy("(//span[text()='+'])[1]");

    private TouristAttractionPage(){}
}
