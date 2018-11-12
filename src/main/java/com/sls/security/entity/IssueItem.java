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
@Table(name="SCM_GOODS_ISSUE_TRAN")
public class IssueItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISSUE_ITM_SEQ")
    @SequenceGenerator(sequenceName = "SCM_ISSUE_ITM_SEQ", allocationSize = 1, name = "ISSUE_ITM_SEQ")	
	@Column(name="ISSUE_ID")
	private  long id;
	
	
	
	@Column(name="INDENT_NO")
	private  long indentId;
	
	@Column(name="GROUP_CODE")
	private  String itemGroupId;
	
	@Column(name="ITEM_CODE")
	private  String itemId;
	
	@Column(name="UOM_CODE")
	private  String unitId;
	
	
	@Column(name="INDENT_QUANTITY")
	private float indentQuantity;
	
	@Column(name="ISSUED_QUANTITY")
	private float issuedQuantity;
		
	@Column(name="QUALITY")
	private  long qualityCode;
	
	@Column(name="MARKA")
	private  String marka;
	
	@Column(name="ISSUED_BY")
	private  String issuer ;
	
	@Column(name="ISSUED_TO")
	private  String receiver ;
	
	@Column(name="ISSUED_ON")
	private  Date issueDate ;
	
	@Column(name="MOD_BY")
	private  String lastModifiedUser ;
	

	@Column(name="MOD_ON")
	private  Date lastModifiedDate ;
	
	@Column(name="DEPT_ID")
	private  long deptId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getIndentId() {
		return indentId;
	}

	public void setIndentId(long indentId) {
		this.indentId = indentId;
	}

	public String getItemGroupId() {
		return itemGroupId;
	}

	public void setItemGroupId(String itemGroupId) {
		this.itemGroupId = itemGroupId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getUnitId() {
		return unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	
	public long getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(long qualityCode) {
		this.qualityCode = qualityCode;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public long getDeptId() {
		return deptId;
	}

	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}

	public float getIndentQuantity() {
		return indentQuantity;
	}

	public void setIndentQuantity(float indentQuantity) {
		this.indentQuantity = indentQuantity;
	}

	public float getIssuedQuantity() {
		return issuedQuantity;
	}

	public void setIssuedQuantity(float issuedQuantity) {
		this.issuedQuantity = issuedQuantity;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getLastModifiedUser() {
		return lastModifiedUser;
	}

	public void setLastModifiedUser(String lastModifiedUser) {
		this.lastModifiedUser = lastModifiedUser;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	
	
	

}
