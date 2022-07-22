package com.wipro.velocity.aerocom.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class FlightTest {

	Flight flight = new Flight("62d13ea2d1357d7a22c84059", "101", "JetAirIndia", "Delhi", "Chennai", "04:46", "08:47",
			5000, "2022-08-19");

	@Test
	void testGetId() {

		String expected = "62d13ea2d1357d7a22c84059";
		String actual = flight.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFlightNumber() {
		String expected = "101";
		String actual = flight.getFlightNumber();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFlightName() {
		String expected = "JetAirIndia";
		String actual = flight.getFlightName();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFromLocation() {
		String expected = "Delhi";
		String actual = flight.getFromLocation();
		assertEquals(expected, actual);
	}

	@Test
	void testGetToLocation() {
		String expected = "Chennai";
		String actual = flight.getToLocation();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDepartureTime() {
		String expected = "04:46";
		String actual = flight.getDepartureTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetArrivalTime() {
		String expected = "08:47";
		String actual = flight.getArrivalTime();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPrice() {
		int expected = 5000;
		int actual = flight.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDate() {
		String expected = "2022-08-19";
		String actual = flight.getDate();
		assertEquals(expected, actual);
	}

	@Test
	void testSetFlightNumber() {
		String flightNumber = "101";
		Flight flight = new Flight();
		flight.setFlightNumber(flightNumber);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getFlightNumber(), flightNumber);
	}

	@Test
	void testSetFlightName() {
		String flightName = "JetAirIndia";
		Flight flight = new Flight();
		flight.setFlightName(flightName);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getFlightName(), flightName);
	}

	@Test
	void testSetFromLocation() {
		String fromLocation = "Delhi";
		Flight flight = new Flight();
		flight.setFromLocation(fromLocation);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getFromLocation(), fromLocation);

	}

	@Test
	void testSetToLocation() {
		String toLocation = "Chennai";
		Flight flight = new Flight();
		flight.setToLocation(toLocation);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getToLocation(), toLocation);

	}

	@Test
	void testSetDepartureTime() {
		String departureTime = "04:46";
		Flight flight = new Flight();
		flight.setDepartureTime(departureTime);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getDepartureTime(), departureTime);
	}

	@Test
	void testSetArrivalTime() {
		String arrivalTime = "08:47";
		Flight flight = new Flight();
		flight.setArrivalTime(arrivalTime);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getArrivalTime(), arrivalTime);

	}

	@Test
	void testSetPrice() {
		int price = 5000;
		Flight flight = new Flight();
		flight.setPrice(price);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getPrice(), price);
	}

	@Test
	void testSetDate() {
		String date = "2022-08-19";
		Flight flight = new Flight();
		flight.setDate(date);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(flight.getDate(), date);
	}

}