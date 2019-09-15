package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.HouseRepository;
import com.example.repository.entity.House;

@Service
public class HouseService {

	/** repository */
	@Autowired
	private HouseRepository repository;
	
	/**
	 * @see org.springframework.data.jpa.repository.JpaRepository#findAll()
	 */
	public List<House> findAll(){
		return repository.findAll();
	}
	
	/**
	 * @see com.example.repository.HouseRepository#findByIdWithStaff(Integer)
	 */
	public House findByIdWithStaff(Integer houseId) {
		return repository.findByIdWithStaff(houseId);
	}
}
