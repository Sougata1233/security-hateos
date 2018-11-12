package com.sls.security.dto;

import java.sql.Date;

public class UomMasterDTO {
	
	private String uomCode;
	private String uomDesc;
	private String user1;
	private Date date1;
	private String user2;
	private Date date2;
	private String user3;
	private Date date3;
	private String user4;
	private Date date4;
	private String activeFlag;
	private String modBy;
	private Date modOn;

	public String getUomCode() {
		return uomCode;
	}

	public void setUomCode(String uomCode) {
		this.uomCode = uomCode;
	}

	public String getUomDesc() {
		return uomDesc;
	}

	public void setUomDesc(String uomDesc) {
		this.uomDesc = uomDesc;
	}

	public String getUser1() {
		return user1;
	}

	public void setUser1(String user1) {
		this.user1 = user1;
	}

	public Date getDate1() {
		return date1;
	}

	public void setDate1(Date date1) {
		this.date1 = date1;
	}

	public String getUser2() {
		return user2;
	}

	public void setUser2(String user2) {
		this.user2 = user2;
	}

	public Date getDate2() {
		return date2;
	}

	public void setDate2(Date date2) {
		this.date2 = date2;
	}

	public String getUser3() {
		return user3;
	}

	public void setUser3(String user3) {
		this.user3 = user3;
	}

	public Date getDate3() {
		return date3;
	}

	public void setDate3(Date date3) {
		this.date3 = date3;
	}

	public String getUser4() {
		return user4;
	}

	public void setUser4(String user4) {
		this.user4 = user4;
	}

	public Date getDate4() {
		return date4;
	}

	public void setDate4(Date date4) {
		this.date4 = date4;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getModBy() {
		return modBy;
	}

	public void setModBy(String modBy) {
		this.modBy = modBy;
	}

	public Date getModOn() {
		return modOn;
	}

	public void setModOn(Date modOn) {
		this.modOn = modOn;
	}

	public UomMasterDTO(String uomCode, String uomDesc, String user1, Date date1, String user2, Date date2, String user3,
			Date date3, String user4, Date date4, String activeFlag, String modBy, Date modOn) {
		super();
		this.uomCode = uomCode;
		this.uomDesc = uomDesc;
		this.user1 = user1;
		this.date1 = date1;
		this.user2 = user2;
		this.date2 = date2;
		this.user3 = user3;
		this.date3 = date3;
		this.user4 = user4;
		this.date4 = date4;
		this.activeFlag = activeFlag;
		this.modBy = modBy;
		this.modOn = modOn;
	}

	public UomMasterDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UomMasterDTO [uomCode=" + uomCode + ", uomDesc=" + uomDesc + ", user1=" + user1 + ", date1=" + date1
				+ ", user2=" + user2 + ", date2=" + date2 + ", user3=" + user3 + ", date3=" + date3 + ", user4=" + user4
				+ ", date4=" + date4 + ", activeFlag=" + activeFlag + ", modBy=" + modBy + ", modOn=" + modOn + "]";
	}
	
	

}
