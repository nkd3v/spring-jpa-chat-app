package com.example.websocket.chat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "chat_messages")
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    
    @Column(name = "chat_id")
    private String chatId;
    
    @Column(name = "sender_id")
    private String senderId;
    
    @Column(name = "recipient_id")
    private String recipientId;
    
    @Column(name = "content")
    private String content;
    
    @Column(name = "timestamp")
    private Date timestamp;
}