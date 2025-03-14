package com.bookameet.meetingRoomService.dal;

import com.bookameet.meetingRoomService.model.MeetingRoom;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetingRoomRepository extends MongoRepository<MeetingRoom, String> {


}
