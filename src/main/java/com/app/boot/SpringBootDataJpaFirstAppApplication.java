package com.app.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDataJpaFirstAppApplication {

	public static void main(String[] args) {
		System.out.println("Runner GOing TO start");
		SpringApplication.run(SpringBootDataJpaFirstAppApplication.class, args);

	System.out.println("Main DOne");
	}

}
