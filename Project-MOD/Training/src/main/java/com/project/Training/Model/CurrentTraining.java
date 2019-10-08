package com.project.Training.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CurrentTraining {

	@Id
	private long compId;
	
	@ManyToOne
	private UserDtls userDtls;
	
	@ManyToOne
	private MentorDetail mentorDtls;
	
	private String trainingName;
	private int progress;
	
	public CurrentTraining() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CurrentTraining(long compId, String trainingName, int progress) {
		super();
		this.compId = compId;
		this.trainingName = trainingName;
		this.progress = progress;
	}
	
	public CurrentTraining(long compId, UserDtls userDtls, MentorDetail mentorDtls, String trainingName, int progress) {
		super();
		this.compId = compId;
		this.userDtls = userDtls;
		this.mentorDtls = mentorDtls;
		this.trainingName = trainingName;
		this.progress = progress;
	}
	public long getCompId() {
		return compId;
	}
	public void setCompId(long compId) {
		this.compId = compId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
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
		return "CurrentTraining [compId=" + compId + ", userDtls=" + userDtls + ", mentorDtls=" + mentorDtls
				+ ", trainingName=" + trainingName + ", progress=" + progress + "]";
	}
	
}
