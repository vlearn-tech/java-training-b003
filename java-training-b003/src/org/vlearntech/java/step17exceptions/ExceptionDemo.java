package org.vlearntech.java.step17exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			String numStr = "Hello";
			validateInputData(numStr);
			Integer num = Integer.valueOf(numStr);
			System.out.println("10 greater than the number is : " + (num + 10));
		} catch (InvalidDataException e) {
			System.out.println(e.getMessage());
		}
	}

	static private void validateInputData(String input) throws InvalidDataException {
		if (input != null) {
			try {
				Integer.valueOf(input);
			} catch (NumberFormatException e) {
				throw new InvalidDataException("Invalid input. Expected numeric entry. Received '" + input + "'");
			}
		}
	}

//	static private void createABooking(TicketBooking booking) {
//
//		// validate Booking
//		try {
//			validateBooking(booking);
//		} catch (InvalidBookingDataException e) {
//			// handle the exception here
//		}
//
//		// create the Booking
//
//	}
//
//	static private void validateBooking(TicketBooking booking) throws InvalidBookingDataException {
//		if (booking.numberOfTickets < 1) {
//			throw new InvalidBookingDataException("Number of tickets cannot be zero");
//		}
//		if (booking.location == null) {
//			throw new InvalidBookingDataException("Location has to be provided");
//		}
//	}

}
