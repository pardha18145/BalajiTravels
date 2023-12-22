package com.spanprojects.msscbrewery.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageID;

    @ManyToOne
    @JoinColumn(name = "UserID")
    private User user;

    private String subject;
    
    @Lob
    private String messageText;

    private LocalDateTime timestamp;

    // Constructors, getters, and setters

    public Message() {
        // Default constructor
    }

    public Message(User user, String subject, String messageText, LocalDateTime timestamp) {
        this.user = user;
        this.subject = subject;
        this.messageText = messageText;
        this.timestamp = timestamp;
    }

    // Getters and setters for each field

    public Long getMessageID() {
        return messageID;
    }

    public void setMessageID(Long messageID) {
        this.messageID = messageID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
