package com.syam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class UserEntity {

	@Id
	@Column(length = 2)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer UserId;

	@Column(length = 5)
	private String userName;

	@Column(length = 20)
	private String userEmail;

	@Column
	@Lob
	private byte[] userImage;

}
