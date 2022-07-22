package com.wipro.velocity.aerocom.exception;

public class ResourceAlreadyExistException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	private String message;
	

	public ResourceAlreadyExistException() {
		super();
		//TODO Auto-generated constructor stub
	}



	public ResourceAlreadyExistException(String message) {
		super(message);
		this.message=message;
	}

}
