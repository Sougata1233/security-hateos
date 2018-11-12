package com.sls.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity()
@Table(name="SCM_ITEM_MATERIAL_STOCK_VIEW")
public class ItemMaterialStock {
	
	@Id
	@Column(name="ID")
	private  String id;
	
	@Column(name="ITEM_CODE",insertable = false, updatable = false)
	private  String itemId ;
	
	@Column(name="STOCK")	
	private  String stock ;
	
	@Column(name="WAREHOUSE_NO")	
	private  String wareHouseNo ;
	
	@Column(name="GOOD_RECEIVE_NO")	
	private  long goodReceiveNo;
	
	@Column(name="GOOD_ITEM_SRL_NO")	
	private  long goodItemSerialNo;
	
	
	@Column(name="GOOD_TYPE")
	private  String goodType ;
	
	@Column(name="QUALITY_CODE")
	private  String qualityCode ;
		
	@Column(name="GROUP_CODE")
	private  String groupId;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_CODE")
	@JsonIgnore
	private ItemMaster itemInStock;
	
	 public ItemMaterialStock()
	    {
	        super();
	    }

	    public ItemMaterialStock(String id,String itemId,String groupId,String stock,String goodType,String qualityCode, ItemMaster itemInStock,String wareHouseNo)
	    {
	        super();
	        this.id = id;
	        this.groupId=groupId;
	        this.itemId=itemId;
	        this.stock=stock;
	        this.itemInStock=itemInStock;
	        this.goodType=goodType;
	        this.qualityCode=qualityCode;
	        this.wareHouseNo=wareHouseNo;
	        
	    }


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
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

	public ItemMaster getItemInStock() {
		return itemInStock;
	}

	public void setItemInStock(ItemMaster itemInStock) {
		this.itemInStock = itemInStock;
	}

	public String getGoodType() {
		return goodType;
	}

	public void setGoodType(String goodType) {
		this.goodType = goodType;
	}

	public String getQualityCode() {
		return qualityCode;
	}

	public void setQualityCode(String qualityCode) {
		this.qualityCode = qualityCode;
	}

	public String getWareHouseNo() {
		return wareHouseNo;
	}

	public void setWareHouseNo(String wareHouseNo) {
		this.wareHouseNo = wareHouseNo;
	}

	public long getGoodReceiveNo() {
		return goodReceiveNo;
	}

	public void setGoodReceiveNo(long goodReceiveNo) {
		this.goodReceiveNo = goodReceiveNo;
	}

	public long getGoodItemSerialNo() {
		return goodItemSerialNo;
	}

	public void setGoodItemSerialNo(long goodItemSerialNo) {
		this.goodItemSerialNo = goodItemSerialNo;
	}
	
	

	

	

}
