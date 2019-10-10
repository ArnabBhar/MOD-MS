package com.mod.model;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TrainingsModel {
	private Long trId;
	private Long userId;
	private Long mentorId;
	private Long techId;
	private Integer progress;
	private Double fees;
	private String status;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String startDate;
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String endDate;
	private Double rating;
	private String timeSlot;
	private String payStatus;

	public TrainingsModel() {
		super();
	}

	public TrainingsModel(Long trId, Long userId, Long mentorId, Long techId, Integer progress, Double fees,
			String status, String startDate, String endDate, Double rating, String timeSlot, String payStatus) {
		super();
		this.trId = trId;
		this.userId = userId;
		this.mentorId = mentorId;
		this.techId = techId;
		this.progress = progress;
		this.fees = fees;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rating = rating;
		this.timeSlot = timeSlot;
		this.payStatus = payStatus;
	}

	public Long getTrId() {
		return trId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMentorId() {
		return mentorId;
	}

	public void setMentorId(Long mentorId) {
		this.mentorId = mentorId;
	}

	public Long getTechId() {
		return techId;
	}

	public void setTechId(Long techId) {
		this.techId = techId;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

}
