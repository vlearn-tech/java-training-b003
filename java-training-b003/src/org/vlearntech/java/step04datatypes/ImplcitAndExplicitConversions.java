package org.vlearntech.java.step04datatypes;

public class ImplcitAndExplicitConversions {
	public static void main(String[] args) {

		byte noOfSkips = 100; // implicit conversion
		short drivenKm = 1_000;
		int salary = 50_000;

		int calculatedNumOfVisits = 100;
		byte noOfDoctorVisits = (byte) calculatedNumOfVisits; // explicit conversion
		long someValue = calculatedNumOfVisits; // implicit conversion

		System.out.println(noOfDoctorVisits);
	}
}
