package pe.com.grifoInambari.core.security;

import java.io.Serializable;

public class Rol implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nameRole;
	private String description;
	
	
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

	
}
