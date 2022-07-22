package com.wipro.velocity.aerocom.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;
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

import com.wipro.velocity.aerocom.model.Admin;
import com.wipro.velocity.aerocom.repository.AdminRepository;

@SpringBootTest // This annotation creating the ApplicationContext used in our tests through
				// SpringApplication.
@RunWith(SpringRunner.class) // @RunWith(SpringRunner. class) provides a bridge between Spring Boot test
								// features and JUnit. Whenever we are using any Spring Boot testing features in
								// our JUnit tests
class AdminControllerTest {

	@InjectMocks // @InjectMocks is the Mockito Annotation. It allows you to mark a field on
					// which an injection is to be performed. Injection allows you to, Enable
					// shorthand mock and spy injections. Minimize repetitive mock and spy
					// injection.
	AdminController adminController;

	@Mock // Mocking is done when you invoke methods of a class that has external
			// communication like database calls or rest calls.
	AdminRepository arepo;

	@BeforeEach // used to signal that the annotated method should be executed before each @Test
				// method in the current test class.
	void setUp() throws Exception {
	}

	@AfterEach // used to signal that the annotated method should be executed after each @Test
				// @RepeatedTest , @ParameterizedTest , or @TestFactory methods in the current
				// class. J
	void tearDown() throws Exception {
	}

	@Test
	public void testSaveUser() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();// What is MockHttpServletRequest?
		// public class MockHttpServletRequest extends Object implements
		// HttpServletRequest. Mock implementation of the HttpServletRequest interface.
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		// it uses ThreadLocal to hold the Request object, which means that different
		// threads can get their own Request object
		// threadlocal used to create threat local variables which can only be read and
		// write by same thread

		// ServletRequestAttributes defines scope as one of request and session.
		// Accesses objects from servlet request and HTTP session scope, with no
		// distinction between "session" and "global session". It provides access to
		// request and session attributes through these possible scope values.13-Ma
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2000-08-26");
		Admin admin = new Admin("62c98566d58fc44e6bbdb90e", "vira@ims.com", "vira@1234");

		when(arepo.save(any(Admin.class))).thenReturn(admin);

		String response = adminController.saveAdmin(admin);

		assertEquals("Admin Registered Sucessfully", response);
	}

	@Test
	public void testGetAdminList() throws Exception {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// java.util.Date d1 = sdf.parse("1992-07-26");
		// java.util.Date d2 = sdf.parse("1996-07-26");

		when(arepo.findAll()).thenReturn(Stream
				.of(new Admin("62c4a325204d9b4ecd287ff8", "viraj@ims.com", "viraj@1234"),
						new Admin("62c093681c496b79967a48b3", "veerame@ims.com", "veera4532"))
				.collect(Collectors.toList()));
		assertEquals(2, adminController.getAdminList().size());
	}

	@Test
	void testLoginAdmin() {

	}

}