package com.syam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ATHLETES_TABLE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Athlete {
	@Id
	@Column(name="ATHLETE_CHEST_NO")
	private Integer athleteChestNo;
	
	@Column(name="ATHLETE_NAME")
	private String athleteName;
	
	@Column(name="ATHLETE_AGE")
	private Integer athleteAge;
	
	@Column(name="ATHLETE_GENDER")
	private String athleteGender;
	
	@Column(name="ATHLETE_COUNTRY")
	private String athleteCountry;
}
