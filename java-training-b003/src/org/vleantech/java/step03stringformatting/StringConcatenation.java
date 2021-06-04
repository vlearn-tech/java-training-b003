package org.vleantech.java.step03stringformatting;

public class StringConcatenation {
	public static void main(String[] args) {
		String message = "Hello";

		// Concat using the + operator
		String newMessage = message + " World";

		// Concat using the concat function
		String yetAnotherNewMessage = message.concat(" to the world of Java");

		System.out.println(message);
		System.out.println(newMessage);
		System.out.println(yetAnotherNewMessage);

		// Two ways to concat Strings
		// 1 - Use the + operator
		// 2 - Use the concat function

	}
}
