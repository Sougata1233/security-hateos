package com.sls.security.dto;

import java.sql.Blob;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

public class ItemDTO {
	
	private  String id;
	private  String name ;
	private String location;
	private  String stock ;
	private  String groupId;
	private  String hsnCode;
	private  UomMasterDTO uomCode;
	private String uomPur;
	private long multiFact;
	private long srRate;
	private String directIndirectTag;
	private String splItemTag;
	private String issuableTag;
	private String user1;
	private Date date1;
	private String user2;
	private Date date2;
	private String user3;
	private Date date3;
	private String user4;
	private Date date4;
	private String activeFlag;
	private String dtlItemDesc1;
	private String dtlItemDesc2;
	private String make;
	private Blob itemPhoto;
	private String modBy;
	private Date modOn;
	private String threshold;
	private long deptID;
	private  String legacyItemCode;
	
	public String getLegacyItemCode() {
		return legacyItemCode;
	}

	public void setLegacyItemCode(String legacyItemCode) {
		this.legacyItemCode = legacyItemCode;
	}

	@OneToOne(mappedBy="itemInStock",cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)	   
    private ItemStockDTO itemStock;
	
	@OneToOne(mappedBy="itemInTax",cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)	   
    private ItemTaxDTO itemTax;

	@OneToOne(mappedBy="quantityInUnit",cascade = CascadeType.ALL,fetch = FetchType.LAZY, optional = false)	   
    private QuantityUnitDTO quantityUnit;

	
	
	 public ItemDTO()
	    {
	        super();
	    }

	    public ItemDTO(String id, String name,String stock,String groupId,String hsnCode, ItemStockDTO itemStock,ItemTaxDTO itemTax,QuantityUnitDTO quantityUnit,String legacyItemCode)
	    {
	        super();
	        this.id = id;
	        this.name = name;
	        this.stock=stock;
	        this.groupId=groupId;
	        this.hsnCode=hsnCode;
	        this.itemStock=itemStock;
	        this.itemTax=itemTax;
	        this.quantityUnit=quantityUnit;
	        this.legacyItemCode=legacyItemCode;
	        
	    }
	
	public ItemStockDTO getItemStock() {
		return itemStock;
	}

	public void setItemStock(ItemStockDTO itemStock) {
		this.itemStock = itemStock;
	}

	public ItemTaxDTO getItemTax() {
		return itemTax;
	}

	public void setItemTax(ItemTaxDTO itemTax) {
		this.itemTax = itemTax;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public UomMasterDTO getUomCode() {
		return uomCode;
	}

	public void setUomCode(UomMasterDTO uomCode) {
		this.uomCode = uomCode;
	}

	public QuantityUnitDTO getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(QuantityUnitDTO quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUomPur() {
		return uomPur;
	}

	public void setUomPur(String uomPur) {
		this.uomPur = uomPur;
	}

	public long getMultiFact() {
		return multiFact;
	}

	public void setMultiFact(long multiFact) {
		this.multiFact = multiFact;
	}

	public long getSrRate() {
		return srRate;
	}

	public void setSrRate(long srRate) {
		this.srRate = srRate;
	}

	public String getDirectIndirectTag() {
		return directIndirectTag;
	}

	public void setDirectIndirectTag(String directIndirectTag) {
		this.directIndirectTag = directIndirectTag;
	}

	public String getSplItemTag() {
		return splItemTag;
	}

	public void setSplItemTag(String splItemTag) {
		this.splItemTag = splItemTag;
	}

	public String getIssuableTag() {
		return issuableTag;
	}

	public void setIssuableTag(String issuableTag) {
		this.issuableTag = issuableTag;
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

	public String getDtlItemDesc1() {
		return dtlItemDesc1;
	}

	public void setDtlItemDesc1(String dtlItemDesc1) {
		this.dtlItemDesc1 = dtlItemDesc1;
	}

	public String getDtlItemDesc2() {
		return dtlItemDesc2;
	}

	public void setDtlItemDesc2(String dtlItemDesc2) {
		this.dtlItemDesc2 = dtlItemDesc2;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Blob getItemPhoto() {
		return itemPhoto;
	}

	public void setItemPhoto(Blob itemPhoto) {
		this.itemPhoto = itemPhoto;
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

	public String getThreshold() {
		return threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
	}

	public long getDeptID() {
		return deptID;
	}

	public void setDeptID(long deptID) {
		this.deptID = deptID;
	}
	
	
	
	


}
