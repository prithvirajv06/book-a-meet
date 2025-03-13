package com.bookameet.userService.controller;


import com.bookameet.userService.dto.UserDto;
import com.bookameet.userService.service.UserProfileService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/v1/user")
@RequiredArgsConstructor
public class UserProfileController {

    private final ModelMapper modelMapper;
    private final UserProfileService userService;

    @PostMapping("/save-user-details")
    public ResponseEntity<UserDto> saveUserDetails(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.saveUserDetails(request), UserDto.class));
    }

    @PostMapping("/get-user-details")
    public ResponseEntity<UserDto> getUserDetails(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.getUserDetails(request), UserDto.class));
    }

    @PostMapping("/update-user-details")
    public ResponseEntity<UserDto> updateUserDetails(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.updateUserDetails(request), UserDto.class));
    }

    @PostMapping("/delete-user-details")
    public ResponseEntity<UserDto> deleteUserDetails(@Valid @RequestBody UserDto request) {
        userService.deleteUserDetails(request);
        return ResponseEntity.ok(request);
    }


}
