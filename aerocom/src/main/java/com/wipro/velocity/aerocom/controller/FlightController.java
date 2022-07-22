package com.wipro.velocity.aerocom.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.velocity.aerocom.exception.ResourceNotFoundException;
import com.wipro.velocity.aerocom.model.Flight;
import com.wipro.velocity.aerocom.repository.FlightRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "/api")
public class FlightController {

	@Autowired
	private FlightRepository frepo;

	// Add Flight
	// POST- http://localhost:9090/aerocom/api/addFlight // Only for admins
	@PostMapping("/addFlight")
	public String saveFlight(@RequestBody Flight flight) {

		frepo.save(flight);

		return "Flight Created Sucessfully";
	}

	// view all the flights in db
	// GET -http://localhost:9090/aerocom/api/admin/allFlights // only for admins
	@GetMapping("/admin/allFlights")
	public List<Flight> getAllFlights() {
		return frepo.findAll();
	}

	// for flights search
	// GET =
	// http://localhost:9090/aerocom/api/admin/flightSearch/{from_location}/{to_location}/{date}
	@GetMapping("/admin/flightSearch/{from_location}/{to_location}/{date}")
	public List<Flight> getFlightData(@PathVariable(value = "from_location") String from_location,
			@PathVariable(value = "to_location") String to_location, @PathVariable("date") String date) {

		return (List<Flight>) frepo.findByFromLocationAndToLocationAndDate(from_location, to_location, date);
	}

	// GET -
	// http://localhost:9090/aerocom/api/admin/findFlight/{flight_number}...//only
	// for admin
	@GetMapping("/admin/findFlight/{flightNumber}")
	public ResponseEntity<Flight> getProductById(@PathVariable(value = "flightNumber") String flightNumber)
			throws ResourceNotFoundException {
		Flight flight = frepo.findByFlightNumber(flightNumber)
				.orElseThrow(() -> new ResourceNotFoundException("Flight not found: " + flightNumber));

		return ResponseEntity.ok().body(flight);
	}

	// PUT- http://localhost:9090/aerocom/api/flight/flight_number //only for admins
	@PutMapping("/flight/{flightNumber}")
	public ResponseEntity<Flight> updateProduct(@PathVariable(value = "flightNumber") String flightNumber,
			@Validated @RequestBody Flight f) throws ResourceNotFoundException {

		Flight flight = frepo.findByFlightNumber(flightNumber)
				.orElseThrow(() -> new ResourceNotFoundException("Flight not found: " + flightNumber));

		flight.setFlightName(f.getFlightName());
		flight.setFromLocation(f.getFromLocation());
		flight.setToLocation(f.getToLocation());
		flight.setDepartureTime(f.getDepartureTime());
		flight.setArrivalTime(f.getArrivalTime());
		flight.setDate(f.getDate());
		flight.setPrice(f.getPrice());

		final Flight updatedFlight = frepo.save(flight);

		return ResponseEntity.ok(updatedFlight);

	}

	// Delete-http://localhost:9090/aerocom/api/flight/{id} // only for admins
	@DeleteMapping("/flight/{id}")
	public Map<String, Boolean> deleteFlight(@PathVariable(value = "id") String fId) throws ResourceNotFoundException {
		Flight flight = frepo.findById(fId)
				.orElseThrow(() -> new ResourceNotFoundException("Flight Not Found for this Id: " + fId));

		frepo.delete(flight);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Delete the Flight", Boolean.TRUE);
		return response;

	}
}
