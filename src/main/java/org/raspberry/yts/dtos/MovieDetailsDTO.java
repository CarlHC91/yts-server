package org.raspberry.yts.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDetailsDTO {

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("url")
	private String url;

	@JsonProperty("imdb_code")
	private String imdbCode;

	@JsonProperty("title")
	private String title;

	@JsonProperty("title_english")
	private String titleEnglish;

	@JsonProperty("title_long")
	private String titleLong;

	@JsonProperty("slug")
	private String slug;

	@JsonProperty("year")
	private Integer year;

	@JsonProperty("rating")
	private Double rating;

	@JsonProperty("runtime")
	private Integer runtime;

	@JsonProperty("genres")
	private List<String> genres;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("description_full")
	private String descriptionFull;

	@JsonProperty("synopsis")
	private String synopsis;

	@JsonProperty("yt_trailer_code")
	private String ytTrailerCode;

	@JsonProperty("language")
	private String language;

	@JsonProperty("mpa_rating")
	private String mpaRating;

	@JsonProperty("background_image")
	private String backgroundImage;

	@JsonProperty("background_image_original")
	private String backgroundImageOriginal;

	@JsonProperty("small_cover_image")
	private String smallCoverImage;

	@JsonProperty("medium_cover_image")
	private String mediumCoverImage;

	@JsonProperty("state")
	private String state;

	@JsonProperty("torrents")
	private List<TorrentDetailsDTO> torrents;

	@JsonProperty("date_uploaded")
	private String dateUploaded;

	@JsonProperty("date_uploaded_unix")
	private Long dateUploadedUnix;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImdbCode() {
		return imdbCode;
	}

	public void setImdbCode(String imdbCode) {
		this.imdbCode = imdbCode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitleEnglish() {
		return titleEnglish;
	}

	public void setTitleEnglish(String titleEnglish) {
		this.titleEnglish = titleEnglish;
	}

	public String getTitleLong() {
		return titleLong;
	}

	public void setTitleLong(String titleLong) {
		this.titleLong = titleLong;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescriptionFull() {
		return descriptionFull;
	}

	public void setDescriptionFull(String descriptionFull) {
		this.descriptionFull = descriptionFull;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getYtTrailerCode() {
		return ytTrailerCode;
	}

	public void setYtTrailerCode(String ytTrailerCode) {
		this.ytTrailerCode = ytTrailerCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMpaRating() {
		return mpaRating;
	}

	public void setMpaRating(String mpaRating) {
		this.mpaRating = mpaRating;
	}

	public String getBackgroundImage() {
		return backgroundImage;
	}

	public void setBackgroundImage(String backgroundImage) {
		this.backgroundImage = backgroundImage;
	}

	public String getBackgroundImageOriginal() {
		return backgroundImageOriginal;
	}

	public void setBackgroundImageOriginal(String backgroundImageOriginal) {
		this.backgroundImageOriginal = backgroundImageOriginal;
	}

	public String getSmallCoverImage() {
		return smallCoverImage;
	}

	public void setSmallCoverImage(String smallCoverImage) {
		this.smallCoverImage = smallCoverImage;
	}

	public String getMediumCoverImage() {
		return mediumCoverImage;
	}

	public void setMediumCoverImage(String mediumCoverImage) {
		this.mediumCoverImage = mediumCoverImage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<TorrentDetailsDTO> getTorrents() {
		return torrents;
	}

	public void setTorrents(List<TorrentDetailsDTO> torrents) {
		this.torrents = torrents;
	}

	public String getDateUploaded() {
		return dateUploaded;
	}

	public void setDateUploaded(String dateUploaded) {
		this.dateUploaded = dateUploaded;
	}

	public Long getDateUploadedUnix() {
		return dateUploadedUnix;
	}

	public void setDateUploadedUnix(Long dateUploadedUnix) {
		this.dateUploadedUnix = dateUploadedUnix;
	}

}
