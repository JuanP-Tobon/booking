package co.com.devco.automation.exceptions;

public class FilterLowerPriceException extends AssertionError{
    public static final String MESSAGE_FAILED_FILTER_PRICE = "The least price filter element was not found on the page, prevent the cursor from interfering with the automation";

    public FilterLowerPriceException(String message, Throwable cause) {
        super(message, cause);
    }
}
