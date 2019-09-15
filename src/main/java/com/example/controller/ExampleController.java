package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.repository.entity.Company;
import com.example.repository.entity.House;
import com.example.repository.entity.Konitiha;
import com.example.repository.entity.Ohayo;
import com.example.repository.entity.Product;
import com.example.repository.entity.Staff;
import com.example.repository.entity.Supplier;
import com.example.service.CompanyService;
import com.example.service.HouseService;
import com.example.service.KonitihaService;
import com.example.service.OhayoService;
import com.example.service.ProductService;
import com.example.service.StaffService;
import com.example.service.SupplierService;

@Controller
public class ExampleController {
	@Autowired
	private CompanyService companyService;
	@Autowired
	StaffService staffService;
	@Autowired
	HouseService houseService;
	@Autowired
	SupplierService supplierService;
	@Autowired
	ProductService productService;
	@Autowired
	OhayoService ohayoService;
	@Autowired
	KonitihaService konitihaService;
	
	@SuppressWarnings("unused")
	@RequestMapping("/index")
	public String index() {
//		// 1対多検索
//		List<Company> resultCompanyList = companyService.findAll();
//		// 多対1検索
//		List<Staff> resultStaffList = staffService.findAll();
//		// 1対1検索
//		List<House> resultHouseList = houseService.findAll();
//		// 多対多
//		List<Supplier> resultSupplierList = supplierService.findAll();
//		// 多対多
//		List<Product> resultProductList = productService.findAll();
//
//		// Inner join検索
//		Company company = companyService.findByIdJoinRelation(1);
		
		Ohayo ohayo = ohayoService.findById(11);
		
		List<Konitiha> konitiwaList = konitihaService.findAll();

		return "index";
	}
	
	@RequestMapping("/modify")
	public String modfy() {
		Company company = createCompanyTestData(100);
		// 登録
		company = companyService.insert(company);
		
		// 更新
		company = updateCompanyTestData(company);
		company = companyService.update(company);
		
		// 削除
		companyService.delete(company.getId());
		return "modify";
	}

	public Company createCompanyTestData(Integer id) {
		Company company = new Company();
		company.setId(100);
		company.setName("追加 会社");
		List<Staff> staffs = new ArrayList<>();
		// スタッフ1
		Staff staff1 = new Staff();
		Integer staff1Id = id;
		staff1.setId(staff1Id);
		staff1.setName("スタッフ " + staff1Id);
		staff1.setAge(staff1Id);
		House staff1house = new House();
		staff1house.setId(staff1Id);
		staff1house.setAddress(staff1Id + "県" + staff1Id + "市");
		staff1house.setTel("090-" + staff1Id + "-" + staff1Id);
		staff1.setHouse(staff1house);
		staffs.add(staff1);
		// スタッフ2
		Staff staff2 = new Staff();
		Integer staff2Id = id + 1;
		staff2.setId(staff2Id);
		staff2.setName("スタッフ " + (id + 1));
		staff2.setAge(staff2Id);
		House staff2house = new House();
		staff2house.setId(staff2Id);
		staff2house.setAddress(staff2Id + "県" + staff2Id + "市");
		staff2house.setTel("090-" + staff2Id + "-" + staff2Id);
		staff2.setHouse(staff2house);
		staffs.add(staff2);

		company.setStaff(staffs);
		return company;
	}
	
	private Company updateCompanyTestData(Company company) {
		Company updateCompany = company;
		updateCompany.setName("更新 会社");
		
		Staff staff1 = updateCompany.getStaffs().get(0);
		staff1.setName(staff1.getName() + "-1");
		staff1.getHouse().setAddress(staff1.getHouse().getAddress() + "XXXX町");

		Staff staff2 = updateCompany.getStaffs().get(1);
		staff2.setName(staff2.getName() + "-1");
		staff2.getHouse().setAddress(staff2.getHouse().getAddress() + "XXXX町");
		
		return updateCompany;
	}
}
