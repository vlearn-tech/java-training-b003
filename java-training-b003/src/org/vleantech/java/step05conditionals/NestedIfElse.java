package org.vleantech.java.step05conditionals;

import java.util.Random;
import java.util.Scanner;

public class NestedIfElse {
	public static void main(String[] args) {
		// Get the name, age of a person and state if the person is a minor or an adult

		getRandomAgeAndCheckEligibility();

		// getUserInputAndCheckEligibility();

	}

	private static void getRandomAgeAndCheckEligibility() {
		String[] nameArr = { "Arun", "Bhaskar", "Carol", "Derby", "Elenor", "Frank", "Gunther", "Harold", "Jack",
				"Luther" };
		Random random = new Random();
		String name = nameArr[random.nextInt(nameArr.length)];
		int age = 1 + random.nextInt(99);
		printResult(name, age);
	}

	private static void getUserInputAndCheckEligibility() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your name : "); // Ask for name
		String name = scanner.nextLine();

		System.out.println("Enter your age : "); // Ask for age
		int age = scanner.nextInt();

		scanner.close(); // close the scanner

		printResult(name, age);
	}

	private static void printResult(String name, int age) {
		System.out.println(String.format("Eligbility of %s (%d) : %s", name, age, getEligibility(age)));
	}

	private static String getEligibility(int age) {
		String status = "";
		if (age > 60) {
			if (age % 10 == 0) {
				status = "Its your lucky year!! You are eligible for 1.5% additional interest";
			} else {
				status = "Eligible for 1% additional interest due to Senior Citizenship";
			}
		} else {
			if (age < 18) {
				status = "Eligible for 0.5% additional interest due to Student Enrolment";
			} else {
				status = "No additional interest applicable for your age group";
			}
		}
		return status;
	}

}
