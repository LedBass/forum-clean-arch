package br.com.marcio.infrastructure.repository;

import br.com.marcio.forum.domain.Flag;
import br.com.marcio.forum.domain.repository.FlagDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlagRepository extends JpaRepository<Flag, Long>, FlagDomainRepository {
}
