package org.raspberry.yts.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TorrentDetailsDTO {

	@JsonProperty("url")
	private String url;

	@JsonProperty("hash")
	private String hash;

	@JsonProperty("quality")
	private String quality;

	@JsonProperty("seeds")
	private Integer seeds;

	@JsonProperty("peers")
	private Integer peers;

	@JsonProperty("size")
	private String size;

	@JsonProperty("size_bytes")
	private Long size_bytes;

	@JsonProperty("date_uploaded")
	private String dateUploaded;

	@JsonProperty("date_uploaded_unix")
	private Long dateUploadedUnix;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public Integer getSeeds() {
		return seeds;
	}

	public void setSeeds(Integer seeds) {
		this.seeds = seeds;
	}

	public Integer getPeers() {
		return peers;
	}

	public void setPeers(Integer peers) {
		this.peers = peers;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Long getSize_bytes() {
		return size_bytes;
	}

	public void setSize_bytes(Long size_bytes) {
		this.size_bytes = size_bytes;
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
