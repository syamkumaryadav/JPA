package com.syam;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.entity.BalayyaBabuFan;
import com.syam.repository.FanRepository;

@SpringBootApplication
public class P20DataJpaUpdataCreationTimestampApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P20DataJpaUpdataCreationTimestampApplication.class, args);
		FanRepository fanRepository = context.getBean(FanRepository.class);
		
		BalayyaBabuFan bf = new BalayyaBabuFan();
	//	bf.setFanMobileNumber(2);		//------>for Updation
		bf.setFanName("Kesava");
		bf.setFanVillage("Eapurapalem.");
		fanRepository.save(bf);
		
		
		/*List<BalayyaBabuFan> all = fanRepository.findAll();
		all.forEach(allFans ->{
			System.out.println(allFans);
		});*/
	
	}

}
