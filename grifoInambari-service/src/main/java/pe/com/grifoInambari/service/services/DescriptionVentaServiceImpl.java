package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.DescriptionVentaDAO;
import pe.com.grifoInambari.core.domain.DescriptionVenta;
import pe.com.grifoInambari.core.security.DescripcionVenta;

public class DescriptionVentaServiceImpl implements DescriptionVentaService{

	@Autowired 
	private DescriptionVentaDAO descriptionVentaDAO;
	
	public DescripcionVenta findValidateDescripcionVenta(String quantity, String priceUnitary ,String  priceTotal){
		DescriptionVenta descriptionVenta = descriptionVentaDAO.findDescriptionVentaBy(quantity, priceUnitary, priceTotal);
		
		DescripcionVenta descripcionVenta =null;
		
		if(descriptionVenta!=null){
			descripcionVenta= new DescripcionVenta();
			descripcionVenta.setQuantity(descriptionVenta.getQuantity()+""+descriptionVenta.getPriceUnitary()+""+descriptionVenta.getPriceAll());
			
		}
		
		return descripcionVenta;
	}

}
