package org.vlearntech.java.step16regex;

public class RegexForDate {
	public static void main(String[] args) {
		String dateStr = "15/8/1947";

		System.out.println(dateStr.matches("[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}"));
		System.out.println(dateStr.matches("\\d{1,2}/\\d{1,2}/\\d{4}"));

		dateStr = "15-8-1947";

		System.out.println(dateStr.matches("[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}"));
		System.out.println(dateStr.matches("\\d{1,2}-\\d{1,2}-\\d{4}"));

	}
}
