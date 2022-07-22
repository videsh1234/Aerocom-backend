package com.wipro.velocity.aerocom.repository;




import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.velocity.aerocom.model.Flight;

public interface FlightRepository extends MongoRepository<Flight, String> {
	

	Optional<Flight> findByFlightNumber(String flightNumber);
	
	List<Flight> findByFromLocationAndToLocationAndDate(String fromLocation, String toLocation, String date);

 
	

}
