package co.com.devco.automation.userinterfaces.flights;

import net.serenitybdd.screenplay.targets.Target;

public class FlightListPage {
    public static final Target TAG_BEST_FLY = Target.the("Tag to indicate this fly is the best").locatedBy("//div[@class='bfLabel bf-best']");

    private FlightListPage(){}
}
