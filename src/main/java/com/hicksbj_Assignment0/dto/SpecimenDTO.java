package com.hicksbj_Assignment0.dto;

public class SpecimenDTO {

	private int specimenId;
	private String latitude;
	private String logitude;
	private String description;
	
	public int getSpecimenId() {
		return specimenId;
	}
	public void setSpecimenId(int specimenId) {
		this.specimenId = specimenId;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLogitude() {
		return logitude;
	}
	public void setLogitude(String logitude) {
		this.logitude = logitude;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return specimenId + " " + latitude + " " + logitude + " " + description;
	}
}
