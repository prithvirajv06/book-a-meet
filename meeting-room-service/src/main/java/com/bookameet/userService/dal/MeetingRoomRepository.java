package com.bookameet.userService.dal;

import com.bookameet.userService.model.MeetingRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRoomRepository extends MongoRepository<MeetingRoom, String> {


}
