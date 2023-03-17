package org.raspberry.yts.controllers;

import org.raspberry.yts.dtos.listmovies.ListMoviesRequestDTO;
import org.raspberry.yts.dtos.listmovies.ListMoviesResponseDTO;
import org.raspberry.yts.services.ListMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListMoviesController {

	@Autowired
	private ListMoviesService listMoviesService;

	@PostMapping(produces = "application/json", consumes = "application/json", value = "/api/listMovies")
	public ResponseEntity<ListMoviesResponseDTO> listMovies(RequestEntity<ListMoviesRequestDTO> requestEntityDTO) {
		ListMoviesRequestDTO requestDTO = requestEntityDTO.getBody();

		ListMoviesResponseDTO responseDTO = listMoviesService.listMovies(requestDTO);

		return ResponseEntity.status(HttpStatus.OK).body(responseDTO);
	}

}