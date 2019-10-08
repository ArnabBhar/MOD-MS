package com.project.User.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDtls {

	@Id
	private long uId;

	private String userName;
	private String firstName;
	private String lastName;

	public UserDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDtls(long uId, String userName, String firstName, String lastName) {
		super();
		this.uId = uId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getuId() {
		return uId;
	}

	public void setuId(long uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "UserDtls [uId=" + uId + ", userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName
				+ "]";
	}

}
