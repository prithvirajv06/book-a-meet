package com.bookameet.userService.controller;


import com.bookameet.userService.dto.UserDto;
import com.bookameet.userService.dto.request.LoginRequest;
import com.bookameet.userService.service.UserAuthService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/auth")
@RequiredArgsConstructor
@Tag(name = "User Auth", description = "User Auth APIs")
public class UserAuthController {

    private final ModelMapper modelMapper;
    private final UserAuthService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDto> createNewUser(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.saveUser(request), UserDto.class));
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(modelMapper.map(userService.login(request), UserDto.class));
    }


}
