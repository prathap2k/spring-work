package com.pathohub.springwork.services.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GreetingController {
    
	@Value("${pathohub.springwork.greeting.message.name}")
	private String name;
	@RequestMapping("/")
    public String index() {
        return "Hi "+name+"!, Greetings from Spring Boot!";
    }

}
