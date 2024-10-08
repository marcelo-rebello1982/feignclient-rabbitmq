package br.com.complianceit.services.oracle.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.cadastroit.services.oracle.OracleBoot;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {OracleBoot.class})
public class OracleBootTest {

	@Autowired
	private EntityManagerFactory emf;
	
	@Test
	public void checkConnection() {
		EntityManager entityManager = this.emf.createEntityManager();
		if(entityManager.isOpen()) {
			entityManager.clear();
			entityManager.close();
		}
	}
}
