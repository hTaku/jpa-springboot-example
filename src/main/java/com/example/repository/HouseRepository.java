package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.House;

/**
 * 自宅情報のリポジトリクラス
 */
@Repository
public interface HouseRepository extends JpaRepository<House, Integer> {

	/**
	 * OneToOne(Houseテーブル - Staffテーブル)間の内部結合
	 * 
	 * @param houseId 自宅ID
	 * @return 自宅IDを基にスタッフ情報を取得する
	 */
	@Query("SELECT house FROM House house JOIN house.staff WHERE house.id = :HOUSE_ID")
	public House findByIdWithStaff(@Param("HOUSE_ID")Integer houseId);
}
