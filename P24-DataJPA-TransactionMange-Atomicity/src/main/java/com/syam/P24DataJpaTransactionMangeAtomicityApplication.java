package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.repository.MyDestinationRepository;
import com.syam.repository.MySourceRepository;
import com.syam.service.MyServiceClass;

@SpringBootApplication
public class P24DataJpaTransactionMangeAtomicityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P24DataJpaTransactionMangeAtomicityApplication.class, args);
		
		MyServiceClass bean = context.getBean(MyServiceClass.class);
		bean.service();
		
		context.close();
	}

	
	
}
