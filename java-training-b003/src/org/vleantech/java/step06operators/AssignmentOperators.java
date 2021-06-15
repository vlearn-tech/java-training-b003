package org.vleantech.java.step06operators;

public class AssignmentOperators {
	public static void main(String[] args) {
		int a = 20; // assignment equals
		System.out.println("a = " + a);

		a = a + 10; //
		System.out.println("a = a + 10; a = " + a);

		a = a - 5;
		System.out.println("a = a - 5; a = " + a);

		System.out.println("\n\nUsing new assignment operators");
		a = 20;
		a += 10; // same as a = a + 10
		System.out.println("a += 10; a = " + a);

		a -= 5; // same as a = a - 5
		System.out.println("a -= 5; a = " + a);

	}
}
