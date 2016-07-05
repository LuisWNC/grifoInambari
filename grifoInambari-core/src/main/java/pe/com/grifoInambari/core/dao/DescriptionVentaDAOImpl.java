package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.DescriptionVenta;

public class DescriptionVentaDAOImpl extends BaseDAOHibernate implements DescriptionVentaDAO{


	public DescriptionVenta findDescriptionVentaBy(String quantity, String priceUnitary, String priceTotal){
		String query = " from DescriptionVenta WHERE voucher = '" + quantity + "' ";
		query = query + " and priceUnitary  = '" + priceUnitary + " '";
		query = query + " and priceTotal = '" + priceTotal + " '";
		
		return findFirst(DescriptionVenta.class, query);
		
	}
	
	public String[] findRoleByDescriptionVentaId(Long descriptionVentaId){
		String sql = " "+ " " + descriptionVentaId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] descriptionVenta = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			descriptionVenta[i] = (String) list.get(i);
		}
		
		return descriptionVenta;

	}

}
