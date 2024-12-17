package com.syam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class EntityClass {
	
	@Column(length = 3)
	private Integer col1;
	
	@Column(length = 3)
	private Integer col2;
	
	@Column(length = 10)
	private String col3;
	
	@EmbeddedId
	private PrimaryKeysClass pkc;
	

}
