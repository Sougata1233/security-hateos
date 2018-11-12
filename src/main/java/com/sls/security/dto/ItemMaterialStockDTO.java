package com.sls.security.dto;

public class ItemMaterialStockDTO {
	
	private  String id;
	private  String itemId ;
	private  String stock ;
	private  String wareHouseNo ;
	private  long goodReceiveNo;
	private  long goodItemSerialNo;
	private  String goodType ;
	private  String qualityCode ;
	private  String groupId;
	private ItemDTO itemInStock;
	
	 public ItemMaterialStockDTO()
	    {
	        super();
	    }

	    public ItemMaterialStockDTO(String id,String itemId,String groupId,String stock,String goodType,String qualityCode, ItemDTO itemInStock,String wareHouseNo)
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

	public ItemDTO getItemInStock() {
		return itemInStock;
	}

	public void setItemInStock(ItemDTO itemInStock) {
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
