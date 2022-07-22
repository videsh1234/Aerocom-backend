package com.wipro.velocity.aerocom.repository;


import java.util.List;
import java.util.Optional;

import com.wipro.velocity.aerocom.model.Booking;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<Booking, String> {
	
	Optional<Booking> findByPassportNumber(String passportNumber);
	
	
	
	List<Booking> findByEmail(String email);
	
	List<Booking> findBySeatIdIn(List<String> arr);

}
