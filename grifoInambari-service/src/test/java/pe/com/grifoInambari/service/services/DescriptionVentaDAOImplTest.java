package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

public class DescriptionVentaDAOImplTest  extends AbstractUnitTest{

	@Autowired
	protected DescriptionVentaService descriptionVentaService;
	
	
	public void testDescriptionVentaDAO() {
		System.out.println("descriptionVentaService ::: "+descriptionVentaService);
	}
}
