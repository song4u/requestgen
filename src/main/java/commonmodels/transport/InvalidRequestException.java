package commonmodels.transport;

public class InvalidRequestException extends Exception {
    public InvalidRequestException() {
    }

    public InvalidRequestException(String message) {
        super(message);
    }

    public InvalidRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidRequestException(Throwable cause) {
        super(cause);
    }

    public InvalidRequestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
