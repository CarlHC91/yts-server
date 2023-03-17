package org.raspberry.yts.dtos.moviesuggestions;

import java.util.List;

import org.raspberry.yts.dtos.MovieDetailsDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieSuggestionsDataDTO {

	@JsonProperty("movie_count")
	private Integer movieCount;

	@JsonProperty("movies")
	private List<MovieDetailsDTO> movies;

	public Integer getMovieCount() {
		return movieCount;
	}

	public void setMovieCount(Integer movieCount) {
		this.movieCount = movieCount;
	}

	public List<MovieDetailsDTO> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieDetailsDTO> movies) {
		this.movies = movies;
	}

}
