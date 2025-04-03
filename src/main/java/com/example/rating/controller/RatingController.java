package com.example.rating.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RatingController {
@GetMapping("/")
public String getRating() {
    return "index";
}
}
