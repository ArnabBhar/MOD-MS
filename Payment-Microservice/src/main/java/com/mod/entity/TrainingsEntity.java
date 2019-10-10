package com.mod.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "trainings")
public class TrainingsEntity {
	@Id
	@GeneratedValue
	@Column(name = "training_id")
	private Long trId;
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "mentor_id")
	private Long mentorId;
	@Column(name = "tech_id")
	private Long techId;
	@Column(name = "progress")
	private Integer progress;
	@Column(name = "fees")
	private Double fees;
	@Column(name = "status")
	private String status;
	@Column(name = "start_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String startDate;
	@Column(name = "end_date")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String endDate;
	@Column(name = "rating")
	private Double rating;
	@Column(name = "time_slot")
	private String timeSlot;
	@Column(name = "payment_status")
	private String payStatus;

	@ManyToOne(targetEntity = UserDetailsEntity.class)
	@JoinColumn(name = "user_id")
	private UserDetailsEntity trainingUser;

	public void setTrainingUser(UserDetailsEntity trainingUser) {
		this.trainingUser = trainingUser;
	}

	@ManyToOne(targetEntity = MentorDetailsEntity.class)
	@JoinColumn(name = "mentor_id")
	private MentorDetailsEntity trainingMentor;

	public void setTrainingMentor(MentorDetailsEntity trainingMentor) {
		this.trainingMentor = trainingMentor;
	}

	@OneToMany(targetEntity = PaymentsEntity.class, cascade = { CascadeType.ALL })
	@JoinColumn(name = "payment_id")
	private List<PaymentsEntity> payments;

	public void setPayments(List<PaymentsEntity> payments) {
		this.payments = payments;
	}

	public TrainingsEntity() {
		super();
	}

	public TrainingsEntity(Long trId, Long userId, Long mentorId, Long techId, Integer progress, Double fees,
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
