package com.bookameet.bookingService.dto;

import com.bookameet.bookingService.enums.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserDto {
    private String id;
    private String username;
    private String password;
    private String email;
    private Role role;
}
