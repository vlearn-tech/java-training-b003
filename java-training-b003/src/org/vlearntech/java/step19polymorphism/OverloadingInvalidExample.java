package org.vlearntech.java.step19polymorphism;

public class OverloadingInvalidExample {

	public double someCalculation(int a, int b) {
		System.out.println("someCalculation(int a, int b)");
		return a * b;
	}

	public double someCalculation(short a, short b) {
		System.out.println("someCalculation(short a, short b)");
		return a * b;
	}

	public double someCalculation(double a, int b) {
		System.out.println("someCalculation(double a, int b)");
		return a * b;
	}

	public double someCalculation(int a, double b) {
		System.out.println("someCalculation(int a, double b)");
		return a * b;
	}

	public static void main(String[] args) {
		OverloadingInvalidExample ex = new OverloadingInvalidExample();
		ex.someCalculation(10, 15);
		ex.someCalculation((short) 10, (short) 15);
		ex.someCalculation(10, 15.0);
		ex.someCalculation(10.0, 15);

	}

}
