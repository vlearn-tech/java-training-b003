package org.vleantech.java.step10dates;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenDates {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.parse("29/12/2021", DateTimeFormatter.ofPattern("d/M/yyyy"));
		LocalDate date2 = LocalDate.of(2000, 1, 9);

		System.out.println(String.format("First date is : %s and Second date is : %s", date1, date2));

		// Find the number of days between the dates

		System.out.println(ChronoUnit.DAYS.between(date2, date1));
		System.out.println(ChronoUnit.MONTHS.between(date2, date1));
		System.out.println(ChronoUnit.YEARS.between(date2, date1));
		System.out.println(ChronoUnit.WEEKS.between(date2, date1));

		Period per = Period.between(date2, date1);
		System.out.println(per);
		System.out.println(per.getDays());

	}
}
