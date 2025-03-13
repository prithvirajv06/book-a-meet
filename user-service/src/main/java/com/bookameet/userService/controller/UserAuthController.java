package com.bookameet.userService.controller;


import com.bookameet.userService.dto.UserDto;
import com.bookameet.userService.dto.request.LoginRequest;
import com.bookameet.userService.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class UserAuthController {

    private final ModelMapper modelMapper;
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDto> createNewUser(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.saveUser(request), UserDto.class));
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(modelMapper.map(userService.login(request), UserDto.class));
    }


}
