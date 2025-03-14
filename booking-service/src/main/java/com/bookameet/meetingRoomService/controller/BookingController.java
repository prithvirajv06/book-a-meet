package com.bookameet.meetingRoomService.controller;


import com.bookameet.meetingRoomService.dto.request.BookingRequest;
import com.bookameet.meetingRoomService.dto.response.BookingResponse;
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
