package org.vlearntech.java.step03stringformatting;

public class StringPrinting {
	public static void main(String[] args) {
		String message1 = "Hello World. ";
		String message2 = "We are learning Java";

		System.out.println("====== P R I N T ========");

		System.out.print(message1);
		System.out.print(message2);

		System.out.println("\n\n====== P R I N T ln ========");

		System.out.println(message1);
		System.out.println(message2);

		// Three ways to print
		// 1 - use print - no new line at the end. Cursor stays on same line
		// 2 - use println - a new line at the end. same as print + "\n"
		// 3 - use printf - combination of print and String.format - convenience method (refer to PrintingAndFormatting)

	}
}
