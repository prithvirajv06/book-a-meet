package com.bookameet.meetingRoomService.service;

import com.bookameet.commons.events.BookingEvent;
import com.bookameet.commons.events.MeetingRoomEvent;
import com.bookameet.meetingRoomService.dto.request.BookingRequest;
import com.bookameet.meetingRoomService.dto.response.BookingResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MeetingRoomService {

    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final ModelMapper modelMapper;

    @Transactional
    public void bookRoom(BookingRequest bookingRequest) {
        kafkaTemplate.send(MeetingRoomEvent.TOPIC, modelMapper.map(bookingRequest, MeetingRoomEvent.class));
    }
    @KafkaListener(topics = BookingEvent.TOPIC,groupId = "SAGA_GROUP")
    public void compensationForBooking(BookingEvent bookingEvent){
        if(bookingEvent.getStatus()){
            //do success notification
        }else{
            //do compensation activity, send failure
        }
    }
}
