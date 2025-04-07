package com.example.loadmoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LoadMoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadMoreDemoApplication.class, args);
	}
	@Controller
	public class MyController {
		
		@GetMapping("/")
		public String load() {
			return "index";
		}
		
	}
	
}
