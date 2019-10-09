package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="technology")
public class Technology {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tech_id")
	private  Integer techId;
	@Column(name="tech_name")
	private  String techName;
	@Column(name="tech_fee")
	private  String techFee;
	@Column(name="tech_commission")
	private  String techCommission;

	public Technology() {
		super();
	}

	public Technology(String techName, String techFee, String techCommission) {
		this.techName = techName;
		this.techFee = techFee;
		this.techCommission = techCommission;
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

	public String getTechFee() {
		return techFee;
	}

	public void setTechFee(String techFee) {
		this.techFee = techFee;
	}

	public String getTechCommission() {
		return techCommission;
	}

	public void setTechCommission(String techCommission) {
		this.techCommission = techCommission;
	}
}
