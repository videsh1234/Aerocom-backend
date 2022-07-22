package com.wipro.velocity.aerocom.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.SimpleDateFormat;

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

import com.wipro.velocity.aerocom.model.User;
import com.wipro.velocity.aerocom.repository.UserRepository;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserControllerTest {

	@InjectMocks
	UserController userController;

	@Mock
	UserRepository urepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSaveUser() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2000-09-26");
		User user = new User("62c0ac3cfb4cd65f27fd84cd", "james@ims.cim", "james", "D", "trainee", yourDate,
				"8372833292");

		when(urepo.save(any(User.class))).thenReturn(user);

		String response = userController.saveUser(user);

		assertEquals("User Registration Successful", response);
	}

	@Test
	public void testLoginUser() {

	}

}
