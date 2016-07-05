package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class RepositoryDAOImplTest extends AbstractUnitTest{
	
	@Autowired
	protected RepositoryService repositoryService;
	
	
	public void testRepositoryDAO() {
		System.out.println("repositoryService ::: "+repositoryService);
	}

}
