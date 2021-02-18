package br.com.marcio.forum.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A Domain class to represent a question in the system
 */
public class Question {
    private Long id;
    private User user;
    private List<Flag> flags;
    private List<Answer> answers;
    private String comment;
    private boolean resolved;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    /**
     * Class Constructor
     * @param id A {@link Long} containing the id of the question
     * @param user An {@link User} instance regarding the user author of the question
     * @param flags A {@link List} of {@link Flag}s indicating the matter and/or the subject of the question
     * @param comment A {@link String} with the question per se
     * @param resolved A {@code boolean} indicating either this question is resolved or not
     * @param createdAt A {@link LocalDateTime} containing the date and time when this question were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this question were updated
     */
    public Question(Long id, User user, List<Flag> flags, String comment, boolean resolved, LocalDateTime createdAt,
                    LocalDateTime updatedAt) {
        this.id = id;
        this.user = user;
        this.flags = flags;
        this.comment = comment;
        this.resolved = resolved;
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

    public List<Flag> getFlags() {
        return flags;
    }

    public void setFlags(List<Flag> flags) {
        this.flags = flags;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public Question setAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isResolved() {
        return resolved;
    }

    public void setResolved(boolean resolved) {
        this.resolved = resolved;
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

        if (!(o instanceof Question)) {
            return false;
        }

        Question question = (Question) o;
        return this.isResolved() == question.isResolved() &&
                this.getId().equals(question.getId()) &&
                this.getUser().equals(question.getUser()) &&
                this.getFlags().equals(question.getFlags()) &&
                Objects.equals(this.getAnswers(), question.getAnswers()) &&
                this.getComment().equals(question.getComment()) &&
                Objects.equals(this.getCreatedAt(), question.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), question.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getUser(), this.getFlags(), this.getAnswers(),
                this.getComment(), this.isResolved(), this.getCreatedAt(), this.getUpdatedAt());
    }
}
