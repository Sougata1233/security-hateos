package com.sls.security.dto;

import java.util.Date;

public class IssueItemDTO {
	
	private  long id;
	private  long indentId;
	private  String itemGroupId;
	private  String itemId;
	private  String unitId;
	private float indentQuantity;
	private float issuedQuantity;
	private  long qualityCode;
	private  String marka;
	private  String issuer ;
	private  String receiver ;
	private  Date issueDate ;
	private  String lastModifiedUser ;
	private  Date lastModifiedDate ;
	private  long deptId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIndentId() {
		return indentId;
	}

	public void setIndentId(long indentId) {
		this.indentId = indentId;
	}

	public String getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(String itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	
	public long getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(long qualityCode) {
		this.qualityCode = qualityCode;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public float getIndentQuantity() {
		return indentQuantity;
	}

	public void setIndentQuantity(float indentQuantity) {
		this.indentQuantity = indentQuantity;
	}

	public float getIssuedQuantity() {
		return issuedQuantity;
	}

	public void setIssuedQuantity(float issuedQuantity) {
		this.issuedQuantity = issuedQuantity;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	
	
	

}
