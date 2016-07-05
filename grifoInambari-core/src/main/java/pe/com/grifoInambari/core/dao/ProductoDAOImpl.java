package pe.com.grifoInambari.core.dao;

import java.util.List;

import pe.com.grifoInambari.core.domain.StatusProduct;
import pe.com.grifoInambari.core.domain.Product;

public class ProductoDAOImpl extends BaseDAOHibernate implements ProductoDAO {

	
	
	public Product findProductoById(Long id) {
		return findById(Product.class, id);
	}
	
	public void deleteProducto(Product producto) {
		delete(producto);
	}
	
	public List<Product> findProducto() {
		return find(Product.class, "from Producto");
	}
	
	public void updateProducto(Product producto){
		update(producto);
	}

	public void saveProducto(Product producto) {
		save(producto);
	}
	
	public List<StatusProduct> findEstadoProducto() {
		return find(StatusProduct.class, "from EstadoProducto");
	}
	

}
