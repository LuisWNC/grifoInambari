package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class RoleDAOImplTest  extends AbstractUnitTest{

	@Autowired
	protected RoleService roleService;
	
	
	public void testRoleDAO() {
		System.out.println("roleService ::: "+roleService);
	}
}
