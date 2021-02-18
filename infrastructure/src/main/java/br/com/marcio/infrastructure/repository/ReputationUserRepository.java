package br.com.marcio.infrastructure.repository;

import br.com.marcio.forum.domain.ReputationUser;
import br.com.marcio.forum.domain.repository.ReputationUserDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReputationUserRepository extends JpaRepository<ReputationUser, Long>, ReputationUserDomainRepository {
}
