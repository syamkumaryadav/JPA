package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.service.AccountService;

@SpringBootApplication
public class P22DataJpaBankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P22DataJpaBankApplication.class, args);

		AccountService accountService = context.getBean(AccountService.class);
		//accountService.saveAccData();
		accountService.getDataUsingPK();

		context.close();
	}

}
