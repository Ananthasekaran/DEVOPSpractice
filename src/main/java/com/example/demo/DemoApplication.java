package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public void Hello() {
		System.out.println("Hello, Ananth!");
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
	}

}
