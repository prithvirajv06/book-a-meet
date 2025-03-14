package com.bookameet.bookingService.dto.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoomResponse {
    String message;
    Boolean status;
}
