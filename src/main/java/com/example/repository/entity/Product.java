package com.example.repository.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import static javax.persistence.CascadeType.ALL;


/**
 * The persistent class for the product database table.
 * 
 */
@Entity
@Table(name="product")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	private int price;

	//bi-directional many-to-many association to Supplier
	@ManyToMany(cascade = ALL, fetch = FetchType.LAZY)		// FetchType.LAZY <- 遅延ロード
	@JoinTable(
		name="supplier_product_mapper"
		, joinColumns={@JoinColumn(name="product_id", referencedColumnName="id")}
		, inverseJoinColumns={@JoinColumn(name="supplier_id", referencedColumnName="id")}
	)
	private List<Supplier> suppliers;

	public Product() {
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

	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Supplier> getSuppliers() {
		return this.suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

}