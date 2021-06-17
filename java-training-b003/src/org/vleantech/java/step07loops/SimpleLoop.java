package org.vleantech.java.step07loops;

public class SimpleLoop {
	public static void main(String[] args) {
		int whichTableToPrint = 6;
		int count = 0;

		System.out.println("\n========= W H I L E   L O O P ===============");
		while (count < 10) {
			System.out.println(String.format("%d * %d = %d", whichTableToPrint, ++count, whichTableToPrint * count));
		}

		count = 0;
		System.out.println("\n========= D O   W H I L E   L O O P ===============");
		do {
			System.out.println(String.format("%d * %d = %d", whichTableToPrint, ++count, whichTableToPrint * count));
		} while (count < 10);

		System.out.println("\n========= F O R   L O O P ===============");
		for (int tableCount = 1; tableCount <= 20; tableCount++) {
			System.out.println(String.format("%d * %d = %d", whichTableToPrint, tableCount, whichTableToPrint * tableCount));
		}

		// If you know a condition till which loop has to continue running - use while
		// If you know how many times you want to run a loop - use for
		// Avoid do-while as much as possible

//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
//		System.out.println(String.format("%d * %d = %d", table, ++count, table * count));
	}
}
