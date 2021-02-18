package br.com.marcio.forum.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A domain class to represent a flag in the system
 * This class will work as a representation of "social media hashcode" that can be used to mark a certain Question 
 * in a determined matter and/or subject inside the system
 */
public class Flag {
    private Long id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean enabled;

    /**
     * Class Constructor
     * @param id A {@link Long} containing the id of this flag instance 
     * @param description A {@link String} containing the flag 
     * @param createdAt A {@link LocalDateTime} containing the date and time when this flag were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this flag were updated
     * @param enabled A {@code boolean} indicating either this flag is enabled or not
     */
    public Flag(Long id, String description, LocalDateTime createdAt, LocalDateTime updatedAt, boolean enabled) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Flag)) {
            return false;
        }

        Flag flag = (Flag) o;
        return this.isEnabled() == flag.isEnabled() &&
                this.getId().equals(flag.getId()) &&
                this.getDescription().equals(flag.getDescription()) &&
                Objects.equals(this.getCreatedAt(), flag.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), flag.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDescription(), this.getCreatedAt(), this.getUpdatedAt(), this.isEnabled());
    }
}
