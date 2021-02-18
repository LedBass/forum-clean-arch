package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.User;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Interface to use to persist and retrieve {@link User} information from the database
 */
public interface UserDomainRepository {
    /**
     * Use this method to create an {@link User} instance in the database
     * @param user An {@link User} instance to be created
     * @return the created user with it's database id
     */
    User create(User user);

    /**
     * Use this method to update an {@link User} Instance
     * @param user An {@link User} instance with the updated values
     * @return The same user, now updated
     */
    User update(User user);

    /**
     * Use this method to find an {@link User} by its id
     * @param id A {@link Long} containing the {@link User} id
     * @return An {@link Optional} of {@link User} that may contain an {@link User} instance
     * @see Optional#get()
     */
    Optional<User> findById(Long id);

    /**
     * Use this method to find one or more {@link User}s instances using the given name
     * @param name A {@link String} with the name
     * @return A {@link List} of {@link User}s, it can be empty if no {@link User} is found in the database
     * @see List#isEmpty()
     */
    List<User> findByName(String name);

    /**
     * Use this method to find an {@link User} by its e-mail address
     * @param email A {@link String} containing the {@link User} e-mail
     * @return An {@link Optional} of {@link User} that may contain an {@link User} instance
     * @see Optional#get()
     */
    Optional<User> findByEmail(String email);

    /**
     * Use this method to find one or more {@link User}s instances using the given birth date
     * @param birthDate A {@link Date} with the {@link User}'s birth date
     * @return A {@link List} of {@link User}s, it can be empty if no {@link User} is found in the database
     * @see List#isEmpty()
     */
    List<User> findByBirthDate(Date birthDate);
}
