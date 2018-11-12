package com.sls.security.dto;

import java.util.Date;

public class StoreGoodReceiveHeaderDTO {
	
	private  long id;
	private  Date goodReceiptDate ;
	private  String supplierId ;	
	private  String poId ;
	private  Date poDate ;	
	private  long chalanNo ;
	private  Date chalanDate ;
	private  String storeNo ;
	private  String status ;
	private  String submitter ;
	private  Date createDate ;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getGoodReceiptDate() {
		return goodReceiptDate;
	}


	public void setGoodReceiptDate(Date goodReceiptDate) {
		this.goodReceiptDate = goodReceiptDate;
	}


	public String getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}


	public String getPoId() {
		return poId;
	}


	public void setPoId(String poId) {
		this.poId = poId;
	}


	public Date getPoDate() {
		return poDate;
	}


	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}


	public long getChalanNo() {
		return chalanNo;
	}


	public void setChalanNo(long chalanNo) {
		this.chalanNo = chalanNo;
	}


	public Date getChalanDate() {
		return chalanDate;
	}


	public void setChalanDate(Date chalanDate) {
		this.chalanDate = chalanDate;
	}


	public String getStoreNo() {
		return storeNo;
	}


	public void setStoreNo(String storeNo) {
		this.storeNo = storeNo;
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


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	
	


	
	
}