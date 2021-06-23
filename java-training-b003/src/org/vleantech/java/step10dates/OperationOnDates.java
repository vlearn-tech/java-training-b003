package org.vleantech.java.step10dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OperationOnDates {
	public static void main(String[] args) {
		// Operate on dates
		// Enter your birth date in dd-MMM-yyyy format
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your birthdate in the format dd-MMM-yyyy : ");
//		String dateStr = scanner.nextLine();
//		scanner.close();

		String dateStr = "9-Dec-1998";

		LocalDate birthDate = LocalDate.parse(dateStr, DateTimeFormatter.ofPattern("d-MMM-yyyy"));

		// Find out the following

		System.out.println("Birthday - " + birthDate);

		// Which day of week you were born
		System.out.println("Day of week - " + birthDate.getDayOfWeek());

		// When will you celebrate your 50th birthday
		System.out.println("50th birthday - " + birthDate.plusYears(50));

		// YOu had a grand party on your 10th birthday. When was that?
		System.out.println("10th birthday - " + birthDate.plusYears(10));

		// On which day did you turn 5000 days old
		System.out.println("5000 days - " + birthDate.plusDays(5000));

		// On which date were you 11 years, 22 months, 33 days old
		System.out.println("11 years, 22 months, 33 days - " + birthDate.plusYears(11).plusMonths(22).plusDays(33));

		// Which date was 2 months, 3 days, back previous year
		LocalDate someDate = LocalDate.now().minusYears(1).minusMonths(2).minusDays(3);
		System.out.println(
				"2 months, 3 days, back previous year - " + someDate);
	}
}
