package br.com.marcio.forum.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 * A domain class to represent an user instance in the system
 */
public class User {
    private Long id;
    private List<Role> roles;
    private String name;
    private String email;
    private LocalDate birthDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private boolean enabled;

    /**
     * Class constructor
     * @param id A {@link Long} containing the database id of this user instance
     * @param name A {@link String} containing the user name
     * @param email A {@link String} containing the user email
     * @param birthDate A {@link LocalDate} containing the user birthdate
     * @param createdAt A {@link LocalDateTime} containing the date and time when this user were created
     * @param updatedAt A {@link LocalDateTime} containing the date and time when this user were updated
     * @param enabled A {@code boolean} indicating either this user is enabled or not
     */
    public User(Long id, String name, String email, LocalDate birthDate, LocalDateTime createdAt,
                LocalDateTime updatedAt, boolean enabled) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
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

    public List<Role> getRoles() {
        return roles;
    }

    public User setRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;
        return this.isEnabled() == user.isEnabled() &&
                this.getId().equals(user.getId()) &&
                this.getRoles().equals(user.getRoles()) &&
                this.getName().equals(user.getName()) &&
                this.getEmail().equals(user.getEmail()) &&
                this.getBirthDate().equals(user.getBirthDate()) &&
                Objects.equals(this.getCreatedAt(), user.getCreatedAt()) &&
                Objects.equals(this.getUpdatedAt(), user.getUpdatedAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getId(), this.getRoles(), this.getName(),
                this.getEmail(), this.getBirthDate(), this.getCreatedAt(), this.getUpdatedAt(),
                this.isEnabled());
    }
}
