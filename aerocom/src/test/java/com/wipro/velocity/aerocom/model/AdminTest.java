package com.wipro.velocity.aerocom.model;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminTest {

	// create Admin Instance
	Admin ad = new Admin("62d13e05d1357d7a22c84057", "rajashekhar@ars.com", "raja1234");

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetEmail() {
		String email = "rajashekhar@ars.com";
		Admin admin = new Admin();
		admin.setEmail(email);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(admin.getEmail(), email);
	}

	@Test
	void testSetPassword() {
		String password = "raja1234";
		Admin admin = new Admin();
		admin.setPassword(password);
		assertEquals(admin.getPassword(), password);
	}

	@Test
	void testGetAdminId() {
		String expected = "62d13e05d1357d7a22c84057";
		String actual = ad.getAdminId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		String expected = "rajashekhar@ars.com";
		String actual = ad.getEmail();
		assertEquals(expected, actual);// this method is used to assert if two values are equal We can compare the
										// value of different data
		// like string boolean, integer

	}

	@Test
	void testGetPassword() {
		String expected = "raja1234";
		String actual = ad.getPassword();
		assertEquals(expected, actual);
	}

}