package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.VoteAnswer;

/**
 * Interface to use to persist and retrieve {@link VoteAnswer} information from the database
 */
public interface VoteAnswerDomainRepository {
    /**
     * Use this method to create an {@link VoteAnswer} instance in the database
     * @param voteAnswer An {@link VoteAnswer} instance to be created
     * @return the created {@link VoteAnswer} with it's database id
     */
    VoteAnswer create(VoteAnswer voteAnswer);

    /**
     * Use this method to update an {@link VoteAnswer} Instance
     * @param voteAnswer An {@link VoteAnswer} instance with the updated values
     * @return The same voteAnswer, now updated
     */
    VoteAnswer update(VoteAnswer voteAnswer);
}
