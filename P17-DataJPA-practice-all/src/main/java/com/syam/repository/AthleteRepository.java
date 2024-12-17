package com.syam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syam.entity.Athlete;


@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Integer> {
	
	// HERE METHOD NAMES MUST AND SHOULD SAME AS VARIABLE NAME IN CAMEL CASE.....
	
	// from  CUSTOM Queryes onwords use @Repository 
	
	/*public List<Athlete> findByAthleteName(String name);
	
	public List<Athlete> findByAthleteGenderAndAthleteCountry(String g,String c);
	
	public List<Athlete> findByAthleteAgeGreaterThanEqual(Integer a);
	
	public List<Athlete> findByAthleteCountryIn(List<String> c);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountry();*/

	
	
//########################################################################################	
	
	
	
	
	/*@Query(value="from Athlete")	//----->>>> here give entity name and entity field names only not table names.
	public List<Athlete> HQLallAthletes();
	
	@Query(value="from Athlete where athleteCountry=:c")
	public List<Athlete> HQLCountry(String c);
	
	@Query(value = "from Athlete where athleteCountry=:s And athleteGender=:g")
	public List<Athlete> HQLCountryAndGender(String s,String g);*/
	
	
	
	
//#########################################################################################	
	
	@Query(value="select * from ATHLETES_TABLE", nativeQuery = true)	
	public List<Athlete> SQLallAthletes();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public List<Athlete> findByAthleteCountry(String AthleteCountryName);
	
	public List<Athlete> findByAthleteGender(String AthleteGender);
	
	public List<Athlete> findByAthleteAgeGreaterThanEqual(Integer age);
	
	public List<Athlete> findByAthleteCountryIn(List<String> countries);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountry(Integer age,String country);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountryAndAthleteGender(Integer age,String country,String gender);
	*/
}
