package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.Question;

import java.util.List;
import java.util.Optional;

/**
 * Interface to use to persist and retrieve {@link Question} information from the database
 */
public interface QuestionDomainRepository {
    /**
     * Use this method to create an {@link Question} instance in the database
     * @param question An {@link Question} instance to be created
     * @return the created question with it's database id
     */
    Question create(Question question);

    /**
     * Use this method to update an {@link Question} Instance
     * @param question An {@link Question} instance with the updated values
     * @return The same question, now updated
     */
    Question update(Question question);

    /**
     * Use this method to find an {@link Question} by its id
     * @param id A {@link Long} containing the {@link Question} id
     * @return An {@link Optional} of {@link Question} that may contain an {@link Question} instance
     * @see Optional#get()
     */
    Optional<Question> findById(Long id);

    /**
     * Use this method to find one or more {@link Question}s instances using the given description
     * @param description A {@link String} with the description
     * @return A {@link List} of {@link Question}s, it can be empty if no {@link Question} is found in the database
     * @see List#isEmpty()
     */
    List<Question> findByName(String description);

    /**
     * Use this method to find an {@link Question} by its id
     * @param userId A {@link Long} containing the {@link Question} id
     * @return An {@link List} of {@link Question}, it can be empty if no {@link Question} is found in the database
     * @see List#isEmpty()
     */
    List<Question> findByUserId(Long userId);

}
