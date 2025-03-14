package com.bookameet.meetingRoomService.service;

import com.bookameet.meetingRoomService.dal.UserRepository;
import com.bookameet.meetingRoomService.dto.UserDto;
import com.bookameet.meetingRoomService.model.User;
import jakarta.ws.rs.NotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserProfileService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public User saveUserDetails(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return userRepository.save(user);
    }

    public User getUserDetails(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return userRepository.findById(user.getUsername()).orElseThrow(() -> new NotFoundException("No details found"));
    }

    public User updateUserDetails(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        if (!userRepository.findById(user.getUsername()).isEmpty()) {
            return userRepository.save(user);
        } else {
            throw new NotFoundException("No details found");
        }
    }

    public void deleteUserDetails(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        if (!userRepository.findById(user.getUsername()).isEmpty()) {
            userRepository.deleteById(user.getUsername());
        } else {
            throw new NotFoundException("No details found");
        }
    }


}
