package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class Role extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nameRole;
	private String description;
	private String urlRole;
	private StatusRole statusRole;
	
	
	public String getNameRole() {
		return nameRole;
	}
	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrlRole() {
		return urlRole;
	}
	public void setUrlRole(String urlRole) {
		this.urlRole = urlRole;
	}
	public StatusRole getStatusRole() {
		return statusRole;
	}
	public void setStatusRole(StatusRole statusRole) {
		this.statusRole = statusRole;
	}
	
	
}
