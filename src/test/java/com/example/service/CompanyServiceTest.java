/**
 * 
 */
package com.example.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTestContextBootstrapper;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.repository.entity.Company;
import com.example.service.CompanyService;

/**
 *
 */
@TestExecutionListeners
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class CompanyServiceTest {
	
	@Autowired
    private TestEntityManager entityManager;
	
	@Autowired
	private CompanyService companyService;

	/**
	 * Test method for {@link com.example.service.CompanyService#findAll()}.
	 */
	@Test
	public void testFindAll() {
		List<Company> resultList = this.companyService.findAll();
		for(Company company : resultList) {
			System.out.println("id : " + company.toString());
		}
	}

}
