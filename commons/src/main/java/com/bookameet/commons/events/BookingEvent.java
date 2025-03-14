package com.bookameet.commons.events;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEvent {
    private String eventId;
    private String eventJson;
    private Boolean status;
    public static final String TOPIC = "BOOK_ROOM";
}
