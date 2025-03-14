package com.bookameet.meetingRoomService.dal;

import com.bookameet.meetingRoomService.enums.UserStatus;
import com.bookameet.meetingRoomService.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    List<User> findAllByActive(UserStatus active);

}
