package pe.com.grifoInambari.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Product extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nameProduct;
	private String typeProduct;
	private String description;
	private String price;
	private String atrribute;
	private StatusGrifo statusGrifo;
	private Person createBy;
	private Date dateCreated;
	private Date dateLastUpdated;
	private String lastUpdatedBy;
	private Integer version;
	
	
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getAtrribute() {
		return atrribute;
	}
	public void setAtrribute(String atrribute) {
		this.atrribute = atrribute;
	}
	public StatusGrifo getStatusGrifo() {
		return statusGrifo;
	}
	public void setStatusGrifo(StatusGrifo statusGrifo) {
		this.statusGrifo = statusGrifo;
	}
	public Person getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Person createBy) {
		this.createBy = createBy;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	
}
