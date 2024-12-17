package com.syam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.Athlete;

public interface AthleteRepository extends JpaRepository<Athlete, Integer> {
	
	// HERE METHOD NAMES MUST AND SHOULD SAME AS VARIABLE NAME IN CAMEL CASE.....
	
	public List<Athlete> findByAthleteCountry(String AthleteCountryName);
	
	public List<Athlete> findByAthleteGender(String AthleteGender);
	
	public List<Athlete> findByAthleteAgeGreaterThanEqual(Integer age);
	
	public List<Athlete> findByAthleteCountryIn(List<String> countries);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountry(Integer age,String country);
	
	public List<Athlete> findByAthleteAgeAndAthleteCountryAndAthleteGender(Integer age,String country,String gender);
}
