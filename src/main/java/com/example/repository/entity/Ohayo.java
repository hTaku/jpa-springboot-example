package com.example.repository.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.List;

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
@Table(name="ohayo")
public class Ohayo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OhayoKey ohayoKey;

	private Integer o4;

	private Integer o5;

	@ManyToMany(mappedBy="ohayos", cascade = ALL)		// FetchType.LAZY <- 遅延ロード
	@JoinTable(
			name = "konitiha",
			joinColumns= {@JoinColumn(name="i1", referencedColumnName="ohayoKey.i1")}
		)
	private List<Konitiha> konitihas;

	public OhayoKey getOhayoKey() {
		return ohayoKey;
	}

	public void setOhayoKey(OhayoKey ohayoKey) {
		this.ohayoKey = ohayoKey;
	}

	public Integer getO4() {
		return o4;
	}

	public void setO4(Integer o4) {
		this.o4 = o4;
	}

	public Integer getO5() {
		return o5;
	}

	public void setO5(Integer o5) {
		this.o5 = o5;
	}

	public List<Konitiha> getKonitihas() {
		return konitihas;
	}

	public void setKonitihas(List<Konitiha> konitihas) {
		this.konitihas = konitihas;
	}
}