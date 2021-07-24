package org.vlearntech.java.step19polymorphism;

public class SumUtils {

	// varargs - variable number of arguments - this is treated as an array, but passing parameters is much more
	// flexible
	static Integer sum(Integer... nums) {
		System.out.println("Varargs method called");
		Integer sum = 0;
		for (Integer i : nums) {
			sum += i;
		}
		return sum;
	}

//	static Integer sum(int a, int b) {
//		System.out.println("2 param method called");
//		return a + b;
//	}
//
//	static int sum(int a, int b, int c) {
//		System.out.println("3 param method called");
//		return a + b + c;
//	}

	static Double sum(Double... nums) {
		System.out.println("Double varargs method called");
		Double sum = 0.0;
		for (Double i : nums) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(SumUtils.sum(1));
		System.out.println(SumUtils.sum(10, 20, 30));
		System.out.println(SumUtils.sum(10, 20, 30, 40));
		System.out.println(SumUtils.sum(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));

		System.out.println(sum(10, 20));
		System.out.println(sum(10.5, 20.7));

	}
}
