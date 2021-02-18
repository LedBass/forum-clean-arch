package br.com.marcio.infrastructure.repository;

import br.com.marcio.forum.domain.Role;
import br.com.marcio.forum.domain.repository.RoleDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>, RoleDomainRepository {
}
