package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class AccessRoleDAOImplTest  extends AbstractUnitTest{

	@Autowired
	protected AccessRoleDAO accessRoleDAO;
	
	
	public void testAccessRoleDAO() {
		System.out.println("accessRoleDAO ::: "+accessRoleDAO);
	}
}
