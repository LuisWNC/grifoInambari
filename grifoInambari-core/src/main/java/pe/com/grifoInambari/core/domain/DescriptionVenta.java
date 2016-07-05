package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class DescriptionVenta extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String quantity;
	private String priceUnitary;
	private String priceAll;
	
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPriceUnitary() {
		return priceUnitary;
	}
	public void setPriceUnitary(String priceUnitary) {
		this.priceUnitary = priceUnitary;
	}
	public String getPriceAll() {
		return priceAll;
	}
	public void setPriceAll(String priceAll) {
		this.priceAll = priceAll;
	}
	
	
}
