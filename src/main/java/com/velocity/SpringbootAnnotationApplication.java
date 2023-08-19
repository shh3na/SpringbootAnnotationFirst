package com.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.velocity.service.UserService;

@SpringBootApplication
public class SpringbootAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootAnnotationApplication.class, args);
		
		UserService obj = context.getBean(UserService.class);
		
		obj.getName(121);
	}

}
