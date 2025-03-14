package com.bookameet.meetingRoomService.service;

import com.bookameet.commons.events.MeetingRoomEvent;
import com.bookameet.commons.events.actions.MeetingRoomActions;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class MeetingRoomEventConsumer {

    @KafkaListener(topics = MeetingRoomEvent.TOPIC, groupId = "SAGA_GROUP")
    public void listen(MeetingRoomEvent meetingRoomEvent) {
        switch (meetingRoomEvent.getMeetingRoomActions()) {
            case UPDATE_AMENITIES -> {
                updateAmenities();
                break;
            }
            case UPDATE_ROOM_OCCUPANCY -> {
                updateRoomOccupancy();
                break;
            }
            case DELETE_OCCUPANCY -> {
                deleteOccupancy();
                break;
            }
        }
    }

    private void updateAmenities(){

    }

    private void updateRoomOccupancy(){

    }

    private void deleteOccupancy(){

    }
}
