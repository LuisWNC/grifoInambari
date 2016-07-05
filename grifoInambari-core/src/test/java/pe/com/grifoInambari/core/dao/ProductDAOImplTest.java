package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAOImplTest extends AbstractUnitTest{

	@Autowired
	protected ProductoDAO productoDAO;
	
	
	public void testProductoDAO() {
		System.out.println("productoDAO ::: "+productoDAO );
	}
}
