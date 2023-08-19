package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.velocity.service.ApiService;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringbootApi1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootApi1Application.class, args);
		
	ApiService service = run.getBean(ApiService.class);
	

		
	}

}
