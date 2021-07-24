package org.vlearntech.java.step05conditionals;

public class SwitchStatementDemo {

	public static void main(String[] args) {
		String word = "Cpple";
		char initialChar = word.charAt(0);

		System.out.println("\n=========== U S I N G    I F  ============");
		if (initialChar == 'A' || initialChar == 'E' || initialChar == 'I' || initialChar == 'O'
				|| initialChar == 'U') {
			System.out.println("The word '" + word + "' starts with a vowel");
		} else {
			System.out.println("The word '" + word + "' does not start with a vowel");
		}

		System.out.println("\n=========== U S I N G    S W I T C H ============");
		switch (initialChar) {
		case 'A':
		case 'E':
		case 'O':
		case 'I':
		case 'U':
			System.out.println("The word '" + word + "' starts with a vowel");
			break;
		default:
			System.out.println("The word '" + word + "' does not start with a vowel");
		}

	}

}
