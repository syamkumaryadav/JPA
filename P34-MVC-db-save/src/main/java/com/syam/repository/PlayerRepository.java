package com.syam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.syam.entity.Player;


@EnableJpaRepositories
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
