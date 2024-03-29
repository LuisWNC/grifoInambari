package pe.com.grifoInambari.core.security;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String fullName;
	private String email;
	private Long userId;
	
	private Long grifoId;

	private String userName;

	private String[] roles;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getGrifoId() {
		return grifoId;
	}

	public void setGrifoId(Long grifoId) {
		this.grifoId = grifoId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String[] getRoles() {
		return roles;
	}

	public void setRoles(String[] roles) {
		this.roles = roles;
	}

	

}
