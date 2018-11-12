package com.sls.security.dto;

import java.util.Date;

public class StoreGoodReceiveLineItemDTO {
	
	private  long id;
	private  long storeGrnHdrId;
	private  String itemId ;
	private  String additionalRequirements ;	
	private  float advisedQuantity;
	private  float actualQuantity ;
	private  float deviation ;
	private  float orderedPrice ;
	private  float receivedPrice ;
	private  String claims ;
	private  String remarks ;
	private  Date receiveDate ;
	private  String storeId ;
	private  long floor ;
	private  long room ;	
	private  long rack ;
	private  long position ;
	private  Date expiryDate ;
	private  long batchno ;
	private  String status ;
	private  String uomCode;
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
	public long getStoreGrnHdrId() {
		return storeGrnHdrId;
	}
	public void setStoreGrnHdrId(long storeGrnHdrId) {
		this.storeGrnHdrId = storeGrnHdrId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getAdditionalRequirements() {
		return additionalRequirements;
	}
	public void setAdditionalRequirements(String additionalRequirements) {
		this.additionalRequirements = additionalRequirements;
	}
	
	public float getAdvisedQuantity() {
		return advisedQuantity;
	}
	public void setAdvisedQuantity(float advisedQuantity) {
		this.advisedQuantity = advisedQuantity;
	}
	public float getActualQuantity() {
		return actualQuantity;
	}
	public void setActualQuantity(float actualQuantity) {
		this.actualQuantity = actualQuantity;
	}
	public float getDeviation() {
		return deviation;
	}
	public void setDeviation(float deviation) {
		this.deviation = deviation;
	}
	public float getOrderedPrice() {
		return orderedPrice;
	}
	public void setOrderedPrice(float orderedPrice) {
		this.orderedPrice = orderedPrice;
	}
	public float getReceivedPrice() {
		return receivedPrice;
	}
	public void setReceivedPrice(float receivedPrice) {
		this.receivedPrice = receivedPrice;
	}
	public String getClaims() {
		return claims;
	}
	public void setClaims(String claims) {
		this.claims = claims;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getReceiveDate() {
		return receiveDate;
	}
	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public long getFloor() {
		return floor;
	}
	public void setFloor(long floor) {
		this.floor = floor;
	}
	public long getRoom() {
		return room;
	}
	public void setRoom(long room) {
		this.room = room;
	}
	public long getRack() {
		return rack;
	}
	public void setRack(long rack) {
		this.rack = rack;
	}
	public long getPosition() {
		return position;
	}
	public void setPosition(long position) {
		this.position = position;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public long getBatchno() {
		return batchno;
	}
	public void setBatchno(long batchno) {
		this.batchno = batchno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUomCode() {
		return uomCode;
	}
	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
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
	
	
	
	
	
	
}