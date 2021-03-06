package com.mod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Positive;

@Entity
@Table(name = "mentor")
public class MentorDetailsEntity {
	@Id
	@GeneratedValue
	@Column(name = "mentor_id")
	private Long id;
	@Column(name = "mentor_name")
	private String userName;
	@Column(name = "mentor_password")
	private String password;
	@Column(name = "mentor_fullname")
	private String name;
	@Column(name = "present_address")
	private String presentAddress;
	@Column(name = "permanent_address")
	private String permanentAddress;
	@Column(name = "NID_number")
	private String NID;
	@Column(name = "ph_no")
	@Positive(message = "Contact number should be positive value")
	private String phNo;
	@Column(name = "years_experience")
	private String yearsOfExp;
	@Column(name = "linkedin_url")
	private String linkedInURL;

	public MentorDetailsEntity() {
		super();
	}

	public MentorDetailsEntity(Long id, String userName, String password, String name, String presentAddress,
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
