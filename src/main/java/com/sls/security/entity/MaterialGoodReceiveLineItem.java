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
@Table(name="SCM_MR_LINE_ITEM")

public class MaterialGoodReceiveLineItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MR_ITEM_SEQ")
    @SequenceGenerator(sequenceName = "SCM_GRN_ITEM_SEQ", allocationSize = 1, name = "MR_ITEM_SEQ")
	@Column(name="JUTE_LINE_ITEM_NO")
	private  long id;
	
	@Column(name="JUTE_RECEIVE_NO")
	private  long materialGrnHdrId;
	
	@Column(name="ITEM_CODE")
	private  String itemId ;	
	

	@Column(name="QUANTITY")
	private  float quantity ;
	
	@Column(name="QUANTITY_UNIT")
	private  String quantityUnit; 
	
	
	@Column(name="MARKA")
	private  String marka;
	
	
	@Column(name="ADVISED_QUALITY")
	private  long advisedQuality ;
	
	@Column(name="ACTUAL_QUALITY")
	private  long  actualQuality ;
	
	
	@Column(name="ADVISED_WEIGHT")
	private  float advisedWeight ;
	
	@Column(name="ACTUAL_WEIGHT")
	private  float actualWeight ;
	
	@Column(name="DEVIATION")
	private  float deviation ;
	
	@Column(name="RATE")
	private  float rate ;
	
	@Column(name="CLAIMS_QUALITY")
	private  String claimsQuality ;
	
	@Column(name="CLAIMS_CONDITION")
	private  String claimsCondition ;
	
	@Column(name="STATUS")
	private  String status ;
	
	
	@Column(name="WAREHOUSE_NO")
	private  String warehouseNo ;
	
	@Column(name="REMARKS")
	private  String remarks ;
	
	@Column(name="TOTAL_PRICE")
	private  float totalPrice ;
	
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