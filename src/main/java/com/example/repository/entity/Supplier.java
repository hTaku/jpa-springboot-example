package com.example.repository.entity;

import static javax.persistence.CascadeType.ALL;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * The persistent class for the supplier database table.
 * 
 */
@Entity
@Table(name="supplier")
public class Supplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	//bi-directional many-to-many association to Product
	@ManyToMany(mappedBy="suppliers", cascade=ALL, fetch = FetchType.LAZY)		// FetchType.LAZY <- 遅延ロード
	private List<Product> products;

	public Supplier() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}