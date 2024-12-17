package com.syam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syam.entity.BalayyaBabuFan;

public interface FanRepository extends JpaRepository<BalayyaBabuFan, Integer>{

	public List<BalayyaBabuFan> findAll();

}
