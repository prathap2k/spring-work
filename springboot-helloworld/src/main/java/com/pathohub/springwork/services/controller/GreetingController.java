package com.pathohub.springwork.services.controller;

import org.springframework.web.bind.annotation.RestController;

import com.pathohub.springwork.greeting.objects.Greeting;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@RequestMapping("/springboot")
@RestController()
public class GreetingController {

	@Value("${pathohub.springwork.greeting.message.name}")
	private String pass;

	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/greeting",method = RequestMethod.GET)
	public @ResponseBody Greeting sayHello(
			@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name) {
		return new Greeting(counter.incrementAndGet(), String.format("Hi " + name + "!, Greetings from Spring Boot!. You have " + pass + " pass.", name));
	}

	/*@RequestMapping(value = "/greeting", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> doGreet(@RequestBody String request) throws Exception {
		System.out.println(request);
		return new ResponseEntity<String>(
				, HttpStatus.OK);
	}*/
}
