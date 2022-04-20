package co.com.devco.automation.exceptions;

public class LowestPriceException extends AssertionError{
    public static final String MESSAGE_LOWEST_PRICE_FAILED = "The filter was not done correctly because the price of the cheapest flight is higher than that of the best flight";

    public LowestPriceException(String message, Throwable cause) {
        super(message, cause);
    }
}
