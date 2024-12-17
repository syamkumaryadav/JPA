package com.syam.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.MySource;

public interface MySourceRepository extends JpaRepository<MySource, Serializable>{
	

}
