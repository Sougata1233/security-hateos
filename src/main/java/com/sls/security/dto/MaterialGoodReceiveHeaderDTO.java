package com.sls.security.dto;

import java.util.Date;

public class MaterialGoodReceiveHeaderDTO {
	
	private  long id;
	private  Date goodReceiptDate ;
	private  String supplierId ;	
	private  String poId ;
	private  Date poDate ;	
	private  String contractNo ;
	private  Date contractDate ;	
	private  long chalanNo ;
	private  Date chalanDate ;
	private  String warehouseNo ;
	private  String exSTN ;
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


	public String getContractNo() {
		return contractNo;
	}


	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}


	public Date getContractDate() {
		return contractDate;
	}


	public void setContractDate(Date contractDate) {
		this.contractDate = contractDate;
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


	public String getWarehouseNo() {
		return warehouseNo;
	}


	public void setWarehouseNo(String warehouseNo) {
		this.warehouseNo = warehouseNo;
	}


	public String getExSTN() {
		return exSTN;
	}


	public void setExSTN(String exSTN) {
		this.exSTN = exSTN;
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