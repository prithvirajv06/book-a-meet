package com.bookameet.meetingRoomService.model;

import java.time.LocalDateTime;


public class AuditDetails {
    private String id;
    private LocalDateTime creationTimestamp = LocalDateTime.now();
    private LocalDateTime updateTimestamp;
}
