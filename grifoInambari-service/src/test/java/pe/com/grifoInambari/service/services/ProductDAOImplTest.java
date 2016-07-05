package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected ProductService productService;
	
	
	public void testProductDAO() {
		System.out.println("productService ::: "+productService );
	}
}
