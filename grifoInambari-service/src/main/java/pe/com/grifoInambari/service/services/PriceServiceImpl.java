package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.PriceDAO;
import pe.com.grifoInambari.core.domain.Price;
import pe.com.grifoInambari.core.security.Precio;

public class PriceServiceImpl implements PriceService{

	@Autowired
	private PriceDAO priceDAO;
	
	
	
	public Precio findValidatePrecio(){
		Price price= priceDAO.findPriceBy("dasd");
		Precio precio=null;
		if(price!=null){
			precio= new Precio();
			precio.setPrice(precio.getPrice());
			
		}
		return precio;
			
		}
}


