package com.sls.security.entity;

import java.sql.Date;
import java.sql.Timestamp;

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

@Entity
@Table(name="JUTE_GATE_ENTRY_HDR")
public class JuteEntryHeader {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="JUTE_GATE_ENTRY_HDR_SEQ")
	@SequenceGenerator(name="JUTE_GATE_ENTRY_HDR_SEQ", sequenceName="JUTE_GATE_ENTRY_HDR_SEQ")
	@Column(name="REC_ID")
	private  long id;
	
	@Column(name="CHALLAN_NO")
	private  long chalanNo;
	
	@Column(name="CHALLAN_DATE")
	private  Date chalanDate ;
	
	@Column(name="VEHICLE_NO")
	private String vehicleNo;
	
	@Column(name="DRIVER_NAME")
	private String driverName;
	
	@Column(name="BROKER_NAME")
	private String brokerName;
	
	@Column(name="TRANSPORTER")
	private String transporter;
	
	@Column(name="BROKER_ADDRESS")
	private String brokerAddress;
	
	@Column(name="IN_DATE")
	private Date inDate;
	
	@Column(name="UPDATE_BY")
	private String updateBy;
	
	@Column(name="IN_TIME")
	private Timestamp inTime;
	
	@Column(name="OUT_TIME")
	private Timestamp outTime;
	
	@Column(name="OUT_DATE")
	private Date outDate;
	
	@Column(name="UPDATE_DATE_TIME")
	private Timestamp updateDateTime;
	
	@Column(name="FIN_YEAR")
	private String finYear;
	
	@Column(name="MUKAM")
	private String mukam;
	
	@Column(name="OPEN_CLOSE")
	private String openClose;
	
	@Column(name="PO_NO")
	private String poNo;
	
	@Column(name="NET_WEIGHT")
	private long netWeight;
	
	@Column(name="GROSS_WEIGHT")
	private long grossWeight;
	
	@Column(name="ACTUAL_WEIGHT")
	private long actualWeight;
	
	@Column(name="MR_NO")
	private  long mrNo;
	
	@Column(name="SUPPLIER_NAME")
	private String supplierName;
	
	@Column(name="SUPP_CODE")
	private String suppCode;
	
	
	
	
	
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
	
	


}
