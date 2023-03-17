package org.raspberry.yts.dtos.moviesuggestions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MovieSuggestionsResponseDTO {

	@JsonProperty("status")
	private String status;

	@JsonProperty("status_message")
	private String statusMessage;

	@JsonProperty("data")
	private MovieSuggestionsDataDTO data;

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

	public MovieSuggestionsDataDTO getData() {
		return data;
	}

	public void setData(MovieSuggestionsDataDTO data) {
		this.data = data;
	}

}
