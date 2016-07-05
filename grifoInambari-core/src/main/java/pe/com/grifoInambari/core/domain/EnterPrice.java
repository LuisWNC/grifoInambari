package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class EnterPrice extends BaseEntity implements Serializable { 

	private static final long serialVersionUID = 1L;
	
	
	private String nameEnterPrice;
	private String ruc;
	private String phone;
	private String address;
	private String pagWeb;
	private StatusEnterPrice statusEnterPrice;
	
	
	public String getNameEnterPrice() {
		return nameEnterPrice;
	}
	public void setNameEnterPrice(String nameEnterPrice) {
		this.nameEnterPrice = nameEnterPrice;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPagWeb() {
		return pagWeb;
	}
	public void setPagWeb(String pagWeb) {
		this.pagWeb = pagWeb;
	}
	public StatusEnterPrice getStatusEnterPrice() {
		return statusEnterPrice;
	}
	public void setStatusEnterPrice(StatusEnterPrice statusEnterPrice) {
		this.statusEnterPrice = statusEnterPrice;
	}
	
	
	
}
