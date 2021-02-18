package br.com.marcio.forum.domain.repository;

import br.com.marcio.forum.domain.Answer;
import br.com.marcio.forum.domain.Question;

import java.util.List;
import java.util.Optional;

/**
 * Interface to use to persist and retrieve {@link Answer} information from the database
 */
public interface AnswerDomainRepository {
    /**
     * Use this method to create an {@link Answer} instance in the database
     * @param answer An {@link Answer} instance to be created
     * @return the created answer with it's database id
     */
    Answer create(Answer answer);

    /**
     * Use this method to update an {@link Answer} Instance
     * @param answer An {@link Answer} instance with the updated values
     * @return The same answer, now updated
     */
    Answer update(Answer answer);

    /**
     * Use this method to find an {@link Answer} by its id
     * @param id A {@link Long} containing the {@link Answer} id
     * @return An {@link Optional} of {@link Answer} that may contain an {@link Answer} instance
     * @see Optional#get()
     */
    Optional<Answer> findById(Long id);

    /**
     * Use this method to find one or more {@link Answer}s instances using the given description
     * @param description A {@link String} with the description
     * @return A {@link List} of {@link Answer}s, it can be empty if no {@link Answer} is found in the database
     * @see List#isEmpty()
     */
    List<Answer> findByName(String description);

    /**
     * Use this method to find an {@link Answer} by its id
     * @param userId A {@link Long} containing the {@link Answer} id
     * @return An {@link List} of {@link Answer}, it can be empty if no {@link Answer} is found in the database
     * @see List#isEmpty()
     */
    List<Answer> findByUserId(Long userId);

    /**
     * Use this method to find an {@link Answer} by its id
     * @param questionId A {@link Long} containing the {@link Question} id
     * @return An {@link List} of {@link Answer}, it can be empty if no {@link Answer} is found in the database
     * @see List#isEmpty()
     */
    List<Answer> findByQuestionId(Long questionId);
}
