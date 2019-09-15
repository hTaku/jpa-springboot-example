package com.example.repository;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.repository.entity.Company;

@RunWith(SpringRunner.class)
@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Sql(statements = {
//		"INSERT INTO company (id, name) VALUES (1, 'company 1')",
//		"INSERT INTO company (id, name) VALUES (2, 'company 2')"
//})
public class CompanyRepositoryTest {

	@Autowired
	private TestEntityManager testEntityManager;
	@Autowired
	private CompanyRepository companyRepository;
	
	@Test
	public void test() {
		Company company = new Company();
		fail("Not yet implemented");
	}

}
