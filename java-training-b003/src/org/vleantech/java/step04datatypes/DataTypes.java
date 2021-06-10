package org.vleantech.java.step04datatypes;

public class DataTypes {
	public static void main(String[] args) {
		boolean isMarried = true; // Boolean is the wrapper data type
		char gender = 'M';
		char grade = 65; // 65 is ascii code of 'A'

		byte noOfDoctorVisits = 0;
		short drivenKm = 1_000;
		int salary = 50_000;
		long population = 2_500_000_000L; // Need to put the letter 'L' at the end, else Java considers this as a long
											// value

		float cgpa = 8.3f; // Need to put the letter 'f' at the end, else Java considers this as a double value
		double gpa = 8.3;

		String eligibleToVote = "TRUE";

		Boolean isEligibleToVote = Boolean.valueOf(eligibleToVote);

		if (isEligibleToVote) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		int age = Integer.valueOf("35");

		System.out.println("isMarried = " + isMarried);
		System.out.println("gender = " + gender);
		System.out.println("grade = " + grade); // 'A' will be printed

		System.out.println("noOfDoctorVisits = " + noOfDoctorVisits);
		System.out.println("drivenKm = " + drivenKm);
		System.out.println("salary = " + salary);
		System.out.println("population = " + population);

		System.out.println("=================================");

		System.out.println(Integer.SIZE);

		long someNumber = 2_342_342_432L;

	}
}
