package com.bookameet.meetingRoomService.model;

import com.bookameet.meetingRoomService.enums.Amenities;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Document
@Getter
@Setter
@Builder
public class MeetingRoom extends AuditDetails{

    @Id
    private String roomId;
    private String roomName;
    private Integer noOfSeats;
    private List<Amenities> amenitiesList;

}
