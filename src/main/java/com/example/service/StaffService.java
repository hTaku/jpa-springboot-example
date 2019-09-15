package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.StaffRepository;
import com.example.repository.entity.Staff;

@Service
public class StaffService {

	/** repository */
	@Autowired
	private StaffRepository repository;

	/**
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	public List<Staff> findAll(){
		return repository.findAll();
	}

	/**
	 * @see com.example.repository.StaffRepository#findByIdWithHouseInfo(Integer)
	 */
	public Staff findByIdWithHouseInfo(Integer staffId) {
		return repository.findByIdWithHouseInfo(staffId);
	}

	/**
	 * @see com.example.repository.StaffRepository#findByGraterThanAgeWithCompany(Integer)
	 */
	public List<Staff> findByGraterThanAgeWithCompany(Integer age) {
		return repository.findByGraterThanAgeWithCompany(age);
	}
}
