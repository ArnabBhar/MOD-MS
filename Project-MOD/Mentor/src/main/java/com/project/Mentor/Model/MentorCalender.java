package com.project.Mentor.Model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MentorCalender {
	@Id
	private long mentorCalenderId;
	private Date startDate;
	private Date endDate;
	private long mentorId;

	public MentorCalender(long mentorCalenderId, Date startDate, Date endDate, long mentorId) {
		super();
		this.mentorCalenderId = mentorCalenderId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.mentorId = mentorId;
	}

	public MentorCalender() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getMentorCalenderId() {
		return mentorCalenderId;
	}

	public void setMentorCalenderId(long mentorCalenderId) {
		this.mentorCalenderId = mentorCalenderId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	@Override
	public String toString() {
		return "MentorCalender [mentorCalenderId=" + mentorCalenderId + ", startDate=" + startDate + ", endDate="
				+ endDate + ", mentorId=" + mentorId + "]";
	}

}
