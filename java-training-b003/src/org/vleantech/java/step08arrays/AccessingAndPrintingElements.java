package org.vleantech.java.step08arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AccessingAndPrintingElements {
	public static void main(String[] args) {

		// Create an array of size 10
		int[] numbers = new int[10];

		// Each of the 10 elements - populate with a random positive integer < 100
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			numbers[i] = random.nextInt(100);
		}

//		numbers[0] = random.nextInt(100);
//		numbers[1] = random.nextInt(100);
//		numbers[2] = random.nextInt(100);
//		numbers[3] = random.nextInt(100);
//		numbers[4] = random.nextInt(100);
//		numbers[5] = random.nextInt(100);
//		numbers[6] = random.nextInt(100);
//		numbers[7] = random.nextInt(100);
//		numbers[8] = random.nextInt(100);
//		numbers[9] = random.nextInt(100);

		// Print the entire array in one shot
		System.out.println(Arrays.toString(numbers));

		// Print the 5th element of the array
		System.out.println("The 5th element in the array is : " + numbers[4]);

		// Check if the 3rd element of the array is greater than the 8th element of the array

		System.out.println(numbers[2] > numbers[7] ? "3rd element is greater than 8th element"
				: "3rd element is not greater than 8th element");

		// Check if 4th element is equal to 6th element of the array
		System.out.println(
				numbers[3] == numbers[5] ? "4th and 6th elements are equal" : "4th and 6th elements are NOT equal");

		// Find out the sum of 4th, 7th and 9th element of the array
		System.out.println("Sum of 4th, 7th and 9th elements is " + (numbers[3] + numbers[6] + numbers[8]));

		// Print each array element in a separate line
		System.out.println("=========== O P T I O N   1   -    F O R  ================");
		for (int idx = 0; idx < numbers.length; idx++) {
			System.out.println(numbers[idx]);
		}

		System.out.println("=========== O P T I O N   2   -    E N H A N C E D     F O R  ================");
		for (int num : numbers) {
			System.out.println(num);
		}

		// Find the greatest number in the array
		int greatest = 0;
		for (int num : numbers) {
			greatest = num > greatest ? num : greatest;
		}
		System.out.println("Greatest number is " + greatest);

		// Check if the entered value is present in the array

		Scanner scanner = new Scanner(System.in);
		System.out.println("Guess a number to win jackpot : ");
		int guessedNumber = Integer.valueOf(scanner.nextLine());
		scanner.close();

		System.out.println("=========== O P T I O N   1   -    L O O P   A N D   F I N D   ================");
		String message = "Sorry, better luck next time";
		for (int num : numbers) {
			if (num == guessedNumber) {
				message = "Yipppeeeee!! Your won the jackpot!!!!!!!";
				break;
			}
		}
		System.out.println(message);

		System.out.println(
				"=========== O P T I O N   2   -    U S I N G     B I N A R Y    S E A R C H  ================");
		Arrays.sort(numbers);
		System.out.println("Sorted Array : " + Arrays.toString(numbers));

		int search = Arrays.binarySearch(numbers, guessedNumber);
		System.out.println(search < 0 ? "Sorry, better luck next time" : "Yipppeeeee!! Your won the jackpot!!!!!!!");

	}
}
