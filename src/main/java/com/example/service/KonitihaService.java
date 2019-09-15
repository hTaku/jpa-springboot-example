package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.KonitihaRepository;
import com.example.repository.entity.Konitiha;

@Service
public class KonitihaService {
	@Autowired
	private KonitihaRepository repository;
	
	public List<Konitiha> findAll() {
		return this.repository.findAll();
	}
}
