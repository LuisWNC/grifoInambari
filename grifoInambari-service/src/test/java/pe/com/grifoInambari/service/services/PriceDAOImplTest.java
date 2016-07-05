package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PriceDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected PriceService priceService;
	
	
	public void testPriceDAO() {
		System.out.println("priceService ::: "+priceService);
	}
}
