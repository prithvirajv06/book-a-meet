package com.bookameet.bookingService.model;

import java.time.LocalDateTime;
import java.util.Date;


public class AuditDetails {
    private String id;
    private LocalDateTime creationTimestamp = LocalDateTime.now();
    private LocalDateTime updateTimestamp;
}
