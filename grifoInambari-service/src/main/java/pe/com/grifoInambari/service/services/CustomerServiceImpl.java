package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.CustomerDAO;
import pe.com.grifoInambari.core.domain.Customer;
import pe.com.grifoInambari.core.security.Cliente;

public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO;

	public Cliente findValidateCliente(String createdBy, String lastUpdatedBy){
		Customer customer= customerDAO.findCustomerBy(createdBy, lastUpdatedBy);
		
		Cliente cliente=null;
		
		if(customer!=null){
			cliente= new Cliente();
			cliente.setCreatedBy(customer.getCreatedBy()+""+customer.getLastUpdatedBy());
			
		}
		
		return cliente;
	}
}
