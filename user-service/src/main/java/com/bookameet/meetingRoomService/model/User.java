package com.bookameet.meetingRoomService.model;

import com.bookameet.meetingRoomService.enums.Role;
import com.bookameet.meetingRoomService.enums.UserStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Getter
@Setter
@Builder
public class User extends AuditDetails{

    @Id
    private String username;
    private String password;
    private String email;
    private Role role;
    private UserStatus active;
    private UserDetails userDetails;

}
