package com.example.repository.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name="company")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id					// 主キー
	private Integer id;

	@Column(nullable=false)
	private String name;
	
	@OneToMany(cascade=ALL, mappedBy="company", fetch = FetchType.LAZY)	// FetchType.LAZY <- 遅延ロード
	private List<Staff> staffs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Staff> getStaffs() {
		return staffs;
	}

	public void setStaff(List<Staff> staffs) {
		this.staffs = staffs;
	}
}