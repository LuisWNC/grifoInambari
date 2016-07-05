package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.Price;

public class PriceDAOImpl extends BaseDAOHibernate implements PriceDAO{


	public Price findPriceBy(String price){
		String query = " from Price WHERE product and grifo = '" + price + "' ";
		return findFirst(Price.class ,query);
		
	}
	
	public String[] findRoleByPriceId(Long priceId){
		String sql = " "+ " " + priceId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] price = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			price[i] = (String) list.get(i);
		}
		
		return price;

	}

	
}
