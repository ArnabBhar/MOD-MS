package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

 
@Entity
public class Training {
	
	@Id
	private int id;
	private int progress;
	private String courseName;
	private String status;
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public String getCourseName() {
		return courseName;
	}
	public Training() {
		super();
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	} 
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Training(int id, int progress, String courseName, String status) {
		super();
		this.id = id;
		this.progress = progress;
		this.courseName = courseName;
		this.status = status;
		
	}
	
	
	

}
