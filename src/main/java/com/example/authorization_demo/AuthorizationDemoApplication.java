package com.example.authorization_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AuthorizationDemoApplication {



	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(AuthorizationDemoApplication.class, args);
	}

}
