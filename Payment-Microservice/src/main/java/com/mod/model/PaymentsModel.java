package com.mod.model;

public class PaymentsModel {
	private Long pId;
	private Long userId;
	private Long mentorId;
	private Long trId;
	private String payDate;
	private Double payAmount;
	private Integer installmentNumber;
	private Boolean releasedStatus;

	public PaymentsModel() {
		super();
	}

	public PaymentsModel(Long pId, Long userId, Long mentorId, Long trId, String payDate, Double payAmount,
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
