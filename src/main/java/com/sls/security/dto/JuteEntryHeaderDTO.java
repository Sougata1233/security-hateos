package com.sls.security.dto;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;

public class JuteEntryHeaderDTO {

	private  long id;
	private  long chalanNo;
	private  long mrNo;
	private  String poNo;
	private  Date chalanDate ;
	private  String mukam ;
	private String brokerAddress;
	private String vehicleNo;
	private String driverName;
	private String brokerName;
	private String transporter;
	private Date inDate;
	private String updateBy;
	private Timestamp inTime;
	private Timestamp outTime;
	private Date outDate;
	private Timestamp updateDateTime;
	private String finYear;
	private String openClose;
	private long netWeight;
	private long grossWeight;
	private long actualWeight;
	private String supplierName;
	private String suppCode;
	
	private List<JuteEntryDtlLineItemDTO> polineitem;
	
	
	
	
	public List<JuteEntryDtlLineItemDTO> getPolineitem() {
		return polineitem;
	}
	public void setPolineitem(List<JuteEntryDtlLineItemDTO> polineitem) {
		this.polineitem = polineitem;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getChalanNo() {
		return chalanNo;
	}
	public void setChalanNo(long chalanNo) {
		this.chalanNo = chalanNo;
	}
	public long getMrNo() {
		return mrNo;
	}
	public void setMrNo(long mrNo) {
		this.mrNo = mrNo;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Date getChalanDate() {
		return chalanDate;
	}
	public void setChalanDate(Date chalanDate) {
		this.chalanDate = chalanDate;
	}
	public String getMukam() {
		return mukam;
	}
	public void setMukam(String mukam) {
		this.mukam = mukam;
	}
	public String getBrokerAddress() {
		return brokerAddress;
	}
	public void setBrokerAddress(String brokerAddress) {
		this.brokerAddress = brokerAddress;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	
	
	
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getBrokerName() {
		return brokerName;
	}
	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}
	public String getTransporter() {
		return transporter;
	}
	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public Timestamp getInTime() {
		return inTime;
	}
	public void setInTime(Timestamp inTime) {
		this.inTime = inTime;
	}
	public Timestamp getOutTime() {
		return outTime;
	}
	public void setOutTime(Timestamp outTime) {
		this.outTime = outTime;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public Timestamp getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	public String getFinYear() {
		return finYear;
	}
	public void setFinYear(String finYear) {
		this.finYear = finYear;
	}
	public String getOpenClose() {
		return openClose;
	}
	public void setOpenClose(String openClose) {
		this.openClose = openClose;
	}
	public long getNetWeight() {
		return netWeight;
	}
	public void setNetWeight(long netWeight) {
		this.netWeight = netWeight;
	}
	public long getGrossWeight() {
		return grossWeight;
	}
	public void setGrossWeight(long grossWeight) {
		this.grossWeight = grossWeight;
	}
	public long getActualWeight() {
		return actualWeight;
	}
	public void setActualWeight(long actualWeight) {
		this.actualWeight = actualWeight;
	}
	
	
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSuppCode() {
		return suppCode;
	}
	public void setSuppCode(String suppCode) {
		this.suppCode = suppCode;
	}
	@Override
	public String toString() {
		return "JuteEntryHeaderDTO [id=" + id + ", chalanNo=" + chalanNo + ", mrNo=" + mrNo + ", poNo=" + poNo
				+ ", chalanDate=" + chalanDate + ", mukam=" + mukam + ", brokerAddress=" + brokerAddress
				+ ", vehicleNo=" + vehicleNo + "]";
	}
	public JuteEntryHeaderDTO(long id, long chalanNo, long mrNo, String poNo, Date chalanDate, String mukam,
			String brokerAddress, String vehicleNo) {
		super();
		this.id = id;
		this.chalanNo = chalanNo;
		this.mrNo = mrNo;
		this.poNo = poNo;
		this.chalanDate = chalanDate;
		this.mukam = mukam;
		this.brokerAddress = brokerAddress;
		this.vehicleNo = vehicleNo;
	}
	public JuteEntryHeaderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
