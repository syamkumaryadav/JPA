package com.syam.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.repository.Temporal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
public class ProductOrder {

	@Id
	@Column
	@GenericGenerator(name="order_id_gen",strategy="com.syam.generators.OrderIdGenerator")
	@GeneratedValue(generator ="order_id_gen")
	private String orderId;
	
	@Column
	private String orderName;

	@Column
	//@Temporal(TemporalType.DATE)
	private Date orderDate;
}
