package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.EnterPrice;

public class EnterPriceDAOImpl extends BaseDAOHibernate implements EnterPriceDAO {

	

	public EnterPrice findEnterPriceBy(String nameEnterPrice, String ruc, String phone, String address,String pagWeb){
		String query = " from EnterPrice WHERE voucher = '" + nameEnterPrice + "' ";
		query = query + " and ruc = '" + ruc + " '";
		query = query + " and phone = '" + phone + " '";
		query = query + " and address = '" + address + " '";
		query = query + " and pagWeb = '" + pagWeb + " '";
		return findFirst(EnterPrice.class, query);
		
	}
	
	public String[] findRoleByEnterPriceId(Long enterPriceId){
		String sql = " "+ " " + enterPriceId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] enterPrice = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			enterPrice[i] = (String) list.get(i);
		}
		
		return enterPrice;

	}

}
