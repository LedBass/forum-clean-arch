package br.com.marcio.forum.domain.service;

import br.com.marcio.forum.domain.Question;

/**
 * Interface to validate {@link Question} instances
 */
public interface QuestionValidator {

    /**
     * Use this method to validate an {@link Question} instance
     * @param question An {@link Question} instance to be validated
     * @return {@code true} if, and only if, the given {@link Question} instance is valid and {@code false} otherwise
     */
    boolean validateQuestion(Question question);

    /**
     * Use this method to remove an {@link Question} from the system by deleting it from the database
     * This will also recalculate all score related to this question from the user who had created it
     * @param question An {@link Question} instance with the information that will be deleted
     */
    void removeQuestion(Question question);

    /**
     * Use this method to solve a given question
     * @param question The {@link Question} instance to be marked as resolved
     * @return The resolved {@link Question}
     */
    Question resolveQuestion(Question question);
}
