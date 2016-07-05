package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class AccessRole  extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private StatusAccessRole statusAccessRole;

	public StatusAccessRole getStatusAccessRole() {
		return statusAccessRole;
	}

	public void setStatusAccessRole(StatusAccessRole statusAccessRole) {
		this.statusAccessRole = statusAccessRole;
	}
	
	
}
