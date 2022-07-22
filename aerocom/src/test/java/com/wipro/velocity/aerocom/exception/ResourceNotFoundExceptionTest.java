package com.wipro.velocity.aerocom.exception;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.expression.ParseException;

class ResourceNotFoundExceptionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testResourceNotFoundException() throws ParseException {// when the error has been reached unexpectedly while
																// parsing

		Exception exception = new Exception("Hii");
		String expect = "Hii";// this annotation require that be precise about exception will be thrown
		String actual = exception.getMessage();

		assertTrue(actual.contains(expect));// we can pass the condition as a boolean parameter with the assert True
											// method

	}

}
