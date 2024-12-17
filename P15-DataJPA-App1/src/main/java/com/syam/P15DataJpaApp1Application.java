package com.syam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.entity.Player;
import com.syam.repository.PlayerRepository;

@SpringBootApplication
public class P15DataJpaApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(P15DataJpaApp1Application.class, args);
		
		PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
		
		//System.out.println(playerRepository.getClass().getName());
		
		Player p1=new Player();
		p1.setPlayerId(02);
		p1.setPlayerName("Syam Kumar");
		p1.setPlayerAge(23);
		p1.setLocation("Visakhapatnam");
		
		playerRepository.save(p1);	//upsert method
		
		System.out.println("Record inserted successfully.............");
	}

}
