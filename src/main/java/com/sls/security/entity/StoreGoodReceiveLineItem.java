package com.sls.security.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity()
@Table(name="SCM_SR_LINE_ITEM")

public class StoreGoodReceiveLineItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_ITEM_SEQ")
    @SequenceGenerator(sequenceName = "SCM_GRN_ITEM_SEQ", allocationSize = 1, name = "SR_ITEM_SEQ")
	@Column(name="STORE_LINE_ITEM_NO")
	private  long id;
	
	@Column(name="STORE_RECEIVE_NO")
	private  long storeGrnHdrId;
	
	@Column(name="STORE_LINE_ITEM_DETAILS")
	private  String itemId ;
	
	@Column(name="ADDITIONAL_REQUIREMENT")
	private  String additionalRequirements ;	
	
	@Column(name="ADVISED_QUANTITY")
	private  float advisedQuantity;
	
	@Column(name="ACTUAL_QUANTITY")
	private  float actualQuantity ;
	
	@Column(name="DEVIATION")
	private  float deviation ;
	
	@Column(name="ORDERED_PRICE")
	private  float orderedPrice ;
	
	@Column(name="RECEIVED_PRICE")
	private  float receivedPrice ;
	
	@Column(name="CLAIMS")
	private  String claims ;
	
	@Column(name="REMARKS")
	private  String remarks ;
	
	@Column(name="RECEIVE_DATE")
	private  Date receiveDate ;
	
	@Column(name="STORE_ID")
	private  String storeId ;
	
	@Column(name="FLOOR")
	private  long floor ;
	
	@Column(name="ROOM")
	private  long room ;	
	
	@Column(name="RACK")
	private  long rack ;
	
	@Column(name="POSITION")
	private  long position ;
	
	@Column(name="EXPIRY_DATE")
	private  Date expiryDate ;
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SR_BATCH_SEQ")
    @SequenceGenerator(sequenceName = "SCM_SR_BATCH_SEQ", allocationSize = 1, name = "SR_BATCH_SEQ")	
	@Column(name="BATCH_NO")
	private  long batchno ;
	
	@Column(name="STATUS")
	private  String status ;
	
	@Column(name="UOM_CODE")
	private  String uomCode;
	
	@Column(name="DEBIT_CREDIT_NOTES_FLAG")
	private  String debitNotesFlag ;	
	
	
	@Column(name="APPROVER_LEVEL_FIRST")
	private  String approverFirst ;
	@Column(name="APPROVER_LEVEL_SECOND")
	private  String approverSecond ;
	
	@Column(name="APPROVE_LEVEL_FIRST_DATE")
	private  Date approveFirstDate ;
	@Column(name="APPROVE_LEVEL_SECOND_DATE")
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