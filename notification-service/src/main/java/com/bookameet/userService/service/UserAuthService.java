package com.bookameet.userService.service;

import com.bookameet.userService.dal.UserRepository;
import com.bookameet.userService.dto.UserDto;
import com.bookameet.userService.dto.request.LoginRequest;
import com.bookameet.userService.dto.response.TokenDto;
import com.bookameet.userService.enums.Role;
import com.bookameet.userService.exceptions.WrongCredentialsException;
import com.bookameet.userService.model.User;
import jakarta.ws.rs.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserAuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;

    public User saveUser(UserDto userDto) {
        User userToSave = null;
        String encodedPassword = passwordEncoder.encode(userDto.getPassword());
        userToSave = User.builder().username(userDto.getUsername()).password(encodedPassword).role(Role.USER).build();
        return userRepository.save(userToSave);
    }

    public TokenDto login(LoginRequest request) {
        Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        if (authenticate.isAuthenticated())
            return TokenDto
                    .builder()
                    .token(jwtService.generateToken(request.getUsername()))
                    .build();
        else throw new WrongCredentialsException("Wrong credentials");
    }


    public User getUserByUsername(String username) {
        return findUserByUsername(username);
    }

    protected User findUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new NotFoundException("User not found"));
    }

}
