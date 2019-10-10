package com.mod.model;

import javax.validation.constraints.Positive;

public class MentorDetailsModel {
	private Long id;
	private String userName;
	private String password;
	private String name;
	private String presentAddress;
	private String permanentAddress;
	private String NID;
	@Positive(message = "Contact number should be positive value")
	private String phNo;
	private String yearsOfExp;
	private String linkedInURL;

	public MentorDetailsModel() {
		super();
	}

	public MentorDetailsModel(Long id, String userName, String password, String name, String presentAddress,
			String permanentAddress, String nID, String phNo, String yearsOfExp, String linkedInURL) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.presentAddress = presentAddress;
		this.permanentAddress = permanentAddress;
		NID = nID;
		this.phNo = phNo;
		this.yearsOfExp = yearsOfExp;
		this.linkedInURL = linkedInURL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPresentAddress() {
		return presentAddress;
	}

	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public String getNID() {
		return NID;
	}

	public void setNID(String nID) {
		NID = nID;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getYearsOfExp() {
		return yearsOfExp;
	}

	public void setYearsOfExp(String yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

	public String getLinkedInURL() {
		return linkedInURL;
	}

	public void setLinkedInURL(String linkedInURL) {
		this.linkedInURL = linkedInURL;
	}

}
