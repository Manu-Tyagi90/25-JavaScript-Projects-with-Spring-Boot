package com.example.Accordion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class controllerClass {

    @GetMapping("/")
    public String show(Model model) {
        return "index";
    }
}

