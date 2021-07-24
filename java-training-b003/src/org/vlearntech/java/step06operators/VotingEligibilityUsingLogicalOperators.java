package org.vlearntech.java.step06operators;

public class VotingEligibilityUsingLogicalOperators {

	// Get the age, and the nationality of a person, and current country

	// A person is eligible to vote if and only if all the three conditions are met

	// a. Person should be an Indian Citizen.
	// b. He/She should be at least 18 years old
	// c. Person is currently residing in India

	// a. Person should be an Indian Citizen.
	// b. He/She should be at least 18 years old
	// c. Person is currently not residing in India
	// d. Person has registered for mail based voting

	public static void main(String[] args) {

		int age = 18;
		String citizenship = "IN";
		String residingCountry = "UK";
		boolean isRegistered = true;

		/*
		 * // all are joined with && - all conditions need to be satisfied if (citizenship.equals("IN") && age >= 18 &&
		 * residingCountry.equals("IN")) { System.out.println("Eligible to vote"); } else {
		 * System.out.println("Not eligible to cast vote"); }
		 * 
		 * // all are joined with && - all conditions need to be satisfied if (citizenship.equals("IN") && age >= 18 &&
		 * !residingCountry.equals("IN") && isRegistered != false) { System.out.println("Eligible to vote"); } else {
		 * System.out.println("Not eligible to cast vote"); }
		 */

		if (residingCountry.equals("IN")) {
			if (citizenship.equals("IN") && age >= 18) {
				System.out.println("Eligible to vote");
			} else {
				System.out.println("Not eligible to cast vote");
			}
		} else {
			if (citizenship.equals("IN") && age >= 18 && isRegistered != false) {
				System.out.println("Eligible to vote");
			} else {
				System.out.println("Not eligible to cast vote");
			}
		}

		if (citizenship.equals("IN") && age >= 18
				&& (residingCountry.equals("IN") || (!residingCountry.equals("IN") && isRegistered == true))) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Not eligible to cast vote");
		}

		// if person is in India
		// evaluate
		// else
		// evaluate

	}
}
