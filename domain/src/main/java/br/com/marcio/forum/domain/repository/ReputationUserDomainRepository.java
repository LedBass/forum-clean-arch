package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.ReputationUser;

/**
 * Interface to use to persist and retrieve {@link ReputationUser} information from the database
 */
public interface ReputationUserDomainRepository {
    /**
     * Use this method to create an {@link ReputationUser} instance in the database
     * @param reputationUser An {@link ReputationUser} instance to be created
     * @return the created {@link ReputationUser} with it's database id
     */
    ReputationUser create(ReputationUser reputationUser);

    /**
     * Use this method to update an {@link ReputationUser} Instance
     * @param reputationUser An {@link ReputationUser} instance with the updated values
     * @return The same reputationUser, now updated
     */
    ReputationUser update(ReputationUser reputationUser);
}
