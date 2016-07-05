package pe.com.grifoInambari.core.dao;

import pe.com.grifoInambari.core.domain.Customer;

public interface CustomerDAO {

	
	Customer findCustomerBy(String createdBy,  String lastUpdatedBy);
	String[] findRoleByCustomerId(Long customerId);
}
