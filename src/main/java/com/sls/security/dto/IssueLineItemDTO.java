package com.sls.security.dto;

public class IssueLineItemDTO {
	
	private  long id;
	private  long issueHeaderId;	
	private  String itemGroupId;
	private  String itemId;
	private  String unitId;
	private long stock;
	private long issueQuantity;	
	private  long qualityCode;
	private  String marka;
	private  String remark;
	private  String additionalRequirement;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIssueHeaderId() {
		return issueHeaderId;
	}

	public void setIssueHeaderId(long issueHeaderId) {
		this.issueHeaderId = issueHeaderId;
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

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public long getIssueQuantity() {
		return issueQuantity;
	}

	public void setIssueQuantity(long issueQuantity) {
		this.issueQuantity = issueQuantity;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAdditionalRequirement() {
		return additionalRequirement;
	}

	public void setAdditionalRequirement(String additionalRequirement) {
		this.additionalRequirement = additionalRequirement;
	}
	
	
}
