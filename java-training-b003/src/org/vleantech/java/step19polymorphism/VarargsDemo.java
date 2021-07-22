package org.vleantech.java.step19polymorphism;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class VarargsDemo {
	public static void main(String[] args) {
		calculateAndPrintAvgGrade("Suresh", 8.5, 8.6, 8.3);
		calculateAndPrintAvgGrade("Ramesh", 8.8, 8.4, 8.5, 9.0, 8.7);
		calculateAndPrintAvgGrade("Naresh", 8.7);
		calculateAndPrintAvgGrade("Paresh", 8.5, 8.7, 8.6);
	}

	// Varargs have to be the last parameter and only one set of varargs can be used in a method
	private static void calculateAndPrintAvgGrade(String name, Double... marks) {
		Double totalMarks = 0.0;
		for (Double mark : marks) {
			totalMarks += mark;
		}

		BigDecimal avgMarks = BigDecimal.valueOf(totalMarks / marks.length).setScale(2, RoundingMode.HALF_EVEN);

		System.out
				.println(String.format("Average marks of %s across %d semesters is %s", name, marks.length, avgMarks));
	}

}
