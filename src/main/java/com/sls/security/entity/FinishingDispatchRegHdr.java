package com.sls.security.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FINISHING_DISPATCH_REG_HDR")
public class FinishingDispatchRegHdr {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FINISHING_DISPATCH_REG_HDR_SEQ")
	@SequenceGenerator(name="FINISHING_DISPATCH_REG_HDR_SEQ", sequenceName="FINISHING_DISPATCH_REG_HDR_SEQ")
	@Column(name="HDR_ID")
	private long hdrId;
	
	@Column(name="VEHICLE_NO")
	private String vehicleNo;
	
	@Column(name="CHALLAN_NO")
	private String challanNo;
	
	@Column(name="CHALLAN_DATE")
	private Date challanDate;
	
	@Column(name="WHOM_TO_DISPATCH")
	private String whomToDispatch;
	
	@Column(name="TRANSPORTER")
	private String transporter;
	
	@Column(name="DRIVER_NAME")
	private String driverName;
	
	@Column(name="IN_DATE")
	private Date inDate;
	
	@Column(name="IN_TIME")
	private Timestamp inTime;
	
	@Column(name="OUT_TIME")
	private Timestamp outTime;
	
	@Column(name="OUT_DATE")
	private Date outDate;
	
	@Column(name="UPDATE_BY")
	private String updateBy;
	
	@Column(name="UPDATE_DATE_TIME")
	private Timestamp updateDateTime;
	
	@Column(name="OPEN_CLOSE")
	private String openClose;
	
	@Column(name="ORDER_NO")
	private String orderNo;
	
	@Column(name="NET_WEIGHT")
	private long netWeight;
	
	@Column(name="GROSS_WEIGHT")
	private long grossWeight;
	
	@Column(name="ACTUAL_WEIGHT")
	private long actualWeight;
	
	@Column(name="VEIGHCLE_PASS_NO")
	private String veighclePassNO;

	public long getHdrId() {
		return hdrId;
	}

	public void setHdrId(long hdrId) {
		this.hdrId = hdrId;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getChallanNo() {
		return challanNo;
	}

	public void setChallanNo(String challanNo) {
		this.challanNo = challanNo;
	}

	public Date getChallanDate() {
		return challanDate;
	}

	public void setChallanDate(Date challanDate) {
		this.challanDate = challanDate;
	}

	public String getWhomToDispatch() {
		return whomToDispatch;
	}

	public void setWhomToDispatch(String whomToDispatch) {
		this.whomToDispatch = whomToDispatch;
	}

	public String getTransporter() {
		return transporter;
	}

	public void setTransporter(String transporter) {
		this.transporter = transporter;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Date getInDate() {
		return inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
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

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(Timestamp updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public String getOpenClose() {
		return openClose;
	}

	public void setOpenClose(String openClose) {
		this.openClose = openClose;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
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

	public String getVeighclePassNO() {
		return veighclePassNO;
	}

	public void setVeighclePassNO(String veighclePassNO) {
		this.veighclePassNO = veighclePassNO;
	}

	@Override
	public String toString() {
		return "FinishingDispatchRegHdr [hdrId=" + hdrId + ", vehicleNo=" + vehicleNo + ", challanNo=" + challanNo
				+ ", challanDate=" + challanDate + ", whomToDispatch=" + whomToDispatch + ", transporter=" + transporter
				+ ", driverName=" + driverName + ", inDate=" + inDate + ", inTime=" + inTime + ", outTime=" + outTime
				+ ", outDate=" + outDate + ", updateBy=" + updateBy + ", updateDateTime=" + updateDateTime
				+ ", openClose=" + openClose + ", orderNo=" + orderNo + ", netWeight=" + netWeight + ", grossWeight="
				+ grossWeight + ", actualWeight=" + actualWeight + ", veighclePassNO=" + veighclePassNO + "]";
	}

	public FinishingDispatchRegHdr(long hdrId, String vehicleNo, String challanNo, Date challanDate,
			String whomToDispatch, String transporter, String driverName, Date inDate, Timestamp inTime,
			Timestamp outTime, Date outDate, String updateBy, Timestamp updateDateTime, String openClose,
			String orderNo, long netWeight, long grossWeight, long actualWeight, String veighclePassNO) {
		super();
		this.hdrId = hdrId;
		this.vehicleNo = vehicleNo;
		this.challanNo = challanNo;
		this.challanDate = challanDate;
		this.whomToDispatch = whomToDispatch;
		this.transporter = transporter;
		this.driverName = driverName;
		this.inDate = inDate;
		this.inTime = inTime;
		this.outTime = outTime;
		this.outDate = outDate;
		this.updateBy = updateBy;
		this.updateDateTime = updateDateTime;
		this.openClose = openClose;
		this.orderNo = orderNo;
		this.netWeight = netWeight;
		this.grossWeight = grossWeight;
		this.actualWeight = actualWeight;
		this.veighclePassNO = veighclePassNO;
	}

	public FinishingDispatchRegHdr() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
