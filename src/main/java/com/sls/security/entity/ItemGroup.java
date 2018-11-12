package com.sls.security.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity()
@Table(name="ITEM_GROUP_MASTER")
public class ItemGroup {
	
	@Id
	@Column(name="GROUP_CODE")
	private  String id;
	
	@Column(name="GROUP_DESC")
	private  String name ;
	
	@Column(name="ACTIVE_FLAG")
	private String activeFlag;
	
	@Column(name="PURCHASE_CODE")
	private long purchaseCode;
	
	@Column(name="INACTIVE_TAG")
	private String inactiveFlag;
	
	@Column(name="MOD_BY")
	private String modBy;
	
	@Column(name="MOD_ON")
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
	public ItemGroup(String id, String name, String activeFlag, long purchaseCode, String inactiveFlag, String modBy,
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
	public ItemGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ItemGroupDTO [id=" + id + ", name=" + name + ", activeFlag=" + activeFlag + ", purchaseCode="
				+ purchaseCode + ", inactiveFlag=" + inactiveFlag + ", modBy=" + modBy + ", modOn=" + modOn + "]";
	}	
	

}
