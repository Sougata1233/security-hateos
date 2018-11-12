package com.sls.security.dto;

public class ItemTaxDTO {
	
	private  String id;
	private  String hsnCode ;
	private  float gst;
	private ItemDTO itemInTax;
	
	
	 public ItemTaxDTO()
	    {
	        super();
	    }

	    public ItemTaxDTO(String id,float gst,String hsnCode, ItemDTO itemInTax)
	    {
	        super();
	        this.id = id;
	        this.gst=gst;
	        this.hsnCode=hsnCode;
	        this.itemInTax=itemInTax;
	        
	    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHsnCode() {
		return hsnCode;
	}

	public void setHsnCode(String hsnCode) {
		this.hsnCode = hsnCode;
	}

	

	public float getGst() {
		return gst;
	}

	public void setGst(float gst) {
		this.gst = gst;
	}

	public ItemDTO getItemInTax() {
		return itemInTax;
	}

	public void setItemInTax(ItemDTO itemInTax) {
		this.itemInTax = itemInTax;
	}

	

	
	

}
