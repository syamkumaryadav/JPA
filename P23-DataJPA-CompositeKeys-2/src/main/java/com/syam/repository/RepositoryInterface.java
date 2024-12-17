package com.syam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.EntityClass;
import com.syam.entity.PrimaryKeysClass;

public interface RepositoryInterface extends JpaRepository<EntityClass, PrimaryKeysClass> {

}
