package pe.com.grifoInambari.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Voucher extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date date;
	private String numVoucher;
	private String typeVoucher;
	private String subTotal;
	private String total;
	private Date dateEnd;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
	public String getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(String subTotal) {
		this.subTotal = subTotal;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	

}
