package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.repository.RepositoryInterface;
import com.syam.service.MyServiceClass;

@SpringBootApplication
public class P23DataJpaCompositeKeysApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P23DataJpaCompositeKeysApplication.class, args);
	
		 MyServiceClass myServiceClass = context.getBean(MyServiceClass.class);
		
		 //myServiceClass.saves();
		 
		 //myServiceClass.search();
		 
		 //myServiceClass.delete();
		 
		 myServiceClass.searchAll();
		 
		 context.close();
		
		
	}

}
