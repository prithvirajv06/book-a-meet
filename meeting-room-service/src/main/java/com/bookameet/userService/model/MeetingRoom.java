package com.bookameet.userService.model;

import com.bookameet.userService.enums.Amenities;
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
