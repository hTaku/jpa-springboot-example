package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.Supplier;

/**
 * 取引先情報のリポジトリクラス
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

	/**
	 * ManyToMany(supplierテーブル - productテーブル)間の内部結合
	 * @param supplierId 取引先ID
	 * @return 取引先IDの取引先情報と取り扱っている商品の情報を取得する
	 */
	@Query("SELECT supplier FROM Supplier supplier JOIN supplier.products WHERE supplier.id = :SUPPLIER_ID")
	public Supplier findByIdWithProduct(@Param("SUPPLIER_ID")Integer supplierId);
}
