package br.com.marcio.forum.domain;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * A domain class to represent a role in the system
 */
public class Role {
    private Long id;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean enabled;

    /**
     * Class constructor
     * @param id A {@link Long} containing the id of this role instance
     * @param description A {@link String} containing the role
     * @param createdAt A {@link LocalDateTime} containing the date and time when this role were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this role were updated
     * @param enabled A {@code boolean} indicating either this role is enabled or not
     */
    public Role(Long id, String description, LocalDateTime createdAt, LocalDateTime updatedAt, boolean enabled) {
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

        if (!(o instanceof Role)) {
            return false;
        }

        Role role = (Role) o;
        return this.isEnabled() == role.isEnabled() &&
                this.getId().equals(role.getId()) &&
                this.getDescription().equals(role.getDescription()) &&
                Objects.equals(this.getCreatedAt(), role.getCreatedAt())
                && Objects.equals(this.getUpdatedAt(), role.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getDescription(), this.getCreatedAt(), this.getUpdatedAt(), this.isEnabled());
    }
}
