package com.syam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
