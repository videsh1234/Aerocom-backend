package com.wipro.velocity.aerocom.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wipro.velocity.aerocom.model.Booking;
import com.wipro.velocity.aerocom.model.Flight;
import com.wipro.velocity.aerocom.repository.BookingRepository;

@SpringBootTest
@RunWith(SpringRunner.class)

class BookingControllerTest {

	@InjectMocks
	BookingController bookingController;

	@Mock
	BookingRepository brepo;

	@DBRef
	private Flight flight;
	// reference from one document to another using the value of the first
	// document_id field, collection name and optionally its database name
	// as well as other fields

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSaveBooking() throws Exception {

		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		List<String> seatId = new ArrayList<String>();
		seatId.add("11A");
		seatId.add("11B");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date bookingDate = sdf.parse("2022-07-19");
		Booking booking = new Booking("62ce7cb7dfbe1262be5e0cf6", bookingDate, "rani@ars.com", seatId, "Rani", "23",
				"F6345678", 2, 8000, true, 16000, flight);

		when(brepo.save(any(Booking.class))).thenReturn(booking);

		String response = bookingController.saveBooking(booking);

	}

	@Test
	void testDeleteBooking() {

		brepo.deleteById("62ce7cb7dfbe1262be5e0cf6");
		assertThat(brepo.existsById("62ce7cb7dfbe1262be5e0cf6")).isFalse();

	}

	@Test
	void testGetBookingData() {

		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		List<Booking> booking = brepo.findByEmail("rani@ars.com");

	}

	@Test
	void testGetBookingDetail() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		Optional<Booking> booking = brepo.findByPassportNumber("F6345678");

	}

	@Test
	void testGetBookingDetailById() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		Optional<Booking> booking = brepo.findById("62ce7cb7dfbe1262be5e0cf6");

	}

	@Test
	void testGetLatestBooking() {

	}

}