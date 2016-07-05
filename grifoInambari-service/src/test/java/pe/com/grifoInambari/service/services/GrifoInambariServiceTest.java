package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;


public class GrifoInambariServiceTest extends AbstractUnitTest{

	@Autowired
	protected GrifoInambariService grifoInambariService;
	
	public void testGrifoDAO() {
		System.out.println("grifoInambariService::: "+grifoInambariService);
	}
	
	
}
