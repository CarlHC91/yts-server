package org.raspberry.yts.dtos.moviedetails;

import org.raspberry.yts.dtos.MovieDetailsDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDetailsDataDTO {

	@JsonProperty("movie")
	private MovieDetailsDTO movie;

	public MovieDetailsDTO getMovie() {
		return movie;
	}

	public void setMovie(MovieDetailsDTO movie) {
		this.movie = movie;
	}

}
