package com.wipro.velocity.aerocom.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "booking")
public class Booking {

	@Id
	private String bookingId;
	private Date bookingDate; // Current date of the user
	private String email;
	private List<String> seatId = new ArrayList<>();
	private String passengerName;
	private String passengerAge;
	@Indexed(unique = true)
	private String passportNumber;
	private int numberOfSeats;
	private int price;
	@Field
	public boolean bookingStatus = false;
	private int totalAmount;

	@DBRef
	private Flight flight;

	public Booking() {

	}

	public Booking(String bookingId, Date bookingDate, String email, List<String> seatId, String passengerName,
			String passengerAge, String passportNumber, int numberOfSeats, int price, boolean bookingStatus,
			int totalAmount, Flight flight) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.email = email;
		this.seatId = seatId;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passportNumber = passportNumber;
		this.numberOfSeats = numberOfSeats;
		this.price = price;
		this.bookingStatus = bookingStatus;
		this.totalAmount = totalAmount;
		this.flight = flight;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getSeatId() {
		return seatId;
	}

	public void setSeatId(List<String> seatId) {
		this.seatId = seatId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(String passengerAge) {
		this.passengerAge = passengerAge;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public int getNumberOfSeats() {
		return this.seatId.size();
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public int getTotalAmount() {
		return this.price * this.numberOfSeats;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

}
