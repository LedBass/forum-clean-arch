package br.com.marcio.forum.domain.exception;

/**
 * Use this exception when an attempt to change a certain value in {@link br.com.marcio.forum.domain.User} instance is
 * not allowed and to block such change
 */
public class UserChangeNotAllowedException extends Exception {
    private String message;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public UserChangeNotAllowedException(String message) {
        super(message);
        this.message = message;
    }
}
