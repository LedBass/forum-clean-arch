package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.Flag;

import java.util.Optional;

/**
 * Interface to use to persist and retrieve {@link Flag} information from the database
 */
public interface FlagDomainRepository {
    /**
     * Use this method to create an {@link Flag} instance in the database
     * @param flag An {@link Flag} instance to be created
     * @return the created flag with it's database id
     */
    Flag create(Flag flag);

    /**
     * Use this method to update an {@link Flag} Instance
     * @param flag An {@link Flag} instance with the updated values
     * @return The same flag, now updated
     */
    Flag update(Flag flag);

    /**
     * Use this method to find an {@link Flag} by its id
     * @param id A {@link Long} containing the {@link Flag} id
     * @return An {@link Optional} of {@link Flag} that may contain an {@link Flag} instance
     * @see Optional#get()
     */
    Optional<Flag> findById(Long id);

    /**
     *
     * @param description A {@link String} containing the description of the {@link Flag}
     * @return An {@link Optional} of {@link Flag} that may contain an {@link Flag} instance
     * @see Optional#get()
     */
    Optional<Flag> findByDescription(String description);
}
