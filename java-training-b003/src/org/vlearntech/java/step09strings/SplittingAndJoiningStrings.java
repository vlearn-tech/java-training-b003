package org.vlearntech.java.step09strings;

import java.util.Arrays;

public class SplittingAndJoiningStrings {
	public static void main(String[] args) {

		// Splitting
		String message = "I like to program in Java";
		String[] words = message.split(" ");

		for (String word : words) {
			System.out.println(word);
		}

		String[] letters = message.split("");
		System.out.println(Arrays.toString(letters));

		// Joining
		System.out.println("\n\n================ J O I N   S T R I N G S  =============");

		String[] names = { "Abhijit", "Brijesh", "Charlie" };
//		String valueToPrint = names[0];
//		for (int i = 1; i < names.length; i++) {
//			valueToPrint = valueToPrint + ", " + names[i];
//		}

//		System.out.println(valueToPrint);
		System.out.println(String.join(", ", names));

		String[] inputWords = { "It", "is", "raining", "outside", "right", "now" };

		String sentence = String.join(" ", inputWords);
		System.out.println(sentence);

		System.out.println(
				"\n\n================ S P L I T      W I T H      M U L T I P L E      D E L I M I T E R S =============");
		String messageWithPunctuation = "Hello World, I am learning Java! I am loving it. What about you?";
		String[] newWords = messageWithPunctuation.split(" |\\.|\\?|,|!");

		for (String word : newWords) {
			System.out.println(word);
		}
	}
}
