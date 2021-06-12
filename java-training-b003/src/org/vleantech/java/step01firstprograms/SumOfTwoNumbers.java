package org.vleantech.java.step01firstprograms;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 20;

		int result = MathUtils.findSum(number1, number2);

		System.out.println(number1); // 10

//		int sum = number1 + number2;
//		int result = MathUtils.findSum(number1, number2);

		System.out.println(result); // 40
	}
//
//	public static int doSomethingNiceWithTwoNumbers(int a, int b) {
//		return a * b;
//	}

}
