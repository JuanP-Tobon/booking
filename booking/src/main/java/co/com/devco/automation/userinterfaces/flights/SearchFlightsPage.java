package co.com.devco.automation.userinterfaces.flights;

import net.serenitybdd.screenplay.targets.Target;

public class SearchFlightsPage {
    public static final Target ORIGIN_BUTTON = Target.the("Button to open the field to enter origin city").locatedBy("(//div[@class='_id7 _ijM _ii0 _iir _kaB _io5'])[1]");
    public static final Target ORIGIN_FILTER_FIELD = Target.the("Field to enter the origin city").locatedBy("//input[@aria-label='Origen']");
    public static final Target DESTINATION_BUTTON = Target.the("Button to open the field to enter destination city").locatedBy("(//div[@class='_id7 _ijM _ii0 _iir _kaB _io5'])[2]");
    public static final Target DESTINATION_FILTER_FIELD = Target.the("Field to enter the destination city").locatedBy("//input[@aria-label='Destino']");
    public static final Target FLIGHT_COMPONENT_BUTTON = Target.the("button to enter the flight component").locatedBy("//a[@data-decider-header='flights']");
    public static final Target DATE_BUTTON = Target.the("Date general button").locatedBy("//div[@aria-label='{0}']");
    public static final Target SEARCH_BUTTON = Target.the("Button to search flights with this filters").locatedBy("(//span[@class='v-c-p centre '])[1]");


    private SearchFlightsPage(){}
}
