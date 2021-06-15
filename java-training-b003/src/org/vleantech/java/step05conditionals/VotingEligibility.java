package org.vleantech.java.step05conditionals;

public class VotingEligibility {

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

//		int age = 18;
//		String citizenship = "IN";
//		String residingCountry = "IN";
//
//		if (citizenship.equals("IN") && age >= 18 && residingCountry.equals("IN")) {
//			System.out.println("Eligible to vote");
//		} else {
//			System.out.println("Not eligible to cast vote");
//		}

		Person sonal = new Person();
		sonal.name = "Sonalika";
		sonal.age = 24;
		sonal.citizenship = "IN";
		sonal.residingCountry = "IN";

		Person sudeep = new Person();
		sudeep.name = "Sudeep";
		sudeep.age = 24;
		sudeep.citizenship = "IN";
		sudeep.residingCountry = "AU";

		Person sharmila = new Person();
		sharmila.name = "Sharmila";
		sharmila.age = 17;
		sharmila.citizenship = "IN";
		sharmila.residingCountry = "IN";

		System.out.println("\n\n=========== O P T I O N   1 =================");
		System.out.println(
				checkAndPrintVotingEligibility(sonal.name, sonal.age, sonal.citizenship, sonal.residingCountry));
		System.out.println(
				checkAndPrintVotingEligibility(sudeep.name, sudeep.age, sudeep.citizenship, sudeep.residingCountry));
		System.out.println(checkAndPrintVotingEligibility(sharmila.name, sharmila.age, sharmila.citizenship,
				sharmila.residingCountry));

		System.out.println("\n\n=========== O P T I O N   2 =================");
		System.out.println(checkAndPrintVotingEligibility(sonal));
		System.out.println(checkAndPrintVotingEligibility(sudeep));
		System.out.println(checkAndPrintVotingEligibility(sharmila));

		System.out.println("\n\n=========== O P T I O N   3 =================");
		// Validate for Sonal
		if (sonal.citizenship.equals("IN") && sonal.age >= 18 && sonal.residingCountry.equals("IN")) {
			System.out.println("Sonal is eligible to vote");
		} else {
			System.out.println("Sonal is not eligible to cast vote");
		}

		// Validate for Sudeep
		if (sudeep.citizenship.equals("IN") && sudeep.age >= 18 && sudeep.residingCountry.equals("IN")) {
			System.out.println("Sudeep is eligible to vote");
		} else {
			System.out.println("Sudeep is not eligible to cast vote");
		}

		// Validate for Sharmila
		if (sharmila.citizenship.equals("IN") && sharmila.age >= 18 && sharmila.residingCountry.equals("IN")) {
			System.out.println("Sharmila is eligible to vote");
		} else {
			System.out.println("Sharmila is not eligible to cast vote");
		}
	}

	private static String checkAndPrintVotingEligibility(String name, int age, String citizenship,
			String residingCountry) {
		String result = "";
		if (citizenship.equals("IN") && age >= 18 && residingCountry.equals("IN")) {
			result = name + "is eligible to vote";
		} else {
			result = name + "is not eligible to cast vote";
		}
		return result;
	}

	private static String checkAndPrintVotingEligibility(Person person) {
		String result = "";
		if (person.citizenship.equals("IN") && person.age >= 18 && person.residingCountry.equals("IN")) {
			result = person.name + "is eligible to vote";
		} else {
			result = person.name + "is not eligible to cast vote";
		}
		return result;
	}

}

class Person {
	String name;
	int age = 18;
	String citizenship = "IN";
	String residingCountry = "IN";
}
