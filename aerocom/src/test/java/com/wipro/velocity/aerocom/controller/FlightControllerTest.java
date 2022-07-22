package com.wipro.velocity.aerocom.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wipro.velocity.aerocom.model.Flight;
import com.wipro.velocity.aerocom.repository.FlightRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class FlightControllerTest {

	@InjectMocks
	FlightController flightController;

	@Mock
	FlightRepository frepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testGetAllFlights() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date flight1 = sdf.parse("2022-07-19");
		java.util.Date flight2 = sdf.parse("2022-07-20");

		when(frepo.findAll()).thenReturn(Stream.of(
				new Flight("62ce7881dfbe1262be5e0cf0", "101", "AirIndia", "Mumbai", "Delhi", "13:00", "16:20", 8000,
						"flight1"),
				new Flight("62ceab98b9675349e692a288", "101", "spiceJet", "Mumbai", "Delhi", "04:30", "06:00", 9000,
						"flight2"))
				.collect(Collectors.toList()));
		assertEquals(2, flightController.getAllFlights().size());
	}

	@Test
	public void testGetFlightData() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		List<Flight> flight = frepo.findByFromLocationAndToLocationAndDate("Delhi", "Chennai", "2022-08-19");
	}

	@Test
	public void testSaveFlight() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date flightDate = sdf.parse("2022-08-19");
		Flight flight = new Flight("62d13ea2d1357d7a22c84059", "101", "JetAirIndia", "Delhi", "Chennai", "04:46",
				"08:47", 5000, "flightDate");

		when(frepo.save(any(Flight.class))).thenReturn(flight);

		String response = flightController.saveFlight(flight);

		assertEquals("Flight Created Sucessfully", response);
	}

	@Test
	public void testGetFlightById() throws Exception {

		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		Flight flight = new Flight("62ce7881dfbe1262be5e0cf0", "101", "AirIndia", "Mumbai", "Delhi", "13:00", "16:20",
				8000, "flightDate");

		when(frepo.findByFlightNumber("101")).thenReturn(Optional.of(flight));

		// assertEquals(1,flightController.getFlightById("101").size());

	}

	@Test

	public void testUpdateFlight() {

		Flight flight = frepo.findByFlightNumber("101").get();

		flight.setPrice(5000);

		Flight flightUpdated = frepo.save(flight);

		assertThat(flightUpdated.getPrice()).isEqualTo(5000);

	}

	@Test
	public void testDeleteFlight() {
		frepo.deleteById("62ce7881dfbe1262be5e0cf0");
		assertThat(frepo.existsById("62ce7881dfbe1262be5e0cf0")).isFalse();
	}

}