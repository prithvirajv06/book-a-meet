package com.bookameet.meetingRoomService.dto.response;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenDto {
    private String token;
}
