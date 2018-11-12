package com.sls.security.dto;

import java.util.Date;

public class MaterialGoodReceiveLineItemDTO {
	private  long id;
	private  long materialGrnHdrId;
	private  String itemId ;	
	private  float quantity ;
	private  String quantityUnit; 
	private  String marka;
	private  long advisedQuality ;
	private  long  actualQuality ;
	private  float advisedWeight ;
	private  float actualWeight ;
	private  float deviation ;
	private  float rate ;
	private  String claimsQuality ;
	private  String claimsCondition ;
	private  String status ;
	private  String warehouseNo ;
	private  String remarks ;
	private  float totalPrice ;
	private  String debitNotesFlag ;
	private  String approverFirst ;
	private  String approverSecond ;
	private  Date approveFirstDate ;
	private  Date approveSecondDate ;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMaterialGrnHdrId() {
		return materialGrnHdrId;
	}
	public void setMaterialGrnHdrId(long materialGrnHdrId) {
		this.materialGrnHdrId = materialGrnHdrId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public float getAdvisedWeight() {
		return advisedWeight;
	}
	public void setAdvisedWeight(float advisedWeight) {
		this.advisedWeight = advisedWeight;
	}
	public float getActualWeight() {
		return actualWeight;
	}
	public void setActualWeight(float actualWeight) {
		this.actualWeight = actualWeight;
	}
	public float getDeviation() {
		return deviation;
	}
	public void setDeviation(float deviation) {
		this.deviation = deviation;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public long getAdvisedQuality() {
		return advisedQuality;
	}
	public void setAdvisedQuality(long advisedQuality) {
		this.advisedQuality = advisedQuality;
	}
	public long getActualQuality() {
		return actualQuality;
	}
	public void setActualQuality(long actualQuality) {
		this.actualQuality = actualQuality;
	}
	
	public String getClaimsQuality() {
		return claimsQuality;
	}
	public void setClaimsQuality(String claimsQuality) {
		this.claimsQuality = claimsQuality;
	}
	public String getClaimsCondition() {
		return claimsCondition;
	}
	public void setClaimsCondition(String claimsCondition) {
		this.claimsCondition = claimsCondition;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWarehouseNo() {
		return warehouseNo;
	}
	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getDebitNotesFlag() {
		return debitNotesFlag;
	}
	public void setDebitNotesFlag(String debitNotesFlag) {
		this.debitNotesFlag = debitNotesFlag;
	}
	public String getApproverFirst() {
		return approverFirst;
	}
	public void setApproverFirst(String approverFirst) {
		this.approverFirst = approverFirst;
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
	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	

	
		
}