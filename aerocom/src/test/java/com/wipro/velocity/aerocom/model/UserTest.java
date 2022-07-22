package com.wipro.velocity.aerocom.model;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {

	User us = new User("62d13fcdd1357d7a22c8405b", "sai@ars.com", "SaiKiran", "Vinnakota", "videsh1234", null,
			"9373837383");

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetId() {

		String expected = "62d13fcdd1357d7a22c8405b";
		String actual = us.getId();
		assertEquals(expected, actual);

	}

	@Test
	void testGetEmail() {
		String expected = "sai@ars.com";
		String actual = us.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFname() {
		String expected = "SaiKiran";
		String actual = us.getFname();
		assertEquals(expected, actual);

	}

	@Test
	void testGetLname() {
		String expected = "Vinnakota";
		String actual = us.getLname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassword() {
		String expected = "videsh1234";
		String actual = us.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDob() {

	}

	@Test
	void testGetPhoneNo() {
		String expected = "9373837383";
		String actual = us.getPhoneNo();
		assertEquals(expected, actual);
	}

	@Test
	void testSetEmail() {
		String email = "sai@ars.com";
		User user = new User();
		user.setEmail(email);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(user.getEmail(), email);
	}

	@Test
	void testSetFname() {
		String fname = "SaiKiran";
		User us = new User();
		us.setFname(fname);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(us.getFname(), fname);

	}

	@Test
	void testSetLname() {
		String lname = "Vinnakota";
		User us = new User();
		us.setLname(lname);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(us.getLname(), lname);

	}

	@Test
	void testSetPassword() {
		String password = "videsh1234";
		User us = new User();
		us.setPassword(password);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(us.getPassword(), password);

	}

	@Test
	void testSetDob() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2000-9-18");

		Date dob = yourDate;
		User us = new User();
		us.setDob(dob);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(us.getDob(), dob);
	}

	@Test
	void testSetPhoneNo() {

		String phoneNo = "9373837383";
		User us = new User();
		us.setPhoneNo(phoneNo);
		// TODO review the generated test code and remove the default call to fail.
		assertEquals(us.getPhoneNo(), phoneNo);

	}

}