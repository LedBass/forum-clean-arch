package br.com.marcio.infrastructure.repository;

import br.com.marcio.forum.domain.Answer;
import br.com.marcio.forum.domain.repository.AnswerDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long>, AnswerDomainRepository {
}
