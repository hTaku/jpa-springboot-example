package com.example.repository.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * The persistent class for the staff database table.
 * 
 */
@Entity
@Table(name="staff")
public class Staff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	@Column(name="company_id", nullable=false)
	private int companyId;

	@Column(nullable = false)
	private String name;

	@Column(name="age", nullable=false)
	private int age;

	@Column(name="house_id", nullable=false)
	private int houseId;

	@ManyToOne(cascade=ALL, fetch = FetchType.LAZY)		// FetchType.LAZY <- 遅延ロード
	@JoinColumn(name="company_id",insertable=false, updatable=false)
	private Company company;

	@OneToOne(cascade=ALL, mappedBy="staff", fetch = FetchType.LAZY)		// FetchType.LAZY <- 遅延ロード
	private House house;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

}