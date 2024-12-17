package com.syam;

import java.util.List; 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import com.syam.entity.Athlete;
import com.syam.repository.AthleteRepository;

@SpringBootApplication
public class P16DataJpaAppAthletesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(P16DataJpaAppAthletesApplication.class, args);

		AthleteRepository athleteRepository = context.getBean(AthleteRepository.class);

		// ========================================Iterable===================================

		/*Iterable<Athlete> findall = athleteRepository.findAll();
		findall.forEach(Athlete ->{
			System.out.println(Athlete);
		});*/

		/*Athlete athlete = new Athlete(7, "Demadu Naidu", 14, "male", "BHARAT");
		Athlete athlete1 = new Athlete(10, "Satish", 9, "male", "BHARAT");
		Athlete athlete1=new Athlete(8,"Ram Kumar",22,"male","INDIA");
		Athlete athlete2=new Athlete(9,"Presad",23,"male","BHARAT");
		athleteRepository.saveAll(Arrays.asList(athlete, athlete1));*/

		// ========================================  List  ===================================

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

		// ------------------------------------HQL RETRIVE BY 1 VALUES CONDTIONS
		// ------------------------------------------

		/*List<Athlete> country = athleteRepository.countryN("NETHERLAND");
		country.forEach(countryy ->{
			System.out.println(countryy);
		});
		
		
		
		//------------------------------------SQL RETRIVE BY 1 VALUES CONDTIONS ------------------------------------------
		
		List<Athlete> nativeCountry = athleteRepository.nativeCountryNames("BHARAT");
		nativeCountry.forEach(nativeCountryy ->{
			System.out.println(nativeCountryy);
		});*/

		// ------------------------------------SQL RETRIVE BY 2 VALUES CONDTIONS
		// ------------------------------------------

		/*List<Athlete> customRetrive = athleteRepository.customRetrive("BHARAT", 1);
		customRetrive.forEach(cr->{
			System.out.println(cr);
		});*/

		// ------------------------------------SQL
		// UPDATE------------------------------------------

		/*List<Athlete> myCustomUpdata = athleteRepository.myCustomUpdata("ANDHRA", 8);
		myCustomUpdata.forEach(cc ->{
			System.out.println(cc);
		});*/

		// ============================================= SORTING	======================================

		// List<Athlete> allAthletes = athleteRepository.findAll(Sort.by("athleteChestNo").ascending());
		// List<Athlete> allAthletes = athleteRepository.findAll(Sort.by("athleteChestNo").descending());
		// List<Athlete> allAthletes = athleteRepository.findAll(Sort.by("athleteGender","athleteName").ascending());     //Different output according to asking peramaters order.......
		// List<Athlete> allAthletes = athleteRepository.findAll(Sort.by("athleteName","athleteGender").ascending());
		/*List<Athlete> allAthletes = athleteRepository.findAll(Sort.by("athleteCountry"));
		allAthletes.forEach(aa ->{
			System.out.println(aa);
		});*/

		// ========================================== PAGENATION ================================================

		/*int pageSize=5;
		int pageNo=1;
		PageRequest of = PageRequest.of(pageNo, pageSize);
		Page<Athlete> all = athleteRepository.findAll(of);
		all.forEach(aa ->{
			System.out.println(aa);
		});
		*/
		
		
		// **************************** PAGINATION & SORTING NOT POSSIBLE AT A TIME		**********************

		/*PageRequest of = PageRequest.of(0, 5);
		Page<Athlete> all = athleteRepository.findAll(of);
		all.forEach(aa ->{
			System.out.println(aa);
		});
		
		
		int totalPages = all.getTotalPages();
		System.out.println(totalPages);*/

		
		
		/*Athlete athlete = new Athlete();	// for dynamic querys 
		athlete.setAthleteAge(23);
		athlete.setAthleteChestNo(1);
		
		Example<Athlete> Ea = Example.of(athlete);
		List<Athlete> all = athleteRepository.findAll(Ea);
		all.forEach(QBE ->{
			System.out.println(QBE);
		});*/
		
		
		//============================		QUERY BY EXAMPLE 	=====================================
		
		//Query Based Example(QEB) and sorting / pagination is possible...
		
		// Create an Athlete instance for the dynamic query
		Athlete athlete = new Athlete();
		athlete.setAthleteGender("male");
		athlete.setAthleteCountry("BHARAT");

		// Create an Example with the athlete instance
		Example<Athlete> exampleAthlete = Example.of(athlete);

		// Perform the query with Example and Sort combined
		List<Athlete> allAthletesSorted = athleteRepository.findAll(exampleAthlete, Sort.by("athleteCountry"));

		// Print the results
		allAthletesSorted.forEach(athleteResult -> {
		    System.out.println(athleteResult);
		});


	}

}
