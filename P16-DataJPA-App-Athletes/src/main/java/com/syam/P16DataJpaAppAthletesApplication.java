package com.syam;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.entity.Athlete;
import com.syam.repository.AthleteRepository;

@SpringBootApplication
public class P16DataJpaAppAthletesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P16DataJpaAppAthletesApplication.class, args);
		
		AthleteRepository athleteRepository=context.getBean(AthleteRepository.class);
		
		
		//--------->SAVE()----------------------------------------------------------------------------
		/*Athlete athlete=new Athlete(1,"Syam",23,"male","BHARAT");
		//athleteRepository.save(athlete);		
		*/		
		
		// --------->SAVEALL(...)---------------------------------------------------------------------
		/*Athlete athlete1=new Athlete(2,"Bolt",40,"male","JIMECA");
		Athlete athlete2=new Athlete(3,"Dafne Schippers",33,"female","NETHERLAND");
		Athlete athlete3=new Athlete(4,"Mofra",35,"male","KINEYA");
		Athlete athlete4=new Athlete(5,"Jyothi",25,"female","BHARAT");
		
		athleteRepository.saveAll(Arrays.asList(athlete1,athlete2,athlete3,athlete4));	
		
		*/
		
		
		// -------------->findById(..)----------------------------------------------------------------
		/*Optional<Athlete> findById = athleteRepository.findById(1);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		}*/		
		
		
		//-------------------------------->findAllById(..)---------------------------------------------
		/*Iterable<Athlete> allById = athleteRepository.findAllById(Arrays.asList(1,2,3));
		allById.forEach(Athlete ->{
			System.out.println(Athlete);
		});*/
		
		
		
		
		//--------------------------------------FindAll()------------------------------------------------
		/*Iterable<Athlete> findall = athleteRepository.findAll();
		findall.forEach(Athlete ->{
			System.out.println(Athlete);
		});*/
		
		
		//-------------------COUNT()---------------------------------------------------------------------
		/*long count=athleteRepository.count();
		System.out.println("total no of athletes: "+count);*/
		
		
		//------------------------existsById()---------------------------------------------------
		/*boolean exhistsById=athleteRepository.existsById(1);
		System.out.println("record prestent by ---- is : "+exhistsById);*/
		
		//---------------------------deleteById()--------------------------------------------------
		//athleteRepository.deleteById(5);
		
		
		//---------------------------deleteAllById()--------------------------------------------------
		//athleteRepository.deleteAllById(Arrays.asList(2,3));
	}

}
