package com.bookameet.userService.controller;


import com.bookameet.userService.dto.UserDto;
import com.bookameet.userService.service.UserProfileService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/user")
@RequiredArgsConstructor
@Tag(name = "User Profile", description = "User profile APIs")
public class UserProfileController {

    private final ModelMapper modelMapper;
    private final UserProfileService userService;

    @PostMapping("/save-user-details")
    public ResponseEntity<UserDto> saveUserDetails(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.saveUserDetails(request), UserDto.class));
    }

    @GetMapping("/get-user-details")
    public ResponseEntity<UserDto> getUserDetails(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.getUserDetails(request), UserDto.class));
    }

    @PutMapping("/update-user-details")
    public ResponseEntity<UserDto> updateUserDetails(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(modelMapper.map(userService.updateUserDetails(request), UserDto.class));
    }

    @DeleteMapping("/delete-user-details")
    public ResponseEntity<UserDto> deleteUserDetails(@Valid @RequestBody UserDto request) {
        userService.deleteUserDetails(request);
        return ResponseEntity.ok(request);
    }


}
