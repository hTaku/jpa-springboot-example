package com.example.repository.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name="konitiha")
public class Konitiha implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private KonitihaKey konitihaKey;

	@Column(nullable=false)
	private Integer t1;

	@Column(nullable=false)
	private Integer t2;
	
	@ManyToMany(cascade=ALL)		// FetchType.LAZY <- 遅延ロード
	private List<Ohayo> ohayos;

	public KonitihaKey getKonitihaKey() {
		return konitihaKey;
	}

	public void setKonitihaKey(KonitihaKey konitihaKey) {
		this.konitihaKey = konitihaKey;
	}

	public Integer getT1() {
		return t1;
	}

	public void setT1(Integer t1) {
		this.t1 = t1;
	}

	public Integer getT2() {
		return t2;
	}

	public void setT2(Integer t2) {
		this.t2 = t2;
	}

	public List<Ohayo> getOhayos() {
		return ohayos;
	}

	public void setOhayos(List<Ohayo> ohayos) {
		this.ohayos = ohayos;
	}
}