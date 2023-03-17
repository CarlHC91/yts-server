package org.raspberry.yts.dtos.listmovies;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListMoviesResponseDTO {

	@JsonProperty("status")
	private String status;

	@JsonProperty("status_message")
	private String statusMessage;

	@JsonProperty("data")
	private ListMoviesDataDTO data;

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

	public ListMoviesDataDTO getData() {
		return data;
	}

	public void setData(ListMoviesDataDTO data) {
		this.data = data;
	}

}
