package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.EnterPriceDAO;
import pe.com.grifoInambari.core.domain.EnterPrice;
import pe.com.grifoInambari.core.security.Empresa;

public class EnterPriceServiceImpl implements EnterPriceService{
	@Autowired
	private EnterPriceDAO enterPriceDAO;


	public Empresa findValidateEmpresa(String nameEnterPrice,String ruc, String phone,String address,String pagWeb){
		EnterPrice enterPrice= enterPriceDAO.findEnterPriceBy(nameEnterPrice, ruc, phone, address, pagWeb);
		Empresa empresa = null;
		if(enterPrice!=null){
			empresa = new Empresa();
			empresa.setNameEnterPrice(enterPrice.getNameEnterPrice()+""+enterPrice.getRuc()+""+enterPrice.getPhone()+""+enterPrice.getAddress()+""+enterPrice.getPagWeb());
			
		}
		return empresa;
	}
}
