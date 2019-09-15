package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.OhayoRepository;
import com.example.repository.entity.Ohayo;

@Service
public class OhayoService {
	@Autowired
	private OhayoRepository repository;
	
	public Ohayo findById(Integer i1) {
		return this.repository.findById(i1);
	}
}
