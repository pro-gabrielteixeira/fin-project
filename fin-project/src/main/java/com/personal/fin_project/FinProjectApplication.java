package com.personal.fin_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FinProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinProjectApplication.class, args);
	}

}
