package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.Konitiha;
import com.example.repository.entity.KonitihaKey;

@Repository
public interface KonitihaRepository extends JpaRepository<Konitiha, KonitihaKey> {

}
