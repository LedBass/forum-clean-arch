package br.com.marcio.forum.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A domain class representing an answer to a {@link Question} in the system
 */
public class Answer {
    private Long id;
    private User user;
    private Question question;
    private String comment;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Class Constructor
     * @param id A {@link Long} containing the id of the answer instance
     * @param user An {@link User} instance regarding the user author of the question
     * @param question A {@link Question} that originated the answer
     * @param comment A {@link String} with the answer per se
     * @param createdAt A {@link LocalDateTime} containing the date and time when this answer were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this answer were updated
     */
    public Answer(Long id, User user, Question question, String comment, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.user = user;
        this.question = question;
        this.comment = comment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Answer)) {
            return false;
        }

        Answer answer = (Answer) o;
        return this.getId().equals(answer.getId()) &&
                this.getUser().equals(answer.getUser()) &&
                this.getQuestion().equals(answer.getQuestion()) &&
                this.getComment().equals(answer.getComment()) &&
                Objects.equals(this.getCreatedAt(), answer.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), answer.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getUser(), this.getQuestion(), this.getComment(), this.getCreatedAt(),
                this.getUpdatedAt());
    }
}
