package com.vehicle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int zId;
	
	private String zName;
	
	private String zPrice;
	
	private String zBrand;

	public int getzId() {
		return zId;
	}

	public void setzId(int zId) {
		this.zId = zId;
	}

	public String getzName() {
		return zName;
	}

	public void setzName(String zName) {
		this.zName = zName;
	}

	public String getzPrice() {
		return zPrice;
	}

	public void setzPrice(String zPrice) {
		this.zPrice = zPrice;
	}

	public String getzBrand() {
		return zBrand;
	}

	public void setzBrand(String zBrand) {
		this.zBrand = zBrand;
	}
	
	
}
