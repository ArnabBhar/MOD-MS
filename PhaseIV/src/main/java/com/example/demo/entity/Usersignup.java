package com.example.demo.entity;

//import java.util.ArrayList;
//import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;

@Entity
public class Usersignup {
	
	public Usersignup() {
		super();
	}
	public Usersignup(String username, String password, String conformPass) {
		super();
		this.username = username;
		this.password = password;
		this.conformPass = conformPass;
	}
	private String username;
	private String password;
	private String conformPass;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformPass() {
		return conformPass;
	}
	public void setConformPass(String conformPass) {
		this.conformPass = conformPass;
	}
	
}
