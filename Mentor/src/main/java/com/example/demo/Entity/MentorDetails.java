package com.example.demo.Entity;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mentor_details")
public class MentorDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="mentor_id")
	private Integer mentorId;
	@Column(name="mentor_name")
	private String mentorName;
	@Column(name="mentor_email")
	private String mentorEmail;
	@Column(name="mentor_years_exp")
	private Integer mentorYearsExp;
	@Column(name="mentor_linkdin_url")
	private String mentorLinkdinUrl;
	@Column(name="mentor_phone")
	private String mentorPhone;
	@Column(name="no_of_trainings")
	private Integer trainings;
	@Column(name="rating")
	private float rating;
	
	
	
	public MentorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@OneToMany(mappedBy = "md",cascade = CascadeType.ALL)
	private List<MentorSkills> ms;
	@JsonIgnore
	public List<MentorSkills> getMs() {
		return ms;
	}
	public void setMs(List<MentorSkills> ms) {
		this.ms = ms;
	}
	public Integer getMentorId() {
		return mentorId;
	}
	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
	public String getMentorName() {
		return mentorName;
	}
	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}
	public MentorDetails(Integer mentorId, String mentorName, String mentorEmail, Integer mentorYearsExp,
			String mentorLinkdinUrl, String mentorPhone, Integer trainings, float rating) {
		super();
		this.mentorId = mentorId;
		this.mentorName = mentorName;
		this.mentorEmail = mentorEmail;
		this.mentorYearsExp = mentorYearsExp;
		this.mentorLinkdinUrl = mentorLinkdinUrl;
		this.mentorPhone = mentorPhone;
		this.trainings = trainings;
		this.rating = rating;
		
	}
	public String getMentorEmail() {
		return mentorEmail;
	}
	public void setMentorEmail(String mentorEmail) {
		this.mentorEmail = mentorEmail;
	}
	public Integer getMentorYearsExp() {
		return mentorYearsExp;
	}
	public void setMentorYearsExp(Integer mentorYearsExp) {
		this.mentorYearsExp = mentorYearsExp;
	}
	public String getMentorLinkdinUrl() {
		return mentorLinkdinUrl;
	}
	public void setMentorLinkdinUrl(String mentorLinkdinUrl) {
		this.mentorLinkdinUrl = mentorLinkdinUrl;
	}
	public String getMentorPhone() {
		return mentorPhone;
	}
	public void setMentorPhone(String mentorPhone) {
		this.mentorPhone = mentorPhone;
	}
	public Integer getTrainings() {
		return trainings;
	}
	public void setTrainings(Integer trainings) {
		this.trainings = trainings;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	
}