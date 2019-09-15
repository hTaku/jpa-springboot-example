package com.example.repository.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the house database table.
 * 
 */
@Entity
@Table(name="house")
public class House implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String address;

	private String tel;
	
	@Column(name="staff_id")
	private int staffId;
	
	@OneToOne(cascade=ALL, fetch = FetchType.LAZY)	// FetchType.LAZY <- 遅延ロード
	@JoinColumn(name="staff_id",insertable=false, updatable=false)
	private Staff staff;
	
	public House() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
}