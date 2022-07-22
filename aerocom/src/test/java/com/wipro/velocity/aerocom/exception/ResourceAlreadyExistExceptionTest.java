package com.wipro.velocity.aerocom.exception;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ResourceAlreadyExistExceptionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testResourceAlreadyExistException() throws ParseException {

		Exception exception = new Exception("");
		String expect = "";
		String actual = exception.getMessage();

		assertTrue(actual.contains(expect));

	}

	@Test
	void testResourceAlreadyExistExceptionString() throws ParseException {

		Exception exception = new Exception("Hii");
		String expect = "Hii";
		String actual = exception.getMessage();

		assertTrue(actual.contains(expect));
	}

}
