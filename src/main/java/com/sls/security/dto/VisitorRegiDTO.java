package com.sls.security.dto;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;

public class VisitorRegiDTO {
	
private long recId;
	
	private String visitorName;
	private String whomToMeet;
	private String purpose;
	private String address;
	private long phoneNo;
	private Timestamp inTime;
	private Timestamp outTime;
	private Date entryDate;
	private String user1;
	private Date outDate;
	private String openClose;
	private String department;
	private String remarks;
	private String qrCode;
	private String visitorImage;
	public long getRecId() {
		return recId;
	}
	public void setRecId(long recId) {
		this.recId = recId;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}
	public String getWhomToMeet() {
		return whomToMeet;
	}
	public void setWhomToMeet(String whomToMeet) {
		this.whomToMeet = whomToMeet;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
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
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public String getUser1() {
		return user1;
	}
	public void setUser1(String user1) {
		this.user1 = user1;
	}
	public Date getOutDate() {
		return outDate;
	}
	public void setOutDate(Date outDate) {
		this.outDate = outDate;
	}
	public String getOpenClose() {
		return openClose;
	}
	public void setOpenClose(String openClose) {
		this.openClose = openClose;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getQrCode() {
		return qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}
	public String getVisitorImage() {
		return visitorImage;
	}
	public void setVisitorImage(String visitorImage) {
		this.visitorImage = visitorImage;
	}
	public VisitorRegiDTO(long recId, String visitorName, String whomToMeet, String purpose, String address,
			long phoneNo, Timestamp inTime, Timestamp outTime, Date entryDate, String user1, Date outDate,
			String openClose, String department, String remarks, String qrCode, String visitorImage) {
		super();
		this.recId = recId;
		this.visitorName = visitorName;
		this.whomToMeet = whomToMeet;
		this.purpose = purpose;
		this.address = address;
		this.phoneNo = phoneNo;
		this.inTime = inTime;
		this.outTime = outTime;
		this.entryDate = entryDate;
		this.user1 = user1;
		this.outDate = outDate;
		this.openClose = openClose;
		this.department = department;
		this.remarks = remarks;
		this.qrCode = qrCode;
		this.visitorImage = visitorImage;
	}
	public VisitorRegiDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VisitorRegiDTO [recId=" + recId + ", visitorName=" + visitorName + ", whomToMeet=" + whomToMeet
				+ ", purpose=" + purpose + ", address=" + address + ", phoneNo=" + phoneNo + ", inTime=" + inTime
				+ ", outTime=" + outTime + ", entryDate=" + entryDate + ", user1=" + user1 + ", outDate=" + outDate
				+ ", openClose=" + openClose + ", department=" + department + ", remarks=" + remarks + ", qrCode="
				+ qrCode + ", visitorImage=" + visitorImage + "]";
	}
	
	
	

}
