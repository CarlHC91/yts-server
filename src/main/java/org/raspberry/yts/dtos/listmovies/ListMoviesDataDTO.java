package org.raspberry.yts.dtos.listmovies;

import java.util.List;

import org.raspberry.yts.dtos.MovieDetailsDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListMoviesDataDTO {

	@JsonProperty("movie_count")
	private Integer movieCount;

	@JsonProperty("limit")
	private Integer limit;

	@JsonProperty("page_number")
	private Integer pageNumber;

	@JsonProperty("movies")
	private List<MovieDetailsDTO> movies;

	public Integer getMovieCount() {
		return movieCount;
	}

	public void setMovieCount(Integer movieCount) {
		this.movieCount = movieCount;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public List<MovieDetailsDTO> getMovies() {
		return movies;
	}

	public void setMovies(List<MovieDetailsDTO> movies) {
		this.movies = movies;
	}

}
