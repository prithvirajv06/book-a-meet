package com.bookameet.bookingService.service;

import com.bookameet.commons.events.MeetingRoomEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class MeetingRoomEventConsumer {

    @KafkaListener(topics = MeetingRoomEvent.TOPIC, groupId = "SAGA_GROUP")
    public void listen(String message) {
        log.info("Received message: {}", message);

    }

}
