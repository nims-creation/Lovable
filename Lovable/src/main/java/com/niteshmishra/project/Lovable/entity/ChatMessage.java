package com.niteshmishra.project.Lovable.entity;

import com.niteshmishra.project.Lovable.Enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;

    ChatSession chatSession;

    String content;

    MessageRole role;

    String toolCalls;
    Integer tokenUsed;

    Instant createdAt;

}
