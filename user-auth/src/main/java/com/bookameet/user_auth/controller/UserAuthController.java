package com.bookameet.user_auth.controller;


import com.bookameet.user_auth.dto.UserDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1")
@RequiredArgsConstructor
public class UserAuthController {

    private final ModelMapper modelMapper;

    @PostMapping("user")
    public ResponseEntity<List<String>> createNewUser(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @GetMapping("user")
    public ResponseEntity<List<String>> getUser(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PutMapping("user")
    public ResponseEntity<List<String>> updateUser(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(new ArrayList<>());
    }

    @DeleteMapping("user")
    public ResponseEntity<List<String>> deleteUser(@Valid @RequestBody UserDto request) {
        return ResponseEntity.ok(new ArrayList<>());
    }


}
