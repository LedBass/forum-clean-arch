package br.com.marcio.forum.domain.service;

import br.com.marcio.forum.domain.VoteAnswer;

/**
 * Interface to validate {@link VoteAnswer} instances
 */
public interface VoteAnswerValidator {

    /**
     * Use this method to validate a {@link VoteAnswer} instance
     * @param voteAnswer A {@link VoteAnswer} instance to be validated
     * @return {@code true} if, and only if, the given {@link VoteAnswer} instance is valid and {@code false} otherwise
     */
    boolean validateVoteAnswer(VoteAnswer voteAnswer);
}
