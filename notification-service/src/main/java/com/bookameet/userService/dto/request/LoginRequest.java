package com.bookameet.userService.dto.request;


import lombok.Getter;

@Getter
public class LoginRequest {
    private String username;
    private String password;
}
