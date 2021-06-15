package org.vleantech.java.step06operators;

public class LogicalBitwiseOperators {
	public static void main(String[] args) {

		int i = 25;

		if (i % 5 == 0 || ++i % 5 == 0) {
			System.out.println("Jackpot");
			System.out.println("I hit jackpot at the number " + i);
		} else {
			System.out.println("Better luck next time");
		}

		// if (cond1 || cond2 || cond3)
		// comes out when it gets the first true

		// if (cond1 && cond2 && cond3)
		// comes out when it encounters the first false

		// if (cond1 | cond2 | cond3)
		// comes out only after it evaluates all conditions

		// if (cond1 & cond2 & cond3)
		// comes out only after it evaluates all conditions

	}
}
