package org.vleantech.java.step09strings;

import java.util.Arrays;

public class Strings {
	public static void main(String[] args) {
		String message = "    Hello World, I am learning Java!     ";
		System.out.println(message);

		char[] hello = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };
		System.out.println(hello);

		char[] messageChars = message.toCharArray();
		System.out.println(Arrays.toString(messageChars));

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please input a message : ");
//		message = scanner.nextLine();
//		scanner.close();

//		messageChars[0];
//		messageChars[messageChars.length - 1];

//		message.charAt(0); // messageChars[0];
//		message.charAt(message.length() - 1);  // messageChars[messageChars.length - 1];

		System.out.println("\n\n===============  P R A C T I C E ===============\n");
		// Find out the 3rd character of the message
		System.out.println("Find out the 3rd character of the message : " + message.charAt(2));

		// Find if the letter 'o' is present in the String or not
		boolean letterFound = message.contains("o");
		System.out.println("Find if the letter 'o' is present in the String or not : " + letterFound);

		// If present, find the location of the 1st occurrence of the letter 'l'
		// ... and the next occurrence of 'l'
		// ... and the last occurrence of 'l'
		if (letterFound) {
			int firstIndex = message.indexOf("l");
			System.out.println("Location of the 1st occurrence of the letter 'l' : " + firstIndex);
			System.out.println(
					"Location of the next occurrence of the letter 'l' : " + message.indexOf("l", firstIndex + 1));
			System.out.println("Location of the last occurrence of the letter 'l' : " + message.lastIndexOf("l"));
		}

		// Find the length of the message
		System.out.println("Length of the message : " + message.length());

		// Check if the string/message contains the phrase "lo" in it
		System.out.println("Find if string/message contains the phrase \"lo\" in it : " + message.contains("lo"));

		// Find out the first 4 letters of the String (substring)
		System.out.println("Find out the first 5 letters of the String (substring) : " + message.substring(0, 5));

		// Find the entire string beyond the 3rd letter (substring)
		System.out.println("Find the entire string beyond the 3rd letter (substring) : " + message.substring(2));

		// Convert the message to upper case
		System.out.println("Convert the message to upper case : " + message.toUpperCase());

		// Convert the message to lower case
		String lowerCaseMessage = message.toLowerCase();
		System.out.println("Convert the message to lower case : " + lowerCaseMessage);

		// Compare the original message to the lower case message and see if it is equal.
		System.out.println(message.equals(lowerCaseMessage) ? "Message is same as its lower case"
				: "Message is not same as its lower case");

		// Compare the same again, but this time ignoring the case sensitivity
		System.out.println("After Ignoring the case sensitivity... : "
				+ (message.equalsIgnoreCase(lowerCaseMessage) ? "Message is same as the lower case"
						: "Message is not same as its lower case"));

		// Check if the message is starting with the phrase "hello" and make this lookup case insensitive
		System.out.println("Check if the message is starting with the phrase \"heLLo\" : "
				+ message.toLowerCase().startsWith("heLLo".toLowerCase()));

		// Replace all 'a' with 'X' and all ' ' with '$'
		String encryptedMessage = message.replaceAll("l", "9").replaceAll(" ", "#");
		System.out.println("Replace all 'l' with '9' and all ' ' with '#' : " + encryptedMessage);

		// Trim all white space characters at the beginning and end of the string
		System.out
				.println("Trim all white space characters at the beginning and end of the string : " + message.trim());

		// Create an array of strings, where each element is one word within the overall message. If message has 5
		// words, then this array should have 5 elements
		String[] words = message.trim().split(" |\\.|\\,|!"); // split by ' ' or '.' or ',' or '!'. Since ',' and '.'
																// have significance in regex, hence need to be escaped
																// with \\
		System.out.println(Arrays.toString(words));

	}
}
