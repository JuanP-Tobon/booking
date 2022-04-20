package co.com.devco.automation.userinterfaces.touristattractions;

import net.serenitybdd.screenplay.targets.Target;

public class ClientFormPage {
    public static final Target NAME_FIELD = Target.the("Field to enter the name of a client").locatedBy("//input[@name='firstName']");
    public static final Target LASTNAME_FIELD = Target.the("Field to enter the lastname of a client").locatedBy("//input[@name='lastName']");
    public static final Target EMAIL_FIELD = Target.the("Field to enter the email of a client").locatedBy("//input[@name='email']");
    public static final Target EMAIL_CONFIRMATION_FIELD = Target.the("Field to enter the email confirmation of a client").locatedBy("//input[@name='emailConfirm']");
    public static final Target PHONE_FIELD = Target.the("Field to enter the phone of a client").locatedBy("//input[@name='phone']");
    public static final Target MESSAGE_ERROR = Target.the("Label indicates the name is empty").locatedBy("(//div[@class='_806745cd2f css-17ijryf'])[1]");

    private ClientFormPage(){}
}
