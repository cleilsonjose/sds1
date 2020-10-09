package com.cleilsonjs.pesquisagamer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleilsonjs.pesquisagamer.entities.Record;

@Repository
public interface RecordRepository extends JpaRepository<Record, Long>{

}
