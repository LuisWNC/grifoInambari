package pe.com.grifoInambari.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

public class DescriptionVentaDAOImplTest  extends AbstractUnitTest{

	@Autowired
	protected DescriptionVentaDAO descriptionVentaDAO;
	
	
	public void testDescriptionVentaDAO() {
		System.out.println("descriptionVentaDAO ::: "+descriptionVentaDAO);
	}
}
