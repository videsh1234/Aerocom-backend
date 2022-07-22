package com.wipro.velocity.aerocom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.aerocom.exception.ResourceNotFoundException;
import com.wipro.velocity.aerocom.model.User;
import com.wipro.velocity.aerocom.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository urepo;

	// Register User
	// POST -http://localhost:9090/aerocom/api/registerUser
	@PostMapping("/registerUser")
	public String saveUser(@Validated @RequestBody User user) throws Exception

	{
		User uemail = urepo.findByEmail(user.getEmail()).orElse(null);
		if (uemail == null) {
			urepo.save(user);
			return "User Registration Successful";
		} else
			throw new Exception("User Already Exist");

	}

	// Login User
	// POST - http://localhost:9090/aerocom/api/loginUser
	@PostMapping("/loginUser")
	public Boolean loginUser(@Validated @RequestBody User user) throws ResourceNotFoundException {
		Boolean isLogin = false;
		String email = user.getEmail();
		String password = user.getPassword();

		User u = urepo.findByEmail(email).orElseThrow(() -> new ResourceNotFoundException("Unknown User"));

		if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
			isLogin = true;

		}
		return isLogin;
	}

}