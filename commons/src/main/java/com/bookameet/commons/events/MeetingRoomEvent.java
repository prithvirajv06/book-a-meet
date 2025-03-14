package com.bookameet.commons.events;

import com.bookameet.commons.events.actions.MeetingRoomActions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MeetingRoomEvent {
    private String meetingId;
    private String meetingJson;
    private Boolean status;
    private MeetingRoomActions meetingRoomActions;
    public static final String TOPIC = "MEETING_ROOM";
}

