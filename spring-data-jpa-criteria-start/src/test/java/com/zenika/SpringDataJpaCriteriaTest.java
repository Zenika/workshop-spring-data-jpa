/**
 * 
 */
package com.zenika;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zenika.repository.ContactRepository;

/**
 * @author acogoluegnes
 * 
 */
// TODO 02 enlever @Ignore du test
@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-data-jpa-criteria.xml")
public class SpringDataJpaCriteriaTest {

	@Autowired ContactRepository repo;
	
	@Autowired DataSource ds;
	
	@Before public void setUp() {
		ResourceDatabasePopulator pop = new ResourceDatabasePopulator();
		pop.addScript(new ClassPathResource("/data.sql"));
		DatabasePopulatorUtils.execute(pop, ds);
	}

	// TODO 03 tester la méthode findOutlawsInMidThirties 
	
	// TODO 08 tester les spécifications
	// tests : outlaws seule, inMidThirties seule, les deux combinées avec un AND
	
}
