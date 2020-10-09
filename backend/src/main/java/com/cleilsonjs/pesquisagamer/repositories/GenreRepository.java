package com.cleilsonjs.pesquisagamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleilsonjs.pesquisagamer.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
