package com.wipro.velocity.aerocom.repository;

import java.util.Optional;

import com.wipro.velocity.aerocom.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {


		 Optional<User> findByEmail(String email);
		
}
