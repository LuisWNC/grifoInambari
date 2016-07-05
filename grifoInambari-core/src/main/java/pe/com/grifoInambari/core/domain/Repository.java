package pe.com.grifoInambari.core.domain;

import java.io.Serializable;

public class Repository extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String code;
	private Double allGalones;
	private Double combusMax;
	
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Double getAllGalones() {
		return allGalones;
	}
	public void setAllGalones(Double allGalones) {
		this.allGalones = allGalones;
	}
	public Double getCombusMax() {
		return combusMax;
	}
	public void setCombusMax(Double combusMax) {
		this.combusMax = combusMax;
	}
	
	
	
}
