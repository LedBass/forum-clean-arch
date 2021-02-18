package br.com.marcio.infrastructure.repository;

import br.com.marcio.forum.domain.Question;
import br.com.marcio.forum.domain.repository.QuestionDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>, QuestionDomainRepository {
}
