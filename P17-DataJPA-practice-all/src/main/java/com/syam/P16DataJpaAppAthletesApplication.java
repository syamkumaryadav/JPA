package com.syam;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Sort;

import com.syam.entity.Athlete;
import com.syam.repository.AthleteRepository;

@SpringBootApplication
public class P16DataJpaAppAthletesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P16DataJpaAppAthletesApplication.class, args);
		
		AthleteRepository ar = context.getBean(AthleteRepository.class);
	
//############################	DEFAULT		##################################
		
		/*Optional<Athlete> byId = ar.findById(1);
		if(byId.isPresent()) {
			System.out.println(byId);
		}*/
		
		/*List<Athlete> all = ar.findAll();
		all.forEach(alll ->{
			System.out.println(alll);
		});*/
		
		/*List<Athlete> allById = ar.findAllById(Arrays.asList(1,2,3,4));
		allById.forEach(all->{
			System.out.println(all);
		});*/
		
		/*long count = ar.count();	
		System.out.println(count);*/
		
		/*boolean existsById = ar.existsById(1);
		System.out.println(existsById);*/
		
		
		
		/*ar.deleteById(null);
		
		ar.deleteAllById(Arrays.asList(1,2,3,4,5));
		
		ar.deleteAll();*/
		
//#################################	CUSTOM 	##################################		
		
		
		/*List<Athlete> ame = ar.findByAthleteName("Syam");
			ame.forEach(name ->{
				System.out.println(name);
			});*/
		
		/*List<Athlete> bagc = ar.findByAthleteGenderAndAthleteCountry("male", "BHARAT");
		bagc.forEach(huu->{
			System.out.println(huu.getAthleteName()+" "+huu.getAthleteChestNo());
		});*/
		
		/*List<Athlete> ba = ar.findByAthleteAgeGreaterThanEqual(23);
		ba.forEach(aa->{
			System.out.println(aa.getAthleteAge()+"  "+aa.getAthleteName());
		});*/
		
		/*List<Athlete> bc = ar.findByAthleteCountryIn(Arrays.asList("BHARAT","NETHERLAND"));
		bc.forEach(cc->{
			System.out.println(cc);
		});*/
		
		
	//##################################	HQL		######################################	
		
		
		/*List<Athlete> all = ar.HQLallAthletes();
		all.forEach(aa->{
			System.out.println(aa);
		});*/
			
		/*List<Athlete> hqlCountry = ar.HQLCountry("BHARAT");	
		hqlCountry.forEach(x->{
			System.out.println(x);
		});	*/
			
		/*List<Athlete> hqlCountryAndGender = ar.HQLCountryAndGender("BHARAT", "male");
		hqlCountryAndGender.forEach(d->{
			System.out.println(d);
		});*/	
			
		
	//###############################		NATIVE		#####################################	
		
	/*List<Athlete> sqLallAthletes = ar.SQLallAthletes();
	sqLallAthletes.forEach(z->{
		System.out.println(z);
	});*/
		
	
		
	//###############################	SORTING		######################################
		
	//List<Athlete> all = ar.findAll(Sort.by("athleteChestNo"));
	//List<Athlete> all = ar.findAll(Sort.by("athleteChestNo").descending());	
		List<Athlete> all = ar.findAll(Sort.by("athleteAge","athleteChestNo").descending());	

		all.forEach(a->{
			System.out.println(a.getAthleteAge()+"   "+a.getAthleteChestNo()+"   "+a.getAthleteName());
		});
		
		
		
		
		
		
		
		
		
		
		//AthleteRepository athleteRepository=context.getBean(AthleteRepository.class);
		
		/*List<Athlete> byAthleteCountry = athleteRepository.findByAthleteCountry("BHARAT");
		byAthleteCountry.forEach(athlete ->{
			System.out.println(athlete);
		});
		
		List<Athlete> byGender = athleteRepository.findByAthleteGender("male");
		byGender.forEach(athlete ->{
			System.out.println(athlete);
		});*/
		
		/*List<Athlete> byAthleteAge = athleteRepository.findByAthleteAgeGreaterThanEqual(23);
		byAthleteAge.forEach(athlete ->{
			System.out.println(athlete);
		});
		
		
		List<Athlete> byAthleteCountryIn = athleteRepository.findByAthleteCountryIn(Arrays.asList("BHARAT","NETHERLAND"));
		byAthleteCountryIn.forEach(athlete ->{
			System.out.println(athlete);
		});*/
		
		
		/*List<Athlete> byAthleteAgeAndCountry = athleteRepository.findByAthleteAgeAndAthleteCountry(23, "BHARAT");
		byAthleteAgeAndCountry.forEach(Athlete ->{
			System.out.println(Athlete);
		});*/
		
		
		/*
		List<Athlete> byAthleteAgeAndAthleteCountryAndAthleteGender = athleteRepository.findByAthleteAgeAndAthleteCountryAndAthleteGender(23, "BHARAT", "male");
		byAthleteAgeAndAthleteCountryAndAthleteGender.forEach(Athlete ->{
			System.out.println(Athlete);
		});
		*/
		
		
		
		
		
		
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
