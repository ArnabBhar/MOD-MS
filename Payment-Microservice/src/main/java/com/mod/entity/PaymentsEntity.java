package com.mod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class PaymentsEntity {
	@Id
	@GeneratedValue
	@Column(name = "payment_id")
	private Long pId;
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "mentor_id")
	private Long mentorId;
	@Column(name = "training_id")
	private Long trId;
	@Column(name = "payment_date")
	private String payDate;
	@Column(name = "payment_amount")
	private Double payAmount;
	@Column(name = "payment_installment")
	private Integer installmentNumber;
	@Column(name = "released_status")
	private Boolean releasedStatus;

	@ManyToOne(targetEntity = TrainingsEntity.class)
	@JoinColumn(name = "training_id")
	private TrainingsEntity training;

	public void setTraining(TrainingsEntity training) {
		this.training = training;
	}

	@OneToOne(targetEntity = UserDetailsEntity.class)
	@JoinColumn(name = "user_id")
	private UserDetailsEntity userDetails;

	public void setUserDetails(UserDetailsEntity userDetails) {
		this.userDetails = userDetails;
	}

	@OneToOne(targetEntity = MentorDetailsEntity.class)
	@JoinColumn(name = "mentor_id")
	private MentorDetailsEntity mentorDetails;

	public void setMentorDetails(MentorDetailsEntity mentorDetails) {
		this.mentorDetails = mentorDetails;
	}

	public PaymentsEntity() {
		super();
	}

	public PaymentsEntity(Long pId, Long userId, Long mentorId, Long trId, String payDate, Double payAmount,
			Integer installmentNumber, Boolean releasedStatus) {
		super();
		this.pId = pId;
		this.userId = userId;
		this.mentorId = mentorId;
		this.trId = trId;
		this.payDate = payDate;
		this.payAmount = payAmount;
		this.installmentNumber = installmentNumber;
		this.releasedStatus = releasedStatus;
	}

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
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

	public Long getTrId() {
		return trId;
	}

	public void setTrId(Long trId) {
		this.trId = trId;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public Double getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(Double payAmount) {
		this.payAmount = payAmount;
	}

	public Integer getInstallmentNumber() {
		return installmentNumber;
	}

	public void setInstallmentNumber(Integer installmentNumber) {
		this.installmentNumber = installmentNumber;
	}

	public Boolean getReleasedStatus() {
		return releasedStatus;
	}

	public void setReleasedStatus(Boolean releasedStatus) {
		this.releasedStatus = releasedStatus;
	}

}
