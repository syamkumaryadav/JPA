package com.syam;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.syam.entity.Athlete;
import com.syam.repository.AthleteRepository;

@SpringBootApplication
public class P16DataJpaAppAthletesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P16DataJpaAppAthletesApplication.class, args);
		
		AthleteRepository athleteRepository=context.getBean(AthleteRepository.class);
		
		
		//========================================Iterable===================================
		
		/*Iterable<Athlete> findall = athleteRepository.findAll();
		findall.forEach(Athlete ->{
			System.out.println(Athlete);
		});*/
		
		/*Athlete athlete=new Athlete(7,"Jyothi Krishna",23,"male","BHARAT");
		Athlete athlete1=new Athlete(8,"Ram Kumar",22,"male","INDIA");
		Athlete athlete2=new Athlete(9,"Presad",23,"male","BHARAT");
		athleteRepository.saveAll(Arrays.asList(athlete,athlete1,athlete2));*/
		
		
		//========================================List===================================

		/*List<Athlete> allAthletes = athleteRepository.allAthletes();
		allAthletes.forEach(all ->{
			System.out.println(all);
		});*/
		
		/*Athlete athlete1=new Athlete(8,"Ram Kumar",22,"male","BHARAT");
		athleteRepository.save(athlete1);*/
		
		/*List<Athlete> allAthletes = athleteRepository.nativeAllAthletes();
		allAthletes.forEach(all ->{
			System.out.println(all);
		});
		
		List<Athlete> NativeallAthletes = athleteRepository.nativeAllAthletes();
		NativeallAthletes.forEach(all ->{
			System.out.println(all);
		});*/
		
		
		//------------------------------------CUSTOM RETRIVE BY 1 VALUES CONDTIONS ------------------------------------------

		/*List<Athlete> country = athleteRepository.countryN("NETHERLAND");
		country.forEach(countryy ->{
			System.out.println(countryy);
		});
		
		
		
		//------------------------------------NATIVE RETRIVE BY 1 VALUES CONDTIONS ------------------------------------------

		List<Athlete> nativeCountry = athleteRepository.nativeCountryNames("BHARAT");
		nativeCountry.forEach(nativeCountryy ->{
			System.out.println(nativeCountryy);
		});*/
		
		
		
		//------------------------------------NATIVE RETRIVE BY 2 VALUES CONDTIONS ------------------------------------------

		/*List<Athlete> customRetrive = athleteRepository.customRetrive("BHARAT", 1);
		customRetrive.forEach(cr->{
			System.out.println(cr);
		});*/
		
		
		
		//------------------------------------NATIVE UPDATE------------------------------------------
		
		/*List<Athlete> myCustomUpdata = athleteRepository.myCustomUpdata("ANDHRA", 8);
		myCustomUpdata.forEach(cc ->{
			System.out.println(cc);
		});*/
		
		List<Athlete> allAthletes = athleteRepository.allAthletes();
		allAthletes.forEach(aa ->{
			System.out.println(aa);
		});
		
		
	}

}
