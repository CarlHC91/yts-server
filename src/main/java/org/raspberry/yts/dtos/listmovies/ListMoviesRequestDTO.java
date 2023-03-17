package org.raspberry.yts.dtos.listmovies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListMoviesRequestDTO {

	@JsonProperty("limit")
	private Integer limit;

	@JsonProperty("page")
	private Integer page;

	@JsonProperty("quality")
	private String quality;

	@JsonProperty("minimum_rating")
	private Integer minimumRating;

	@JsonProperty("query_term")
	private String queryTerm;

	@JsonProperty("genre")
	private String genre;

	@JsonProperty("sort_by")
	private String sortBy;

	@JsonProperty("order_by")
	private String orderBy;

	@JsonProperty("with_rt_ratings")
	private Boolean withRtRatings;

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Integer getMinimumRating() {
		return minimumRating;
	}

	public void setMinimumRating(Integer minimumRating) {
		this.minimumRating = minimumRating;
	}

	public String getQueryTerm() {
		return queryTerm;
	}

	public void setQueryTerm(String queryTerm) {
		this.queryTerm = queryTerm;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSortBy() {
		return sortBy;
	}

	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public Boolean getWithRtRatings() {
		return withRtRatings;
	}

	public void setWithRtRatings(Boolean withRtRatings) {
		this.withRtRatings = withRtRatings;
	}

}
