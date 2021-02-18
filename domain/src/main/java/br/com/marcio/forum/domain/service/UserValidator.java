package br.com.marcio.forum.domain.service;

import br.com.marcio.forum.domain.User;

/**
 * Interface to validate {@link User} instances
 */
public interface UserValidator {

    /**
     * Use this method to validate an {@link User}
     * @param user An {@link User} interface to be validated
     * @return {@code true} if, and only if, the given {@link User} instance s valid and {@code false} otherwise
     */
    boolean validateUser(User user);
}
