package org.vlearntech.java.step17exceptions;

@SuppressWarnings("serial")

public class InvalidDataException extends Exception {
	public InvalidDataException(String message) {
		super(message);
	}
}
