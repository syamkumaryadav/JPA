package com.syam.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class PrimaryKeysClass implements Serializable {
	
	@Column(length = 3)
	private Integer pk1;
	
	@Column(length = 10)
	private String pk2;
	
	@Column(length = 3)
	private Integer pk3;

}
