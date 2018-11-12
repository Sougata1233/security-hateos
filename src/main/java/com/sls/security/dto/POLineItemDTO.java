package com.sls.security.dto;

import java.sql.Date;

public class POLineItemDTO {
	
	private  long id;
	private  String poId;
	private  String indentId;
	private  String type ;
	private  String status ;
	private  String itemGroupId;
	private  String itemId;
	private  String unitId;
	private float quantity;
	private float actualQuantity;
	private  String approverFirst ;
	private  long qualityCode;
	private  String marka;
	private float rate;
	private float allowableMoisturePercentage;
	private float tax;
	private float valueWithTax;
	private float valueWithoutTax;
	private  String approverSecond ;
	private  Date approveFirstDate ;
	private  Date approveSecondDate ;
	private  float discount ;
	private String itemDesc;
	
	
	
	
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPoId() {
		return poId;
	}
	public void setPoId(String poId) {
		this.poId = poId;
	}
	public String getIndentId() {
		return indentId;
	}
	public void setIndentId(String indentId) {
		this.indentId = indentId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getActualQuantity() {
		return actualQuantity;
	}
	public void setActualQuantity(float actualQuantity) {
		this.actualQuantity = actualQuantity;
	}
	
	public String getApproverFirst() {
		return approverFirst;
	}
	public void setApproverFirst(String approverFirst) {
		this.approverFirst = approverFirst;
	}
	
	
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float getTax() {
		return tax;
	}
	public void setTax(float tax) {
		this.tax = tax;
	}
	public float getValueWithTax() {
		return valueWithTax;
	}
	public void setValueWithTax(float valueWithTax) {
		this.valueWithTax = valueWithTax;
	}
	public float getValueWithoutTax() {
		return valueWithoutTax;
	}
	public void setValueWithoutTax(float valueWithoutTax) {
		this.valueWithoutTax = valueWithoutTax;
	}
	public String getApproverSecond() {
		return approverSecond;
	}
	public void setApproverSecond(String approverSecond) {
		this.approverSecond = approverSecond;
	}
	public Date getApproveFirstDate() {
		return approveFirstDate;
	}
	public void setApproveFirstDate(Date approveFirstDate) {
		this.approveFirstDate = approveFirstDate;
	}
	public Date getApproveSecondDate() {
		return approveSecondDate;
	}
	public void setApproveSecondDate(Date approveSecondDate) {
		this.approveSecondDate = approveSecondDate;
	}
	public long getQualityCode() {
		return qualityCode;
	}
	public void setQualityCode(long qualityCode) {
		this.qualityCode = qualityCode;
	}	
	
	public float getAllowableMoisturePercentage() {
		return allowableMoisturePercentage;
	}
	public void setAllowableMoisturePercentage(float allowableMoisturePercentage) {
		this.allowableMoisturePercentage = allowableMoisturePercentage;
	}
	


	

	

}
