package br.com.marcio.forum.domain.exception;

/**
 * Use this exception when no {@link br.com.marcio.forum.domain.Question} could be found in the database
 */
public class QuestionNotFoundException extends Exception {
    private String message;

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public QuestionNotFoundException(String message) {
        super(message);
    }
}
