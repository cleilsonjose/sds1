package com.cleilsonjs.pesquisagamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilsonjs.pesquisagamer.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
