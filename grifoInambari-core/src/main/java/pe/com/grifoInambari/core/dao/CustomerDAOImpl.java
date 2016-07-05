package pe.com.grifoInambari.core.dao;

import java.util.List;

import org.hibernate.SQLQuery;

import pe.com.grifoInambari.core.domain.Customer;

public class CustomerDAOImpl extends BaseDAOHibernate implements CustomerDAO {


	public Customer findCustomerBy(String createdBy,  String lastUpdatedBy){
		String query = " from Customer WHERE descriptionVenta = '" + createdBy + "' ";
		query = query + " and typeVoucher = '" + lastUpdatedBy + " '";
		return findFirst(Customer.class, query);
		
	}
	
	public String[] findRoleByCustomerId(Long customerId){
		String sql = " "+ " " + customerId;
		
		SQLQuery query = getSession().createSQLQuery(sql);
		
		List<Object> list =query.list();
		
		String[] customer = new String[list.size()] ;

		for (int i = 0; i < list.size(); i++) {
			customer[i] = (String) list.get(i);
		}
		
		return customer;

	}

}
