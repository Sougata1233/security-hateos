package com.sls.security.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity()
@Table(name="SCM_ITEM_STOCK_VIEW")
public class ItemStock {
	
	@Id
	@Column(name="ID")
	private  String id;
	
	@Column(name="ITEM_CODE",insertable = false, updatable = false)
	private  String itemId ;
	
	@Column(name="STOCK")	
	private  String stock ;
	
	@Column(name="STORE_ID")	
	private  int storeNo;
	
	
	/*@Column(name="GOOD_RECEIVE_NO")
	private  long goodReceiveNo;
	
	@Column(name="GOOD_ITEM_SRL_NO")
	private  long goodItemSerialNo;
	
	
	@Column(name="NEW_STOCK_EXPIRY_DATE")
	private  Date expiryDate ;*/
	
	@Column(name="GROUP_CODE")
	private  String groupId;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEM_CODE")
	@JsonIgnore
	private ItemMaster itemInStock;
	
	 public ItemStock()
	    {
	        super();
	    }

	    public ItemStock(String id,String itemId,String groupId,String stock, ItemMaster itemInStock, int storeNo, Date expiryDate)
	    {
	        super();
	        this.id = id;
	        this.groupId=groupId;
	        this.itemId=itemId;
	        this.stock=stock;
	        this.itemInStock=itemInStock;
	        this.storeNo=storeNo;
//	        this.expiryDate=expiryDate;
	       
	        
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

	public int getStoreNo() {
		return storeNo;
	}

	public void setStoreNo(int storeNo) {
		this.storeNo = storeNo;
	}

	/*public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
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
	}*/

	
	

	

	

}
