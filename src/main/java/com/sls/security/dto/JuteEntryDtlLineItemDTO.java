package com.sls.security.dto;

public class JuteEntryDtlLineItemDTO {

	private String advisedJuteTyp;
	private String actualJuteTyp;
	private String advisedQuality;
	private String actualQuality;
	private String advisedQuantity;
	private long actualQuantity;
	private String uom;
	private String remarks;
	private long quantity;
	private long hdrId;
	private String receivedIn;
	private String itemCode;
	private long polineitemnum;
	private int kgs;
	private String openClose;
	
	public String getAdvisedJuteTyp() {
		return advisedJuteTyp;
	}
	public void setAdvisedJuteTyp(String advisedJuteTyp) {
		this.advisedJuteTyp = advisedJuteTyp;
	}
	public String getActualJuteTyp() {
		return actualJuteTyp;
	}
	public void setActualJuteTyp(String actualJuteTyp) {
		this.actualJuteTyp = actualJuteTyp;
	}
	public String getAdvisedQuality() {
		return advisedQuality;
	}
	public void setAdvisedQuality(String advisedQuality) {
		this.advisedQuality = advisedQuality;
	}
	public String getActualQuality() {
		return actualQuality;
	}
	public void setActualQuality(String actualQuality) {
		this.actualQuality = actualQuality;
	}
	public String getAdvisedQuantity() {
		return advisedQuantity;
	}
	public void setAdvisedQuantity(String advisedQuantity) {
		this.advisedQuantity = advisedQuantity;
	}
	public long getActualQuantity() {
		return actualQuantity;
	}
	public void setActualQuantity(long actualQuantity) {
		this.actualQuantity = actualQuantity;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	
	
	public long getHdrId() {
		return hdrId;
	}
	public void setHdrId(long hdrId) {
		this.hdrId = hdrId;
	}
	public String getReceivedIn() {
		return receivedIn;
	}
	public void setReceivedIn(String receivedIn) {
		this.receivedIn = receivedIn;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public long getPolineitemnum() {
		return polineitemnum;
	}
	public void setPolineitemnum(long polineitemnum) {
		this.polineitemnum = polineitemnum;
	}
	public int getKgs() {
		return kgs;
	}
	public void setKgs(int kgs) {
		this.kgs = kgs;
	}
	public String getOpenClose() {
		return openClose;
	}
	public void setOpenClose(String openClose) {
		this.openClose = openClose;
	}
	@Override
	public String toString() {
		return "JuteEntryDtlLineItemDTO [advisedJuteTyp=" + advisedJuteTyp + ", actualJuteTyp=" + actualJuteTyp
				+ ", advisedQuality=" + advisedQuality + ", actualQuality=" + actualQuality + ", advisedQuantity="
				+ advisedQuantity + ", actualQuantity=" + actualQuantity + ", uom=" + uom + ", remarks=" + remarks
				+ ", quantity=" + quantity + "]";
	}
	public JuteEntryDtlLineItemDTO(String advisedJuteTyp, String actualJuteTyp, String advisedQuality,
			String actualQuality, String advisedQuantity, long actualQuantity, String uom, String remarks,
			long quantity) {
		super();
		this.advisedJuteTyp = advisedJuteTyp;
		this.actualJuteTyp = actualJuteTyp;
		this.advisedQuality = advisedQuality;
		this.actualQuality = actualQuality;
		this.advisedQuantity = advisedQuantity;
		this.actualQuantity = actualQuantity;
		this.uom = uom;
		this.remarks = remarks;
		this.quantity = quantity;
	}
	public JuteEntryDtlLineItemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
