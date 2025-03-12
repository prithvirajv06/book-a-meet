package com.bookameet.user_service.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;


public class AuditDetails {
    private String id;
    private LocalDateTime creationTimestamp;
    private LocalDateTime updateTimestamp;
}
