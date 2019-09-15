package com.example.repository;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.repository.entity.Staff;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StaffRepositoryTest {

	@Test
	public void test() {
		Staff staff = new Staff();
		fail("Not yet implemented");
	}

}
