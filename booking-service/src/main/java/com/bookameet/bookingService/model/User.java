package com.bookameet.bookingService.model;

import com.bookameet.bookingService.enums.Role;
import com.bookameet.bookingService.enums.UserStatus;
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
