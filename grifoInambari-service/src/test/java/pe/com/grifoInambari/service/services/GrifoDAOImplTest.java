package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class GrifoDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected GrifoInambariService grifoInambariService;
	
	
	public void testGrifoDao() {
		System.out.println("grifoInambariService ::: "+grifoInambariService);
	}
}
