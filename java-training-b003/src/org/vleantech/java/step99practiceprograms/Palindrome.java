package org.vleantech.java.step99practiceprograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the word : ");
		String word = scanner.nextLine();
		scanner.close();

		System.out.println("Palindrome? : " + isPalindrome(word));
	}

	// Accept a string
	// Reverse the string
	// Check if reversed string is same as the accepted string
	private static boolean isPalindrome(String word) {
		String reversedWord = reverseWord(word);
		System.out.println("Reversed word : " + reversedWord);
		return word.equalsIgnoreCase(reversedWord) ? true : false;
	}

	private static String reverseWordOldWay(String word) {
		char[] letters = word.toCharArray();
		String reversedWord = "";
		for (int i = letters.length - 1; i >= 0; i--) {
			reversedWord = reversedWord.concat(String.valueOf(letters[i]));
		}
		return reversedWord;
	}

	private static String reverseWord(String word) {
		return new StringBuilder(word).reverse().toString();
	}

}
