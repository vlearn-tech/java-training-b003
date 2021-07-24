package org.vlearntech.java.step10dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatAndPrintDate {
	public static void main(String[] args) {

		// Print dates in specific formats and get specific inputs from the dates
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss a")));

		System.out.println("Year : " + now.getYear());
		System.out.println("Hour : " + now.getHour());
		System.out.println("Minute : " + now.getMinute());

	}
}
