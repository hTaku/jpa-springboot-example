package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.Ohayo;
import com.example.repository.entity.OhayoKey;

/**
 * 商品情報のリポジトリクラス
 */
@Repository
public interface OhayoRepository extends JpaRepository<Ohayo, OhayoKey> {

	@Query("SELECT ohayo FROM Ohayo ohayo JOIN ohayo.konitihas WHERE ohayo.ohayoKey.i1 = :I1")
	public Ohayo findById(@Param("I1")Integer i1);
}
