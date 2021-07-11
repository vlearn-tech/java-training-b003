package org.vleantech.java.step90miniproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtils {
	public static LocalDate parseIntoDate(String dateString) {
		// if the dateString if of pattern M/d/yyyy - then use the formatter as needed
		if (dateString.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
			return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("M/d/yyyy"));
		}
		// if the dateString if of pattern d-M-yyyy - then use the formatter as needed
		if (dateString.matches("\\d{1,2}-\\d{1,2}-\\d{4}")) {
			return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d-M-yyyy"));
		}
		return null;
	}
}
