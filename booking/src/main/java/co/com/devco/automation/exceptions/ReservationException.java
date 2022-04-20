package co.com.devco.automation.exceptions;

public class ReservationException extends AssertionError {
    public static final String MESSAGE_FAILED_RESERVATION = "Stay Reservations Failed, there are no stays available";

    public ReservationException(String message, Throwable cause) {
        super(message, cause);
    }
}
