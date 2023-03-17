package org.raspberry.yts.dtos.moviedetails;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieDetailsResponseDTO {

	@JsonProperty("status")
	private String status;

	@JsonProperty("status_message")
	private String statusMessage;

	@JsonProperty("data")
	private MovieDetailsDataDTO data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public MovieDetailsDataDTO getData() {
		return data;
	}

	public void setData(MovieDetailsDataDTO data) {
		this.data = data;
	}

}
