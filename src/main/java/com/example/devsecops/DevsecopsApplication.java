package com.example.devsecops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class DevsecopsApplication {
	@GetMapping("/")
	public String hello() {
		return "<html><body><h1>Hello DevSecOps</body></h1></html>";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevsecopsApplication.class, args);
	}

}
