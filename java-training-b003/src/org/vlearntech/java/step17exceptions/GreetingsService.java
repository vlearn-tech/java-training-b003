package org.vlearntech.java.step17exceptions;

import java.util.Random;

public class GreetingsService {

	public static void main(String[] args) {

		String greetingMessage = getGreeting();
		System.out.println("Today's greeting of choice " + greetingMessage);

		// Handle NPE
		if (greetingMessage != null && greetingMessage.length() == 11) {
			System.out.println("Its your lucky day too... You get a free coffee to start the day");
		}
	}

	private static String getGreeting() {
		String[] greetings = { "Good Morning", "Hola", "Hi", null, "How are you", "Hey buddy!", null }; // you might get
																										// this from
																										// some source
		Random random = new Random();
		return greetings[random.nextInt(greetings.length)];
	}
}
