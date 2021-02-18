package br.com.marcio.infrastructure.repository;

import br.com.marcio.forum.domain.VoteAnswer;
import br.com.marcio.forum.domain.repository.VoteAnswerDomainRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteAnswerRepository extends JpaRepository<VoteAnswer, Long>, VoteAnswerDomainRepository {
}
