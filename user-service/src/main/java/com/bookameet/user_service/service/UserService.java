package com.bookameet.user_service.service;

import com.bookameet.user_service.dal.UserRepository;
import com.bookameet.user_service.dto.UserDto;
import com.bookameet.user_service.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public User saveUser(UserDto userDto) {
        User userToSave = null;
        String encodedPassword = passwordEncoder.encode(userDto.getPassword());
        userToSave = User.builder().username(userDto.getUsername()).password(encodedPassword).build();
        return userRepository.save(userToSave);
    }


}
