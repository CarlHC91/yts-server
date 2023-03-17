package org.raspberry.yts.controllers;

import org.raspberry.yts.dtos.moviesuggestions.MovieSuggestionsRequestDTO;
import org.raspberry.yts.dtos.moviesuggestions.MovieSuggestionsResponseDTO;
import org.raspberry.yts.services.MovieSuggestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieSuggestionsController {

	@Autowired
	private MovieSuggestionsService movieSuggestionsService;

	@PostMapping(produces = "application/json", consumes = "application/json", value = "/api/movieSuggestions")
	public ResponseEntity<MovieSuggestionsResponseDTO> movieSuggestions(RequestEntity<MovieSuggestionsRequestDTO> requestEntityDTO) {
		MovieSuggestionsRequestDTO requestDTO = requestEntityDTO.getBody();

		MovieSuggestionsResponseDTO responseDTO = movieSuggestionsService.movieSuggestions(requestDTO);

		return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
	}

}