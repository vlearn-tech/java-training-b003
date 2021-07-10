package org.vleantech.java.step99practiceprograms;

import java.util.Scanner;

public class StripTrailingZeroes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number : ");
		Long number = Long.valueOf(scanner.nextLine());
		scanner.close();
		System.out.println(findNumberCode(number));
	}

	private static Integer findNumberCode(Long number) {
		while (number % 10 == 0) {
			number = number / 10;
		}
		return (int) (number % 1000);
	}

}

// 237546325462354000 = 354 
// 20 = 2
// 2030 = 203
// 2000340000 = 34
// 23423423 = 423
// 23 = 23

// Happy Birthday!!!!!!!!! = Happy Birthday
