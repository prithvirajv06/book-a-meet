package com.bookameet.bookingService.dto;


import com.bookameet.bookingService.enums.Amenities;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MeetingRoomDTO {
    private String roomId;
    private String roomName;
    private Integer noOfSeats;
    private List<Amenities> amenitiesList;
}
