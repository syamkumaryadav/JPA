package com.syam.form;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class MyForm {
	
	@Id
	@Column(length = 2)
	private Integer field1;
	@Column(length = 2)
	private Integer field2;
	@Column(length = 20)
	private String field3;
	@Column(length = 4)
	private Double field4;

}
