package pe.com.grifoInambari.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Customer extends BaseEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private String createdBy;
	private Date datedCreated;
	private Date datedLastUpdated;
	private String lastUpdatedBy;
	private Integer version;

	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getDatedCreated() {
		return datedCreated;
	}
	public void setDatedCreated(Date datedCreated) {
		this.datedCreated = datedCreated;
	}
	public Date getDatedLastUpdated() {
		return datedLastUpdated;
	}
	public void setDatedLastUpdated(Date datedLastUpdated) {
		this.datedLastUpdated = datedLastUpdated;
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
