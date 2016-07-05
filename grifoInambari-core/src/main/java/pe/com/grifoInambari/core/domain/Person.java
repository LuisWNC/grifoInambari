package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class Person extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String lastNameF;
	private String lastNameM;
	private String numDocument;
	private String phone;
	private String address;
	private String sexo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastNameF() {
		return lastNameF;
	}
	public void setLastNameF(String lastNameF) {
		this.lastNameF = lastNameF;
	}
	public String getLastNameM() {
		return lastNameM;
	}
	public void setLastNameM(String lastNameM) {
		this.lastNameM = lastNameM;
	}
	public String getNumDocument() {
		return numDocument;
	}
	public void setNumDocument(String numDocument) {
		this.numDocument = numDocument;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
}
