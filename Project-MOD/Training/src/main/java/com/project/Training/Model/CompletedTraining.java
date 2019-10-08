package com.project.Training.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CompletedTraining {
	@Id
	private long tId;
	
	
	@ManyToOne
	private UserDtls userDtls;
	
	@ManyToOne
	private MentorDetail mentorDtls;
	
	private String tName;
	private String startDate;
	private String endDate;
	public CompletedTraining() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompletedTraining(long tId, String tName, String startDate, String endDate) {
		super();
		this.tId = tId;
		this.tName = tName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public CompletedTraining(long tId, UserDtls userDtls, MentorDetail mentorDtls, String tName, String startDate,
			String endDate) {
		super();
		this.tId = tId;
		this.userDtls = userDtls;
		this.mentorDtls = mentorDtls;
		this.tName = tName;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	public long gettId() {
		return tId;
	}
	public void settId(long tId) {
		this.tId = tId;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
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
	
	public UserDtls getUserDtls() {
		return userDtls;
	}
	public void setUserDtls(UserDtls userDtls) {
		this.userDtls = userDtls;
	}
	public MentorDetail getMentorDtls() {
		return mentorDtls;
	}
	public void setMentorDtls(MentorDetail mentorDtls) {
		this.mentorDtls = mentorDtls;
	}
	@Override
	public String toString() {
		return "CompletedTraining [tId=" + tId + ", userDtls=" + userDtls + ", mentorDtls=" + mentorDtls + ", tName="
				+ tName + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	

}
