package co.com.devco.automation.exceptions;

public class FillFormException extends AssertionError {
    public static final String MESSAGE_EMPTY_NAME_NOT_FOUND = "Was expecting as error message output: Introduce tu nombre.";

    public FillFormException(String message, Throwable cause) {
        super(message, cause);
    }
}
