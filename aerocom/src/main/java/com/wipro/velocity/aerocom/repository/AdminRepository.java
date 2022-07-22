package com.wipro.velocity.aerocom.repository;


import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.aerocom.model.Admin;


public interface AdminRepository extends MongoRepository<Admin, String> {
	
	public Optional<Admin> findByEmail(String email);

}
