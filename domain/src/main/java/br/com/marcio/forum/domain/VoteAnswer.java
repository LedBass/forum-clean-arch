package br.com.marcio.forum.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A domain class representing a Vote to a given {@link Answer}
 */
public class VoteAnswer {
    private Answer answer;
    private User user;
    private Integer score;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Class Constructor
     * @param answer A {@link Answer} instance
     * @param user An {@link User} instance
     * @param score An {@link Integer} with the score
     * @param createdAt A {@link LocalDateTime} containing the date and time when this vote answer were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this vote answer were updated
     */
    public VoteAnswer(Answer answer, User user, Integer score, LocalDateTime createdAt,
                      LocalDateTime updatedAt) {
        this.answer = answer;
        this.user = user;
        this.score = score;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
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

        if (!(o instanceof VoteAnswer)) {
            return false;
        }

        VoteAnswer that = (VoteAnswer) o;
        return this.getAnswer().equals(that.getAnswer()) &&
                this.getUser().equals(that.getUser()) &&
                this.getScore().equals(that.getScore()) &&
                Objects.equals(this.getCreatedAt(), that.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), that.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getAnswer(), this.getUser(), this.getScore(), this.getCreatedAt(), this.getUpdatedAt());
    }
}
