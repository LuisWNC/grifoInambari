package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class RepositoryDAOImplTest extends AbstractUnitTest{
	
	@Autowired
	protected RepositoryDAO repositoryDAO;
	
	
	public void testRepositoryDAO() {
		System.out.println("repositoryDAO ::: "+repositoryDAO);
	}

}
