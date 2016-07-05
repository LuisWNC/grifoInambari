package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.EnterPrice;

public interface EnterPriceDAO {

	EnterPrice findEnterPriceBy(String nameEnterPrice, String ruc, String phone, String address,String pagWeb);
	String[] findRoleByEnterPriceId(Long enterPriceId);
}
