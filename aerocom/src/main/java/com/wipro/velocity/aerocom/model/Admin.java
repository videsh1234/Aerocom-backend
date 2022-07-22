package com.wipro.velocity.aerocom.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection="admin")
public class Admin {
	
	@Id
	private String adminId;
	
	private String email;
	private String password;

	
	

}
