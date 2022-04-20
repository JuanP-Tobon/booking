package co.com.devco.automation.exceptions;

public class BestFlyException extends AssertionError{
    public static final String MESSAGE_FAILED_BEST_FLY= "the first flight does not appear with the tag of being the best due to this the error is generated, since with this label it is validated that it is the best flight";

    public BestFlyException(String message, Throwable cause) {
        super(message, cause);
    }
}
