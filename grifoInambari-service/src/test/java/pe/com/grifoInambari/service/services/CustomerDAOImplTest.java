package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDAOImplTest  extends AbstractUnitTest{
	
	@Autowired
	protected CustomerService customerService;
	
	
	public void testCustomerDAO() {
		System.out.println("customerService ::: "+customerService);
	}

}
