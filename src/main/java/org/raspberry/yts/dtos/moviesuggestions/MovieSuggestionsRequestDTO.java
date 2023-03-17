package org.raspberry.yts.dtos.moviesuggestions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieSuggestionsRequestDTO {

	@JsonProperty("movie_id")
	private Integer movieId;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

}
