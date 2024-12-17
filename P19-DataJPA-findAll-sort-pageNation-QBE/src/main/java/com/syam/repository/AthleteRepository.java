package com.syam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.syam.entity.Athlete;
@Repository
public interface AthleteRepository extends JpaRepository<Athlete, Integer> {
	
	
	//=====================================	  DEFAULT (findByMethods all are STATIC Methods)   =============================================
	
	// HERE METHOD NAMES MUST AND SHOULD SAME AS VARIABLE NAME IN CAMEL CASE.....
	
	/*public List<Athlete> findByAthleteCountry(String AthleteCountryName);
	
	public List<Athlete> findByAthleteGender(String AthleteGender);
	
	public List<Athlete> findByAthleteAgeGreaterThanEqual(Integer age);
	
	public List<Athlete> findByAthleteCountryIn(List<String> countries);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountry(Integer age,String country);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountryAndAthleteGender(Integer age,String country,String gender);
	
	*/
	
	
	
	
	//=========================================		CUSTOM & NATIVE		=======================================
	
	
	/*@Query(value="From Athlete") 	// HERE GIVE ENTITY CLASS NAME.....
	public List<Athlete> allAthletes();
	
	@Query(value="select * from Athletes_table", nativeQuery = true)
	public List<Athlete> nativeAllAthletes();
		
	@Query(value="from Athlete where athleteCountry=:countryName")
	public List<Athlete> countryN(String countryName);
	
	@Query(value="select * from athletes_table where ATHLETE_COUNTRY=:cName",nativeQuery = true)	// HERE GIVE TABLE COLUMN NAME.....
	public List<Athlete> nativeCountryNames(String cName);
	
	@Query(value="from Athlete where athleteCountry=:cName AND athleteChestNo=:cN")
	public List<Athlete> customRetrive(String cName,Integer cN);
	
	@Query(value="select * from athletes_table where ATHLETE_COUNTRY=:cName AND ATHLETE_GENDER=:gN", nativeQuery = true)
	public List<Athlete> myCustom(String cName,Integer gN);
	
	@Query(value="Update athletes_table set ATHLETE_COUNTRY=:cName where ATHLETE_CHEST_NO=:cN", nativeQuery = true)
	public List<Athlete> myCustomUpdata(String cName,Integer cN);
	*/
	
	
	//===================================	  findAll-sort-pageNation-QBE		================================================
	
	
	//Query Based Example(QEB) and sorting / pagination is possible...
	
}
