package com.cleilsonjs.pesquisagamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilsonjs.pesquisagamer.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
