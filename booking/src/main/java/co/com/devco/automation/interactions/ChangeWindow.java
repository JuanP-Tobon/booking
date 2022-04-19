package co.com.devco.automation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ChangeWindow implements Interaction {
    private String tittle;

    public ChangeWindow(String tittle) {
        this.tittle = tittle;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Set<String> screenList = driver.getWindowHandles();
        for (String screen : screenList) {
            driver.switchTo().window(screen);
            System.out.println(driver.getTitle());
            if (driver.getTitle().contains(tittle))
                break;
        }

        if (!driver.getTitle().contains(tittle))
            throw new NoSuchWindowException("A window with the tittle was not found " + tittle);
    }

    public static ChangeWindow conTitulo(String titulo) {
        return Tasks.instrumented(ChangeWindow.class, titulo);
    }
}
