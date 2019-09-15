package com.example.repository.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class OhayoKey implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer i1;

	private Integer i2;

	private Integer o3;

	public Integer getI1() {
		return i1;
	}
	public void setI1(Integer i1) {
		this.i1 = i1;
	}
	public Integer getI2() {
		return i2;
	}
	public void setI2(Integer i2) {
		this.i2 = i2;
	}
	public Integer getO3() {
		return o3;
	}
	public void setO3(Integer o3) {
		this.o3 = o3;
	}
}
