package com.syam.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class BalayyaBabuFan {
	
	@Id
	//@GeneratedValue		// here spring maintain seperate table for generating primary keys. so,
	@GeneratedValue(strategy = GenerationType.SEQUENCE)		// here  GENERATORS---->  Oracle: SEQUENCE  &&& mySql: IDENTITY
	@Column
	private Integer fanMobileNumber;		// Primitive { int } data :==take 0 when we not insert any value & @GeneratedValue this also not applicable(primary key generation..) 
											// WRapper { Integer } class :== take NULL value when we not insert any value
	@Column
	private String fanName;
	
	@Column
	private String fanVillage;
	
	@CreationTimestamp			//------>  show time & date when we CREATE the table...........
	@Column(updatable=	false)
	//private LocalDate createFanDate;		//------>only for date
	private LocalDateTime createFanDate;	//------> for both time & date
	
	@UpdateTimestamp			//------>  show time & date when we UPDATE the table...........
	@Column(insertable = false)
	//private LocalDate updateFanDate;		//------>only for date
	private LocalDateTime updateFanDate;	//------> for both time & date
	
	

}
