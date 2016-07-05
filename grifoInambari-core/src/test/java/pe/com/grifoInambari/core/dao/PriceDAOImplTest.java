package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class PriceDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected PriceDAO priceDAO;
	
	
	public void testPriceDAO() {
		System.out.println("priceDAO ::: "+priceDAO);
	}
}
