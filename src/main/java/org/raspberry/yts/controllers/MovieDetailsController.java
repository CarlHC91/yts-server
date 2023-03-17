package org.raspberry.yts.controllers;

import org.raspberry.yts.dtos.moviedetails.MovieDetailsRequestDTO;
import org.raspberry.yts.dtos.moviedetails.MovieDetailsResponseDTO;
import org.raspberry.yts.services.MovieDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieDetailsController {

	@Autowired
	private MovieDetailsService movieDetailsService;

	@PostMapping(produces = "application/json", consumes = "application/json", value = "/api/movieDetails")
	public ResponseEntity<MovieDetailsResponseDTO> movieDetails(RequestEntity<MovieDetailsRequestDTO> requestEntityDTO) {
		MovieDetailsRequestDTO requestDTO = requestEntityDTO.getBody();

		MovieDetailsResponseDTO responseDTO = movieDetailsService.movieDetails(requestDTO);

		return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
	}

}