package br.com.marcio.forum.domain.service;

import br.com.marcio.forum.domain.Answer;

/**
 * Interface to validate {@link Answer} instances
 */
public interface AnswerValidator {

    /**
     * Use this method to validate an {@link Answer} instance
     * @param answer An {@link Answer} instance to be validated
     * @return {@code true} if, and only if, the given {@link Answer} instance is valid and {@code false} otherwise
     */
    boolean validateAnswer(Answer answer);

    /**
     * Use this method to remove an {@link Answer} from the system by deleting it from the database
     * This will also recalculate all score related to this answer from the user who had created it
     * @param answer An {@link Answer} instance with the information that will be deleted
     */
    void removeAnswer(Answer answer);
}
