package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class CustomerDAOImplTest  extends AbstractUnitTest{
	
	@Autowired
	protected CustomerDAO customerDAO;
	
	
	public void testCustomerDAO() {
		System.out.println("customerDAO ::: "+customerDAO);
	}

}
