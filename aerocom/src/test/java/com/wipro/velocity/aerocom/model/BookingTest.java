package com.wipro.velocity.aerocom.model;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BookingTest {

	@Test
	void testGetBookingId() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		String expected = "62ce7cb7dfbe1262be5e0cf6";
		String actual = booking.getBookingId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		String expected = "rani@ars.com";
		String actual = booking.getEmail();
		assertEquals(expected, actual);

	}

	@Test
	void testSetEmail() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		String email = "rani@ars.com";

		booking.setEmail(email);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getEmail(), email);
	}

	@Test
	void testGetPassengerName() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		String expected = "Rani";
		String actual = booking.getPassengerName();
		assertEquals(expected, actual);
	}

	@Test
	void testSetPassengerName() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);

		String passengerName = "Rani";

		booking.setPassengerName(passengerName);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getPassengerName(), passengerName);

	}

	@Test
	void testGetPassengerAge() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		String expected = "23";
		String actual = booking.getPassengerAge();
		assertEquals(expected, actual);
	}

	@Test
	void testSetPassengerAge() {

		String passengerAge = "Rani";
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		booking.setPassengerAge(passengerAge);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getPassengerAge(), passengerAge);

	}

	@Test
	void testGetPassportNumber() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		String expected = "F6345678";
		String actual = booking.getPassportNumber();
		assertEquals(expected, actual);
	}

	@Test
	void testSetPassportNumber() {

		String passportNumber = "F6345678";
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		booking.setPassportNumber(passportNumber);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getPassportNumber(), passportNumber);

	}

	@Test
	void testGetNumberOfSeats() {

		List<String> seatId = new ArrayList<String>();
		seatId.add("11A");
		seatId.add("11B");
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", seatId, "Rani", "23",
				"F6345678", 2, 8000, true, 16000, null);
		int expected = 2;
		int actual = booking.getNumberOfSeats();
		assertEquals(expected, actual);
	}

	@Test
	void testSetNumberOfSeats() {

		List<String> seatId = new ArrayList<String>();
		seatId.add("11A");
		seatId.add("11B");

		int numberOfSeats = 2;
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", seatId, "Rani", "23",
				"F6345678", 2, 8000, true, 16000, null);
		booking.setNumberOfSeats(numberOfSeats);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getNumberOfSeats(), numberOfSeats);

	}

	@Test
	void testGetPrice() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				0, 8000, true, 16000, null);
		int expected = 8000;
		int actual = booking.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testSetPrice() {

		int price = 2;
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				2, 8000, true, 16000, null);
		booking.setPrice(price);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getPrice(), price);

	}

	@Test
	void testGetTotalAmount() {
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				2, 8000, true, 16000, null);
		int expected = 16000;
		int actual = booking.getTotalAmount();
		assertEquals(expected, actual);
	}

	@Test
	void testSetTotalAmount() {
		int totalAmount = 16000;
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", null, "rani@ars.com", null, "Rani", "23", "F6345678",
				2, 8000, true, 16000, null);
		booking.setTotalAmount(totalAmount);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(booking.getTotalAmount(), totalAmount);
	}
}