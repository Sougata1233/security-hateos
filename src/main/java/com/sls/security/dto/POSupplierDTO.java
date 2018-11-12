package com.sls.security.dto;

public class POSupplierDTO {
	
	private String suppCode;
	private String suppName;
	public String getSuppCode() {
		return suppCode;
	}
	public void setSuppCode(String suppCode) {
		this.suppCode = suppCode;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	@Override
	public String toString() {
		return "POSupplierDTO [suppCode=" + suppCode + ", suppName=" + suppName + "]";
	}
	
	
	

}
