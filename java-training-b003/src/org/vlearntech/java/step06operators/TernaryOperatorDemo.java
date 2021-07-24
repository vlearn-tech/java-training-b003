package org.vlearntech.java.step06operators;

import java.util.Random;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		Random random = new Random();
		int age = random.nextInt(50);
		String message = null;

//		if (age > 18) {
//			message = "Eligible to vote";
//		} else {
//			message = "Not eligible to vote";
//		}

		message = age > 18 ? "Eligible to vote" : "Not eligible to vote";
		System.out.println(message);

		int salary = 50_000;
//		float increment = 0.0f;
//
//		if (salary > 35000) {
//			increment = 5.0f;
//		} else {
//			increment = 6.5f;
//		}

		float increment = salary > 35000 ? 5.0f : 6.5f;

		salary = (int) (salary * (100.0f + increment) / 100); // business logic

		System.out.println("New salary is " + salary);
	}
}
