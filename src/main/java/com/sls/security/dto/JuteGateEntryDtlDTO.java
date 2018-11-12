package com.sls.security.dto;

public class JuteGateEntryDtlDTO {
	
	private long recId;
	private long hdrId;
	private String advisedJuteTyp;
	private String actualJuteTyp;
	private String advisedQuality;
	private String actualQuality;
	private String advisedQuantity;
	private long actualQuantity;
	private String receivedIn;
	private String uom;
	private String isPoAmment;
	private String remarks;
	private long juteGateSrlNo;
	private String openClose;
	private int kgs;
	private String itemCode;
	private long quantity;
	private long poLineItemNum;

	public long getRecId() {
		return recId;
	}

	public void setRecId(long recId) {
		this.recId = recId;
	}

	public long getHdrId() {
		return hdrId;
	}

	public void setHdrId(long hdrId) {
		this.hdrId = hdrId;
	}

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

	public String getReceivedIn() {
		return receivedIn;
	}

	public void setReceivedIn(String receivedIn) {
		this.receivedIn = receivedIn;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getIsPoAmment() {
		return isPoAmment;
	}

	public void setIsPoAmment(String isPoAmment) {
		this.isPoAmment = isPoAmment;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public long getJuteGateSrlNo() {
		return juteGateSrlNo;
	}

	public void setJuteGateSrlNo(long juteGateSrlNo) {
		this.juteGateSrlNo = juteGateSrlNo;
	}

	public String getOpenClose() {
		return openClose;
	}

	public void setOpenClose(String openClose) {
		this.openClose = openClose;
	}

	public int getKgs() {
		return kgs;
	}

	public void setKgs(int kgs) {
		this.kgs = kgs;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getPoLineItemNum() {
		return poLineItemNum;
	}

	public void setPoLineItemNum(long poLineItemNum) {
		this.poLineItemNum = poLineItemNum;
	}

	public JuteGateEntryDtlDTO(long recId, long hdrId, String advisedJuteTyp, String actualJuteTyp, String advisedQuality,
			String actualQuality, String advisedQuantity, long actualQuantity, String receivedIn, String uom,
			String isPoAmment, String remarks, long juteGateSrlNo, String openClose, int kgs, String itemCode,
			long quantity, long poLineItemNum) {
		super();
		this.recId = recId;
		this.hdrId = hdrId;
		this.advisedJuteTyp = advisedJuteTyp;
		this.actualJuteTyp = actualJuteTyp;
		this.advisedQuality = advisedQuality;
		this.actualQuality = actualQuality;
		this.advisedQuantity = advisedQuantity;
		this.actualQuantity = actualQuantity;
		this.receivedIn = receivedIn;
		this.uom = uom;
		this.isPoAmment = isPoAmment;
		this.remarks = remarks;
		this.juteGateSrlNo = juteGateSrlNo;
		this.openClose = openClose;
		this.kgs = kgs;
		this.itemCode = itemCode;
		this.quantity = quantity;
		this.poLineItemNum = poLineItemNum;
	}

	public JuteGateEntryDtlDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "JuteGateEntryDtlService [recId=" + recId + ", hdrId=" + hdrId + ", advisedJuteTyp=" + advisedJuteTyp
				+ ", actualJuteTyp=" + actualJuteTyp + ", advisedQuality=" + advisedQuality + ", actualQuality="
				+ actualQuality + ", advisedQuantity=" + advisedQuantity + ", actualQuantity=" + actualQuantity
				+ ", receivedIn=" + receivedIn + ", uom=" + uom + ", isPoAmment=" + isPoAmment + ", remarks=" + remarks
				+ ", juteGateSrlNo=" + juteGateSrlNo + ", openClose=" + openClose + ", kgs=" + kgs + ", itemCode="
				+ itemCode + ", quantity=" + quantity + ", poLineItemNum=" + poLineItemNum + "]";
	}
	

}
