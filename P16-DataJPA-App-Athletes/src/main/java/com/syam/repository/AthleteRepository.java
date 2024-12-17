package com.syam.repository;

import org.springframework.data.repository.CrudRepository;

import com.syam.entity.Athlete;

public interface AthleteRepository extends CrudRepository<Athlete, Integer> {

}
