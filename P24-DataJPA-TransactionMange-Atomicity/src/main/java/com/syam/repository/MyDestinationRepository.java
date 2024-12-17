package com.syam.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.MyDestination;

public interface MyDestinationRepository extends JpaRepository<MyDestination, Serializable>{

}
