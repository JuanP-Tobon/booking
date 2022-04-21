package co.com.devco.automation.userinterfaces.stays;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StaysFoundPage {
    public static final Target STAY_NAME_DESCRIPTION = Target.the("Field to indicate the name of the stay").locatedBy("(//div[@class='fcab3ed991 a23c043802'])[1]");
    public static final Target STAY_AVAILABILITY_BUTTON = Target.the("Button of first stay availability").locatedBy("(//div[@data-testid='availability-cta'])[1]");
    public static final Target RESERVE_NOW_BUTTON = Target.the("Button to reserve now").located(By.id("hp_book_now_button"));
    public static final Target I_WILL_RESERVE_BUTTON = Target.the("Button to pass to the step 3, finalize the stay reservation").locatedBy("//div[@class='hprt-reservation-cta']");
    public static final Target APARTMENTS_SELECTOR_FIELD = Target.the("Selector to select the option of apartments quantity").locatedBy("(//select[@class='hprt-nos-select js-hprt-nos-select'])[1]");
    public static final Target PRICE_LOW_FILTER_CHECKBOX = Target.the("checkbox for filter the lowest prices").locatedBy("//div[@data-filters-item='pri:pri=1']");
    public static final Target QUANTITY_OF_STAYS_FILTER_TEXT = Target.the("text to indicate the quantity of stays with this filter").locatedBy("(//span[@class='d8eab2cf7f a414c2b280'])[1]");
    public static final Target QUANTITY_STAYS_SEARCHING = Target.the("Text of results to search and filter stays").locatedBy("//h1[@class='e1f827110f d3a14d00da']");

    private StaysFoundPage (){}
}
