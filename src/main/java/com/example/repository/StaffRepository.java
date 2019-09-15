package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.Staff;

/**
 * 社員情報のリポジトリクラス
 */
@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {

	/**
	 * OneToOne(Staffテーブル - Houseテーブル間)の内部結合
	 * @param staffId 社員ID
	 * @return 社員IDの社員とそれに属する自宅情報を取得する
	 */
	@Query("SELECT staff FROM Staff staff JOIN staff.house house WHERE staff.id = :STAFF_ID")
	public Staff findByIdWithHouseInfo(@Param("STAFF_ID")Integer staffId);
	
	/**
	 * ManyToOne(Staffテーブル - Companyテーブル間)の内部結合
	 * @param age 年齢
	 * @return 年齢以上の社員と社員の属している会社情報を取得する
	 */
	@Query("SELECT staff FROM Staff staff JOIN staff.company company WHERE staff.age >= :AGE")
	public List<Staff> findByGraterThanAgeWithCompany(@Param("AGE")Integer age);
}
