package pe.com.grifoInambari.core.security;

import java.io.Serializable;

public class Precio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Double price;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
