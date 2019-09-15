package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.SupplierRepository;
import com.example.repository.entity.Supplier;

@Service
public class SupplierService {

	/** repository */
	@Autowired
	private SupplierRepository repository;

	/**
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	public List<Supplier> findAll(){
		return repository.findAll();
	}

	/**
	 * @see com.example.repository.SupplierRepository#findByIdWithProduct(Integer)
	 */
	public Supplier findByIdWithProduct(Integer supplierId) {
		return repository.findByIdWithProduct(supplierId);
	}
}
