package com.veotis.travel.traveldbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.veotis.travel.traveldbservice.repositories")
@SpringBootApplication
public class TravelDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TravelDbServiceApplication.class, args);
	}
}
