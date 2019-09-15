package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.Company;

/**
 * 会社情報のリポジトリクラス
 */
@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

	/**
	 * OneToMany(Companyテーブル - Staffテーブル間)の内部結合
	 * @param companyId 会社ID
	 * @return 会社IDの会社とそれに属する社員情報を取得する
	 */
	@Query("SELECT company FROM Company company JOIN company.staffs staffs WHERE company.id = :COMPANY_ID")
	public Company findByIdJoinRelation(@Param("COMPANY_ID")Integer companyId);
	
	/**
	 * OneToMany(Companyテーブル - Staffテーブル間)の外部結合
	 * 
	 * @return 会社と所属している社員の一覧を取得する
	 */
	@Query("SELECT company FROM Company company LEFT JOIN company.staffs staffs WHERE company.id = staffs.companyId")
	public List<Company> findAllWithStaff();
}
