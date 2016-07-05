package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class EnterPriceDAOImplTest  extends AbstractUnitTest{
	
	@Autowired
	protected EnterPriceService enterPriceService;
	
	
	public void testEnterPriceDAO() {
		System.out.println("enterPriceService ::: "+enterPriceService);
	}

}
