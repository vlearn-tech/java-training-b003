package org.vleantech.java.step10dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDates {
	public static void main(String[] args) {
		// Get/Print all the zone ids in Java
//		for (String zone : ZoneId.getAvailableZoneIds()) {
//			System.out.println(zone);
//		}

		ZonedDateTime timeInSingapore = ZonedDateTime.now(ZoneId.of("Singapore"));
		System.out.println(timeInSingapore);

		LocalDate localMeetingDate = LocalDate.of(2021, 6, 24);
		LocalDateTime localMeetingTime = LocalDateTime.of(localMeetingDate, LocalTime.of(13, 0));
		ZonedDateTime meetingTimeInIndia = ZonedDateTime.of(localMeetingTime, ZoneId.of("Asia/Kolkata"));
		System.out.println(meetingTimeInIndia);

		ZonedDateTime meetingTimeInSGT = meetingTimeInIndia.withZoneSameInstant(ZoneId.of("Singapore"));
		System.out.println(meetingTimeInSGT);

		// "Singapore"
		// "Asia/Kolkata"

	}
}
