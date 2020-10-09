package com.cleilsonjs.pesquisagamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleilsonjs.pesquisagamer.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
