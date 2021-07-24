package org.vlearntech.java.step06operators;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number whose factorial needs to be calculated : ");
		Long number = Long.valueOf(scanner.nextLine());
		scanner.close();
//		System.out.println(Long.MAX_VALUE);
		System.out.println("Factorial of " + number + " is " + getFactorial(number));
	}

	// n! = n * (n-1)!
	// getFactorial(n) = n * getFactorial(n-1);

	private static Long getFactorial(Long number) {
//		if (number == 1) {
//			return 1;
//		} else {
//			return number * getFactorial(number - 1);
//		}

		return number == 1 ? 1 : number * getFactorial(--number);
	}
}
