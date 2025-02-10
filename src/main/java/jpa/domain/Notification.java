package jpa.domain;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String message;
    private LocalDateTime timestamp;
    private boolean read;

    public Notification() {}

    public Notification(User user, String message) {
        this.user = user;
        this.message = message;
        this.timestamp = LocalDateTime.now();
        this.read = false;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public LocalDateTime getTimestamp() { return timestamp; }
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }

    public boolean isRead() { return read; }
    public void setRead(boolean read) { this.read = read; }
}
