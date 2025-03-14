package com.bookameet.userService.dto;


import com.bookameet.userService.enums.Amenities;
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
