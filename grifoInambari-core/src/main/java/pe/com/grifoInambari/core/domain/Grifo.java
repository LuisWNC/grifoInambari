package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class Grifo extends BaseEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String businessName ;
	private String ruc;
	private String address;
	private String numInvoice;
	private String numBoleta;
	private String phone;
	private String code;
	private StatusGrifo statusGrifo;
	
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getNumInvoice() {
		return numInvoice;
	}
	public void setNumInvoice(String numInvoice) {
		this.numInvoice = numInvoice;
	}
	public String getNumBoleta() {
		return numBoleta;
	}
	public void setNumBoleta(String numBoleta) {
		this.numBoleta = numBoleta;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public StatusGrifo getStatusGrifo() {
		return statusGrifo;
	}
	public void setStatusGrifo(StatusGrifo statusGrifo) {
		this.statusGrifo = statusGrifo;
	}
	
	
	
		
	
	
	
	
}
