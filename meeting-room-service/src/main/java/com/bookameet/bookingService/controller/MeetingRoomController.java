package com.bookameet.bookingService.controller;


import com.bookameet.bookingService.dto.MeetingRoomDTO;
import com.bookameet.bookingService.dto.response.RoomResponse;
import com.bookameet.bookingService.service.MeetingRoomService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/meeting-room-service")
@RequiredArgsConstructor
@Tag(name = "Rooms Service", description = "Room details APIs")
public class MeetingRoomController {

    private final ModelMapper modelMapper;
    private final MeetingRoomService meetingRoomService;

    @PostMapping("/room")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<MeetingRoomDTO> createRoom(@RequestBody MeetingRoomDTO meetingRoomDTO) {
        return ResponseEntity.ok(modelMapper.map(meetingRoomService.saveMeetingRoom(meetingRoomDTO), MeetingRoomDTO.class));
    }

    @GetMapping("/room")
    public ResponseEntity<MeetingRoomDTO> getRoom(@RequestBody MeetingRoomDTO meetingRoomDTO) {
        return ResponseEntity.ok(modelMapper.map(meetingRoomService.getMeetingRoom(meetingRoomDTO), MeetingRoomDTO.class));
    }

    @DeleteMapping("/room")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<RoomResponse> deleteRoom(@RequestBody MeetingRoomDTO meetingRoomDTO) {
        meetingRoomService.deleteMeetingRoom(meetingRoomDTO);
        return ResponseEntity.ok(RoomResponse.builder().message("Room deleted").status(true).build());
    }

    @PutMapping("/room")
    public ResponseEntity<MeetingRoomDTO> updateRoom(@RequestBody MeetingRoomDTO meetingRoomDTO) {
        return ResponseEntity.ok(modelMapper.map(meetingRoomService.updateMeetingRoom(meetingRoomDTO), MeetingRoomDTO.class));
    }

}
