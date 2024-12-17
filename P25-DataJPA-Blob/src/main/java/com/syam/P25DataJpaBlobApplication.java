package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.service.UserService;

@SpringBootApplication
public class P25DataJpaBlobApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(P25DataJpaBlobApplication.class, args);
		UserService userService = context.getBean(UserService.class);
		
		userService.service();
	}

}
