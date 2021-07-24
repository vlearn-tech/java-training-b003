package org.vlearntech.java.step03stringformatting;

public class PrintingAndFormatting {
	public static void main(String[] args) {
		String name = "Pratyush";
		int age = 10;

		System.out.println("Name is " + name + " and age is " + age);

		System.out.print(String.format("Name is %s and age is %d", name, age));
		System.out.printf("\nName is %s and age is %d", name, age);

		System.out.println(String.format("\nName is %s and age is %d", name, age));
		System.out.printf("Name is %s and age is %d", name, age).println();

	}
}
