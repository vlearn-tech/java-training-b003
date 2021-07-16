package org.vleantech.java.step17exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			String numStr = "Hello";
			validateInputData(numStr);
			Integer num = Integer.valueOf(numStr);
		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}
	}

	static private void validateInputData(String inputNumber) throws InvalidDataException {
		if (inputNumber != null) {
			try {
				Integer.valueOf(inputNumber);
			} catch (NumberFormatException e) {
				throw new InvalidDataException("Invalid input. Expected numeric entry. Received '" + inputNumber + "'");
			}
		}
	}

}
