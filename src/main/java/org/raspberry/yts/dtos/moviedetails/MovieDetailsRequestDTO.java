package org.raspberry.yts.dtos.moviedetails;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDetailsRequestDTO {

	@JsonProperty("movie_id")
	private Integer movieId;

	@JsonProperty("with_images")
	private Boolean withImages;

	@JsonProperty("with_cast")
	private Boolean withCast;

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Boolean getWithImages() {
		return withImages;
	}

	public void setWithImages(Boolean withImages) {
		this.withImages = withImages;
	}

	public Boolean getWithCast() {
		return withCast;
	}

	public void setWithCast(Boolean withCast) {
		this.withCast = withCast;
	}

}
