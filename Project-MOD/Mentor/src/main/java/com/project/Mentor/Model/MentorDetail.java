package com.project.Mentor.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class MentorDetail {

	@Id
	private long mentorId;
	private String mentorName;

	@OneToMany
	private List<MentorSkills> mentorSkills;
	
	
	@OneToOne
	private MentorCalender mentorCalender;
	
	@Override
	public String toString() {
		return "MentorDetails [mentorId=" + mentorId + ", mentorName=" + mentorName + "]";
	}

	public MentorDetail(long mentorId, String mentorName) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public MentorDetail() {
		// TODO Auto-generated constructor stub
	}

}

