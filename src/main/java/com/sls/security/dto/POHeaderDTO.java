package com.sls.security.dto;

import java.util.Date;

public class POHeaderDTO {
	
	private  String id;
	private  String type ;
	private  String status ;
	private  String submitter ;
	private  String finnacialYear ;
	private  Date createDate ;
	private  Date poDate ;
	private  String approverFirst ;
	private  String approverSecond ;
	private  Date approveFirstDate ;
	private  Date approveSecondDate ;
	private  String footerNote ;
	private  String supplierId ;
	private  String companyCode ;
	private  String mukam ;
	private  String deliveryAddress ;
	private  float tax ;
	private  float valueWithTax ;
	private  float valueWithoutTax ;
	private  float discount ;
	private  float frieghtCharge ;
	private  String  deliveryTimeline ;
	private  String  juteUnit ;
	private  long vehicleTypeId ;
	private  long vehicleQuantity ;
	
	
	

	public long getVehicleTypeId() {
		return vehicleTypeId;
	}

	public void setVehicleTypeId(long vehicleTypeId) {
		this.vehicleTypeId = vehicleTypeId;
	}

	public long getVehicleQuantity() {
		return vehicleQuantity;
	}

	public void setVehicleQuantity(long vehicleQuantity) {
		this.vehicleQuantity = vehicleQuantity;
	}

	public String getJuteUnit() {
		return juteUnit;
	}

	public void setJuteUnit(String juteUnit) {
		this.juteUnit = juteUnit;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getFrieghtCharge() {
		return frieghtCharge;
	}

	public void setFrieghtCharge(float frieghtCharge) {
		this.frieghtCharge = frieghtCharge;
	}

	public String getDeliveryTimeline() {
		return deliveryTimeline;
	}

	public void setDeliveryTimeline(String deliveryTimeline) {
		this.deliveryTimeline = deliveryTimeline;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getSubmitter() {
		return submitter;
	}

	public void setSubmitter(String submitter) {
		this.submitter = submitter;
	}

	public String getFinnacialYear() {
		return finnacialYear;
	}

	public void setFinnacialYear(String finnacialYear) {
		this.finnacialYear = finnacialYear;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getPoDate() {
		return poDate;
	}

	public void setPoDate(Date poDate) {
		this.poDate = poDate;
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

	public String getFooterNote() {
		return footerNote;
	}

	public void setFooterNote(String footerNote) {
		this.footerNote = footerNote;
	}

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getMukam() {
		return mukam;
	}

	public void setMukam(String mukam) {
		this.mukam = mukam;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
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
	
	
	


}
