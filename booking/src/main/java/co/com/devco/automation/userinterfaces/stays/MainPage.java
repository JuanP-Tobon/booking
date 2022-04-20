package co.com.devco.automation.userinterfaces.stays;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target DESTINATION_FILTER_FIELD = Target.the("Field to enter the destination").located(By.id("ss"));
    public static final Target DATE_FILTER = Target.the("Field to select the date to arrival and return date").located(By.xpath("//div[@class='xp__dates xp__group']"));
    public static final Target DATE_ARRIVAL_FILTER = Target.the("Field to select the date to arrival").locatedBy(("//span[@aria-label='{0}']"));
    public static final Target PASSENGERS_FIELD = Target.the("Field to select the quantity of passengers").located(By.id("xp__guests__toggle"));
    public static final Target SUBTRACTION_ADULTS_BUTTON = Target.the("Button to subtract passengers adults").locatedBy("(//button[@class='bui-button bui-button--secondary bui-stepper__subtract-button '])[1]");
    public static final Target ADD_ADULTS_BUTTON = Target.the("Button to add passengers adults").locatedBy("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[1]");
    public static final Target SUBTRACTION_BEDROOMS_BUTTON = Target.the("Button to subtract bedrooms").locatedBy("(//button[@class='bui-button bui-button--secondary bui-stepper__subtract-button '])[2]");
    public static final Target ADD_BEDROOMS_BUTTON = Target.the("Button to add passengers bedrooms").locatedBy("(//button[@class='bui-button bui-button--secondary bui-stepper__add-button '])[3]");
    public static final Target SEARCH_BUTTON = Target.the("Button to search the stay").locatedBy("//button[@class='sb-searchbox__button ']");
    public static final Target ADULTS_QUANTITY_TEXT = Target.the("Text to indicate the quantity of adults Passengers").locatedBy("(//span[@class='bui-stepper__display'])[1]");
    public static final Target BEDROOMS_QUANTITY_TEXT = Target.the("Text to indicate the quantity of bedrooms").locatedBy("(//span[@class='bui-stepper__display'])[3]");


    private MainPage() {
    }
}
