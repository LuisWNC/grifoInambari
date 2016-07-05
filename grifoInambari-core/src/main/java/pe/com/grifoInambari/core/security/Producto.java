package pe.com.grifoInambari.core.security;

import java.io.Serializable;

public class Producto implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String nameProduct;
	private String typeProduct;
	private String description;
	
	
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getTypeProduct() {
		return typeProduct;
	}
	public void setTypeProduct(String typeProduct) {
		this.typeProduct = typeProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
