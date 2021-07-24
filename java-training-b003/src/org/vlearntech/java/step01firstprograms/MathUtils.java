package org.vlearntech.java.step01firstprograms;

public class MathUtils {

	public static int findSum(int a, int b) {
		System.out.println(a); // 10
		a = a + 10; // 20
		System.out.println(a); // 20
		return a + b; // 40
	}

	public static int findProduct(int a, int b) {
		return a * b;
	}

	public static int findDifference(int a, int b) {
		return Math.abs(a - b);
	}
//
//	public static void main(String[] args) {
//		int sum = findSum(10, 20);
//		int product = findProduct(10, 20);
//		int diff = findDifference(10, 20);
//
//		System.out.println(sum);
//		System.out.println(product);
//		System.out.println(diff);
//	}

}
