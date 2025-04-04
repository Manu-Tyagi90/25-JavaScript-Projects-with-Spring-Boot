package com.example.randomcolorgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class RandomColorGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomColorGeneratorApplication.class, args);
	}

	@Controller
	public class ColorController {

		@GetMapping("/")
		public String getRandomColor() {;
			return "index";
		}
	}

}
