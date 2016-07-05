package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class EnterPriceDAOImplTest  extends AbstractUnitTest{
	
	@Autowired
	protected EnterPriceDAO enterPriceDAO;
	
	
	public void testEnterPriceDAO() {
		System.out.println("enterPriceDAO ::: "+enterPriceDAO);
	}

}
