package com.project.Mentor.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class MentorSkills {

	@Id
	private long skillId;
	private String skillName;
	
	
	public MentorSkills(long skillId, String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}


	@Override
	public String toString() {
		return "MentorSkills [skillId=" + skillId + ", skillName=" + skillName + "]";
	}


	public long getSkillId() {
		return skillId;
	}


	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}


	public String getSkillName() {
		return skillName;
	}


	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}


	public MentorSkills() {
		// TODO Auto-generated constructor stub
	}

}
