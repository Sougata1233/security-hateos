package com.sls.security.dto;

import java.sql.Date;

public class ItemGroupDTO {
	
	private  String id;
	private  String name ;
	private String activeFlag;
	private long purchaseCode;
	private String inactiveFlag;
	private String modBy;
	private Date modOn;
	
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
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public long getPurchaseCode() {
		return purchaseCode;
	}
	public void setPurchaseCode(long purchaseCode) {
		this.purchaseCode = purchaseCode;
	}
	public String getInactiveFlag() {
		return inactiveFlag;
	}
	public void setInactiveFlag(String inactiveFlag) {
		this.inactiveFlag = inactiveFlag;
	}
	public String getModBy() {
		return modBy;
	}
	public void setModBy(String modBy) {
		this.modBy = modBy;
	}
	public Date getModOn() {
		return modOn;
	}
	public void setModOn(Date modOn) {
		this.modOn = modOn;
	}
	public ItemGroupDTO(String id, String name, String activeFlag, long purchaseCode, String inactiveFlag, String modBy,
			Date modOn) {
		super();
		this.id = id;
		this.name = name;
		this.activeFlag = activeFlag;
		this.purchaseCode = purchaseCode;
		this.inactiveFlag = inactiveFlag;
		this.modBy = modBy;
		this.modOn = modOn;
	}
	public ItemGroupDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ItemGroupDTO [id=" + id + ", name=" + name + ", activeFlag=" + activeFlag + ", purchaseCode="
				+ purchaseCode + ", inactiveFlag=" + inactiveFlag + ", modBy=" + modBy + ", modOn=" + modOn + "]";
	}	
	

}
