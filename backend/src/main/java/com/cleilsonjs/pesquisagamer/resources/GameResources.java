package com.cleilsonjs.pesquisagamer.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleilsonjs.pesquisagamer.dto.GameDTO;
import com.cleilsonjs.pesquisagamer.entities.Game;
import com.cleilsonjs.pesquisagamer.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResources {
	
	@Autowired
	private GameService service;
	
	@GetMapping
	public ResponseEntity<List<GameDTO>> findAll(){
		List<GameDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
