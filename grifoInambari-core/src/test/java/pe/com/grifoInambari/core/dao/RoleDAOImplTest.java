package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleDAOImplTest  extends AbstractUnitTest{

	@Autowired
	protected RoleDAO roleDAO;
	
	
	public void testRoleDAO() {
		System.out.println("roleDAO ::: "+roleDAO);
	}
}
