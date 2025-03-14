package com.bookameet.commons.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationEvent {
    private String notificationId;
    private String notificationJson;
    private Boolean status;
    public static final String TOPIC = "NOTIFICATION_EVENT";
}
