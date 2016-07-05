package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class GrifoDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected GrifoDAO grifoDAO;
	
	
	public void testGrifoDao() {
		System.out.println("grifoDAO ::: "+grifoDAO);
	}
}
