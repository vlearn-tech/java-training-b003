package org.vleantech.java.step09strings;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter message : ");
		String message = scanner.nextLine();
		scanner.close();
		System.out.println("Palindrome ? " + checkIfPalindrome(message));
	}

	private static boolean checkIfPalindrome(String message) {
		String reversedMessage = new StringBuilder(message).reverse().toString();
//		System.out.println(String.format("Original message : %s  Reversed mesasge : %s", message, reversedMessage));
		return message.equalsIgnoreCase(reversedMessage);
	}

}
