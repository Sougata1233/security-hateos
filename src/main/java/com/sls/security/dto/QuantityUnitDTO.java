package com.sls.security.dto;

public class QuantityUnitDTO {
	
	private  String id;
	private  String name ;
	private ItemDTO quantityInUnit;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ItemDTO getQuantityInUnit() {
		return quantityInUnit;
	}
	public void setQuantityInUnit(ItemDTO quantityInUnit) {
		this.quantityInUnit = quantityInUnit;
	}	

}
