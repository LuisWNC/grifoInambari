package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.Price;

public interface PriceDAO {

	Price findPriceBy(String price);
	String[] findRoleByPriceId(Long priceId);
}
