package com.wipro.velocity.aerocom.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {
	//creating bean 
	@Bean public Docket api() { 
		//creating constructor of Docket class that accepts parameter DocumentationType 
		return new Docket(DocumentationType.SWAGGER_2);
	}
	
	/* * Swagger2 JSON API Docs should be available in JSON format in following url. 
	 * * Open in Browser/POSTMAN * * http://localhost:9090/ims/v2/api-docs * 
	 * * Swagger2 UI Docs i.e Grapical document of REST API is in following URL * 
	 * * Open in Browser * 
	 * * http://localhost:9090/aerocom/swagger-ui.html */
}

