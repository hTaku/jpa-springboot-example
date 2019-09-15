package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.repository.entity.Product;

/**
 * 商品情報のリポジトリクラス
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

	/**
	 * ManyToMany(productテーブル - supplierテーブル)間の内部結合
	 * 
	 * @param productId 商品ID
	 * @return 商品IDの商品情報とそれを取り扱っている取引先情報の検索
	 */
	@Query("SELECT product FROM Product product JOIN product.suppliers WHERE product.id = :PRODUCT_ID")
	public Product findByIdWithSupplier(@Param("PRODUCT_ID")Integer productId);
}
