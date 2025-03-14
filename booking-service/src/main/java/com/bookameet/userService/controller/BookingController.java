package com.bookameet.userService.controller;


import com.bookameet.userService.dto.request.BookingRequest;
import com.bookameet.userService.dto.response.BookingResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/v1/booking")
public class BookingController {

    @PostMapping("/book-room")
    public BookingResponse bookMeetingRoom(@RequestBody BookingRequest bookingRequest){

    }
}
