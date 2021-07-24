package org.vlearntech.java.step10dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParseDates {
	public static void main(String[] args) {
		// Either set a date if you know the values, or else, you may want to parse String as a date
		// Input a date and print the date value
		LocalDate birthDate = LocalDate.of(2000, 6, 13);
		System.out.println(birthDate);

		String bdStr = "1998-05-24";
		LocalDate bdDate = LocalDate.parse(bdStr);
		System.out.println(bdDate);

		DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern("d-M-yyyy");// d - Date; M - month;
																					// m - minute; yyyy - 4 digit year
		String indDay = "15-08-1947";
		LocalDate indDate = LocalDate.parse(indDay, defaultFormat);

		System.out.println(indDate);

		DateTimeFormatter defaultFormat2 = DateTimeFormatter.ofPattern("M/d/yyyy");// d - Date; M - month;
		// m - minute; yyyy - 4 digit year
		String indDay2 = "08/15/1947";
		LocalDate indDate2 = LocalDate.parse(indDay2, defaultFormat2);

		System.out.println(indDate2);

	}
}
