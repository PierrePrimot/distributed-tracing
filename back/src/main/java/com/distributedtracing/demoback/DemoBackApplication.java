package com.distributedtracing.demoback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class DemoBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBackApplication.class, args);
	}

}
