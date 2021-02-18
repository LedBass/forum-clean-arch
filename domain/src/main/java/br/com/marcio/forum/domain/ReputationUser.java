package br.com.marcio.forum.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A domain class to represent a reputation of a determined {@link User} in the system
 */
public class ReputationUser {
    private User user;
    private Integer score;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Class Constructor
     * @param user An {@link User} instance regarding this reputation
     * @param score An {@link Integer} containing the number of votes of this reputation
     * @param createdAt A {@link LocalDateTime} containing the date and time when this reputation were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this reputation were updated
     */
    public ReputationUser(User user, Integer score, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.user = user;
        this.score = score;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

        if (!(o instanceof ReputationUser)) {
            return false;
        }

        ReputationUser that = (ReputationUser) o;
        return this.getUser().equals(that.getUser()) &&
                this.getScore().equals(that.getScore()) &&
                Objects.equals(this.getCreatedAt(), that.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), that.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getUser(), this.getScore(), this.getCreatedAt(), this.getUpdatedAt());
    }
}
