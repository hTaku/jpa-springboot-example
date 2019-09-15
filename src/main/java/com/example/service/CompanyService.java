package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repository.CompanyRepository;
import com.example.repository.entity.Company;

@Service
public class CompanyService {

	/** repository */
	@Autowired
	private CompanyRepository repository;

	/**
	 * @see com.example.repository.CompanyRepository#findAll()
	 */
	public List<Company> findAll(){
		return repository.findAll();
	}
	
	/**
	 * @see com.example.repository.CompanyRepository#findByIdJoinRelation(Integer)
	 */
	public Company findByIdJoinRelation(Integer companyId) {
		return repository.findByIdJoinRelation(companyId);
	}
	
	/**
	 * @see com.example.repository.CompanyRepository#findAllWithStaff()
	 */
	public List<Company> findAllWithStaff(){
		return repository.findAllWithStaff();
	}
	
	/**
	 * 会社テーブルに会社情報を追加
	 * 
	 * @param company 追加する会社情報
	 * @return 追加した会社情報
	 */
	public Company insert(Company company) {
		return repository.save(company);
	}

	/**
	 * 会社情報を更新する
	 * @param company 更新対象の会社情報
	 * @return 更新後の会社情報。更新されなかった場合、nullが返る。
	 */
	public Company update(Company company) {
		return repository.save(company);
	}
	
	/**
	 * 会社情報の削除
	 * @param companyId 削除対象の会社ID
	 */
	public void delete(Integer companyId) {
		repository.deleteById(companyId);
	}
}
