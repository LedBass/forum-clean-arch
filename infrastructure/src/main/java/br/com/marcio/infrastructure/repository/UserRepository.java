package br.com.marcio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.marcio.forum.domain.User;
import br.com.marcio.forum.domain.repository.UserDomainRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, UserDomainRepository {
}
