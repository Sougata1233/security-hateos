package com.sls.security.dto;

import java.util.Date;

public class ItemStockDTO {
	
	private  String id;
	private  String itemId ;
	private  String stock ;
	private  int storeNo;
	private  String groupId;
	private ItemDTO itemInStock;
	
	 public ItemStockDTO()
	    {
	        super();
	    }

	    public ItemStockDTO(String id,String itemId,String groupId,String stock, ItemDTO itemInStock, int storeNo, Date expiryDate)
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

	public ItemDTO getItemInStock() {
		return itemInStock;
	}

	public void setItemInStock(ItemDTO itemInStock) {
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
