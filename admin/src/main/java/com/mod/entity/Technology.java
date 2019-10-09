package com.mod.entity;

import javax.persistence.*;

public class Technology {

	private  Integer techId;
	private  String techName;

	public Technology() {
		super();
	}

	public Technology(String techName) {
		super();
		this.techName = techName;
	}

	public Integer getTechId() {
		return techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

}
