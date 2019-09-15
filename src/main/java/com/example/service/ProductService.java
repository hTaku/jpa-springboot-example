package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.ProductRepository;
import com.example.repository.entity.Product;

@Service
public class ProductService {

	/** repository */
	@Autowired
	private ProductRepository repository;
	
	/**
	 * @see  org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	public List<Product> findAll(){
		return repository.findAll();
	}

	/**
	 * @see com.example.repository.ProductRepository#findByIdWithSupplier(Integer)
	 */
	public Product findByIdWithSupplier(Integer productId) {
		return repository.findByIdWithSupplier(productId);
	}
}
