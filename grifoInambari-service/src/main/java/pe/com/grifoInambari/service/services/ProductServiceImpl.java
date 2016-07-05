package pe.com.grifoInambari.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.grifoInambari.core.dao.ProductoDAO;
import pe.com.grifoInambari.core.domain.Product;
import pe.com.grifoInambari.core.security.Producto;

public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductoDAO productoDAO;
//
//	public Producto findValidateProducto(String nameProduct){
//		Product product =ProductoDAO.class
//	}
	
}
