package pe.com.grifoInambari.core.security;

import java.io.Serializable;

public class Comprobante implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String numVoucher;
	private String typeVoucher;
	
	private String total;
	private Long customerId;
	private Long enterPriceId;
	
	
	public String getNumVoucher() {
		return numVoucher;
	}
	public void setNumVoucher(String numVoucher) {
		this.numVoucher = numVoucher;
	}
	public String getTypeVoucher() {
		return typeVoucher;
	}
	public void setTypeVoucher(String typeVoucher) {
		this.typeVoucher = typeVoucher;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getEnterPriceId() {
		return enterPriceId;
	}
	public void setEnterPriceId(Long enterPriceId) {
		this.enterPriceId = enterPriceId;
	}
	
	

}
