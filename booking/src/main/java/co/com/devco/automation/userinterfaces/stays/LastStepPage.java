package co.com.devco.automation.userinterfaces.stays;

import net.serenitybdd.screenplay.targets.Target;

public class LastStepPage {
    public static final Target ARRIVE_DATE_TEXT = Target.the("field to indicate the arrive date of reservation").locatedBy("(//span[@class='bui-date__title'])[1]");
    public static final Target RETURN_DATE_TEXT = Target.the("field to indicate the return date of reservation").locatedBy("(//span[@class='bui-date__title'])[2]");
    public static final Target ADDRESS_TEXT = Target.the("Field to indicate the address of stay").locatedBy("//address[@class='bp-property-details__address js-property-details__copy-address js-copy e2e-property-details__address-text']");

    private LastStepPage() {
    }
}
