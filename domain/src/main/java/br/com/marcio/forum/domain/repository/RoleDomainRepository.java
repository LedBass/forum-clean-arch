package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.Role;

import java.util.Optional;

/**
 * Interface to persist and retrieve {@link Role} information from the database
 */
public interface RoleDomainRepository {
    /**
     * Use this method to create an {@link Role} instance in the database
     * @param role An {@link Role} instance to be created
     * @return the created role with it's database id
     */
    Role create(Role role);

    /**
     * Use this method to update an {@link Role} Instance
     * @param role An {@link Role} instance with the updated values
     * @return The same role, now updated
     */
    Role update(Role role);

    /**
     * Use this method to find an {@link Role} by its id
     * @param id A {@link Long} containing the {@link Role} id
     * @return An {@link Optional} of {@link Role} that may contain an {@link Role} instance
     * @see Optional#get()
     */
    Optional<Role> findById(Long id);

    /**
     *
     * @param description A {@link String} containing the description of the {@link Role}
     * @return An {@link Optional} of {@link Role} that may contain an {@link Role} instance
     * @see Optional#get()
     */
    Optional<Role> findByDescription(String description);
}
