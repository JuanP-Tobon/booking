package co.com.devco.automation.userinterfaces.flights;

import net.serenitybdd.screenplay.targets.Target;

public class FlightListPage {
    public static final Target TAG_BEST_FLY = Target.the("Tag to indicate this fly is the best").locatedBy("//div[@class='bfLabel bf-best']");
    public static final Target LOWEST_PRICE_BUTTON = Target.the("Button to filter lowest flight price").locatedBy("//a[@data-sort='price_a']");
    public static final Target PRICE_FIRST_FLIGHT = Target.the("Text with the price of the first flight").locatedBy("(//span[@class='price option-text'])[1]");

    private FlightListPage(){}
}
