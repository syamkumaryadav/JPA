package com.syam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MySource {

	@Id
	@Column(length = 3)
	private Integer commonId;
	
	@Column(length = 3)
	private String col2;
}
