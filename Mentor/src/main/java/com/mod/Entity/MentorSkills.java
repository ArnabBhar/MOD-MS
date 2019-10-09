package com.mod.Entity;

import javax.persistence.*;

@Entity
@Table(name = "mentor_skills")
public class MentorSkills {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="skill_id")
	private Integer skillId;
	@Column(name="skill_name")
	private  String skillName;
	@Column(name="mentor_id")
	private Integer mentorId;

	public MentorSkills() {
	}

	public MentorSkills(String skillName, Integer mentorId) {
		this.skillName = skillName;
		this.mentorId = mentorId;
	}

	public Integer getSkillId() {
		return skillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}
}
