package org.raspberry.yts.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDetailsDTO {

	@JsonProperty("status")
	private String status;

	@JsonProperty("status_message")
	private String statusMessage;

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

}
