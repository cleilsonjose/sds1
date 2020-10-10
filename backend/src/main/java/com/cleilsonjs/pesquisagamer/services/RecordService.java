package com.cleilsonjs.pesquisagamer.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cleilsonjs.pesquisagamer.dto.RecordDTO;
import com.cleilsonjs.pesquisagamer.dto.RecordInsertDTO;
import com.cleilsonjs.pesquisagamer.entities.Record;
import com.cleilsonjs.pesquisagamer.entities.Game;
import com.cleilsonjs.pesquisagamer.repositories.GameRepository;
import com.cleilsonjs.pesquisagamer.repositories.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity =  new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMonment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
	    entity = repository.save(entity);
		return new RecordDTO(entity);
	}
}

