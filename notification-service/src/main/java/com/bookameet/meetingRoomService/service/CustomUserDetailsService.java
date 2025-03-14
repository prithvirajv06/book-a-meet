package com.bookameet.meetingRoomService.service;


import com.bookameet.meetingRoomService.dal.UserRepository;
import com.bookameet.meetingRoomService.dto.UserDto;
import com.bookameet.meetingRoomService.model.User;
import jakarta.ws.rs.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(() -> new NotFoundException("User not found"));
        assert user != null;
        return new CustomUserDetails(modelMapper.map(user, UserDto.class));
    }
}