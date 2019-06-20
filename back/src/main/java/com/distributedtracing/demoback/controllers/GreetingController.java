package com.distributedtracing.demoback.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.distributedtracing.demoback.dataaccess.HelloEntity;
import com.distributedtracing.demoback.dataaccess.HelloRepository;

@RestController
public class GreetingController {

	private static final Logger log = LoggerFactory.getLogger(GreetingController.class);

	private final HelloRepository repository;
	
	private final RestTemplate restTemplate;

	public GreetingController(final RestTemplate restTemplate, final HelloRepository repository) {
		super();
		this.repository = repository;
		this.restTemplate = restTemplate;
	}

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		final HelloEntity hello = repository.findById("123").get();
		log.info("Found {}", hello);
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	 @CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping("/chaining")
	public String chaining() {
		ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/greeting", String.class);
		return "Chaining + " + response.getBody();
	}

}
