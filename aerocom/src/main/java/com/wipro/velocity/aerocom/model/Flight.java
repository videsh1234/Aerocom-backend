package com.wipro.velocity.aerocom.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection="flight")
public class Flight {
	@Id
	private String id;
	

	private String flightNumber;
	private String flightName;
	private String fromLocation;
	private String toLocation;
	private String departureTime;
	private String arrivalTime;
	private int price;
	
	
	@DateTimeFormat(pattern="yyy-MM-dd")
	private String date;
/*
	public Flight() {
		super();
	}

	public Flight(String id, String flightNumber, String flightName, String fromLocation, String toLocation,
			String departureTime, String arrivalTime, int price,  String date) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.flightName = flightName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.price = price;
	
		
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

	
*/
}
