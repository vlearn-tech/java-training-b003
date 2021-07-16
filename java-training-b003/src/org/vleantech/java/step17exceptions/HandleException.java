package org.vleantech.java.step17exceptions;

import java.util.Scanner;

public class HandleException {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		Integer number = null;

		try {
			number = Integer.valueOf(input);
			if (123450 % number == 0) {
				System.out.println("Number divides 123450");
			} else {
				System.out.println("Number is not a factor of 123450");
			}
		} catch (NumberFormatException | ArithmeticException ex) {
			System.out.println("There was problem with input : " + ex.getMessage());
//			ex.printStackTrace();
		} finally {
			System.out.println("Thanks for playing.");
		}
	}
}
