package org.vleantech.java.step01firstprograms;

public class NewHelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello to the world of Java");
		int num1 = 20;
		int num2 = 30;

		int calculatedSum = findSumOfNumbers(20, 30); // pass parameters
		print(calculatedSum);

		print(findDiffOfNumbers(400, 300)); // pass parameters

		// hello >> Hello

		String newValue = convertWordToInitcap("result");
		System.out.println(newValue);

		String result = formatOutput(newValue, calculatedSum); // Result=50
		System.out.println(result);
	}

	private static String formatOutput(String newValue, int calculatedSum) {
		return String.format("%s=%d", newValue, calculatedSum);
	}

	private static String convertWordToInitcap(String input) { // accept arguments
		String result = String.valueOf(input.charAt(0)).toUpperCase() + input.substring(1);
		return result;
	}

	private static void print(int valueToPrint) {
		System.out.println(valueToPrint);
	}

	private static int findSumOfNumbers(int a, int b) { // accept arguments
		int sum = a + b;
		return sum;
	}

	private static int findDiffOfNumbers(int a, int b) { // accept arguments
		return a - b;
	}

}