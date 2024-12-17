package com.syam;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.entity.ProductOrder;
import com.syam.repository.OrderDetailsRepository;

@SpringBootApplication
public class P21DataJpaCustomGenetaedPkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P21DataJpaCustomGenetaedPkApplication.class, args);
	
		OrderDetailsRepository bean = context.getBean(OrderDetailsRepository.class);
	
		ProductOrder po = new ProductOrder();
		
		po.setOrderName("Syam");
		po.setOrderDate(new Date());
		
		bean.save(po);
		
		context.close();
	}

}
