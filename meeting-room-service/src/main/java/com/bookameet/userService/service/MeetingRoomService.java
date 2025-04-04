package com.bookameet.userService.service;

import com.bookameet.userService.dal.MeetingRoomRepository;
import com.bookameet.userService.dto.MeetingRoomDTO;
import com.bookameet.userService.model.MeetingRoom;
import jakarta.ws.rs.NotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MeetingRoomService {

    private final MeetingRoomRepository meetingRoomRepository;
    private final ModelMapper modelMapper;

    public MeetingRoom saveMeetingRoom(MeetingRoomDTO meetingRoomDTO) {
        MeetingRoom meetingRoom= modelMapper.map(meetingRoomDTO,MeetingRoom.class);
        return meetingRoomRepository.save(meetingRoom);
    }

    public void deleteMeetingRoom(MeetingRoomDTO meetingRoomDTO) {
        MeetingRoom meetingRoom= modelMapper.map(meetingRoomDTO,MeetingRoom.class);
        meetingRoomRepository.deleteById(meetingRoom.getRoomId());
    }

    public MeetingRoom updateMeetingRoom(MeetingRoomDTO meetingRoomDTO) {
        MeetingRoom meetingRoom= modelMapper.map(meetingRoomDTO,MeetingRoom.class);
        meetingRoomRepository.findById(meetingRoom.getRoomId()).orElseThrow(() -> new NotFoundException("Room docent exist"));
        return meetingRoomRepository.save(meetingRoom);
    }

    public MeetingRoom getMeetingRoom(MeetingRoomDTO meetingRoomDTO) {
        MeetingRoom meetingRoom= modelMapper.map(meetingRoomDTO,MeetingRoom.class);
        return meetingRoomRepository.findById(meetingRoom.getRoomId()).orElseThrow(() -> new NotFoundException("Room docent exist"));
    }
}
