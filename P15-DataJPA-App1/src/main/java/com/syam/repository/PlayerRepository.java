package com.syam.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.syam.entity.Player;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
