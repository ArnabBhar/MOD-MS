package com.example.demo.entity;

import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;


//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToMany;



@Entity
public class Mentordetails {
	
	@Id
	private String username;
	private int m_id;
	private String mentor_name;
	private String Salary;


	public Mentordetails(String username, int m_id, String mentor_name, String salary, int yearofexperience) {
		super();
		this.username = username;
		this.m_id = m_id;
		this.mentor_name = mentor_name;
		Salary = salary;
		this.yearofexperience = yearofexperience;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSalary() {
		return Salary;
	}

	public void setSalary(String Salary) {
		this.Salary = Salary;
	}

	public Mentordetails() {
			}

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}

		public String getMentor_name() {
		return mentor_name;
	}

	public void setMentor_name(String mentor_name) {
		this.mentor_name = mentor_name;
	}
	
	private int yearofexperience;

	public int getYearofexperience() {
		return yearofexperience;
	}

	public void setYearofexperience(int yearofexperience) {
		this.yearofexperience = yearofexperience;
	}
	@ManyToMany
	private List<Training> tli;

	public List<Training> getTli() {
		return tli;
	}

	public void setTli(List<Training> tli) {
		this.tli = tli;
	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="calendar")
//	private Mentorcalendar mc;
//
//
//	public Mentorcalendar getMc() {
//		return mc;
//	}
//
//	public void setMc(Mentorcalendar mc) {
//		this.mc = mc;
//	}
	
	

	

	
}

