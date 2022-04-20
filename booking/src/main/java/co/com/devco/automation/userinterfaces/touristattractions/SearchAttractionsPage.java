package co.com.devco.automation.userinterfaces.touristattractions;

import net.serenitybdd.screenplay.targets.Target;

public class SearchAttractionsPage {
    public static final Target TOURIST_ATTRACTIONS_BUTTON = Target.the("Button to enter in the tourist attractions component").locatedBy("//a[@data-decider-header='attractions']");
    public static final Target SEARCH_FIELD = Target.the("field to search the tourist attractions").locatedBy("//input[@type='search']");
    public static final Target FIRST_SEARCH_ELEMENT = Target.the("First element with list").locatedBy("(//a[@data-testid='search-bar-result'])[1]");

    private SearchAttractionsPage(){}
}
