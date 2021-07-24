package org.vleantech.java.step17exceptions;

@SuppressWarnings("serial")

public class InvalidBookingDataException extends Exception {
	public InvalidBookingDataException(String message) {
		super(message);
	}
}