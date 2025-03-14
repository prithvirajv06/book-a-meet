package com.bookameet.meetingRoomService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MeetingRoomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeetingRoomServiceApplication.class, args);
	}

}
