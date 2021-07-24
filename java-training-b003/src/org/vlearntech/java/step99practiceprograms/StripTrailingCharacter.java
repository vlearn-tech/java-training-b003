package org.vlearntech.java.step99practiceprograms;

import java.util.Scanner;

public class StripTrailingCharacter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the message : ");
		String message = scanner.nextLine();
		scanner.close();
		System.out.println(formalizeMessage(message));
	}

	private static String formalizeMessage(String message) {
		return message.replaceAll("!", " ").stripTrailing().replaceAll(" ", "!");
//		StringBuilder sb = new StringBuilder(message);
//		sb = new StringBuilder(sb.reverse().toString().replaceAll("!", " ").trim().replaceAll(" ", "!"));
//		return sb.reverse().toString();
	}
}

//!!Happy!!Birthday!!!!!!!!! = !!Happy!!Birthday

//reverse HappyBirthday!!!!!!!!! >> !!!!!!!yad
//replace all ! with ' ' 
//trim
//reverse back and send

// HappyBirthday!!!!!!!!! >> HappyBirthday

// !!Happy!!Birthday!!!!!!!!!
//   Happy  Birthday         
//   Happy  Birthday
// !!Happy!!Birthday
