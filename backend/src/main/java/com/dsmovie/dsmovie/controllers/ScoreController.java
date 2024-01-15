package com.dsmovie.dsmovie.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsmovie.dsmovie.dto.MovieDTO;
import com.dsmovie.dsmovie.dto.ScoreDTO;
import com.dsmovie.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService scoreService;
	
	@PutMapping
	public MovieDTO SaveScore(@RequestBody ScoreDTO dto) {
		MovieDTO movieDto = scoreService.saveScore(dto);
		return movieDto;
	}
}
