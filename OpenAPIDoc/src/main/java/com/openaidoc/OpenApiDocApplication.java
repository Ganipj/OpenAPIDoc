package com.openaidoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(description = "Product service Documentation"))
public class OpenApiDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenApiDocApplication.class, args);
	}

}
