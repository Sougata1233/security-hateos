package com.sls.security.dto;

public class SelectionQualityMstDTO {
	
	private long recId;
	private String quality;
	
	public long getRecId() {
		return recId;
	}
	public void setRecId(long recId) {
		this.recId = recId;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "SelectionQualityMstDTO [recId=" + recId + ", quality=" + quality + "]";
	}
	public SelectionQualityMstDTO(long recId, String quality) {
		super();
		this.recId = recId;
		this.quality = quality;
	}
	public SelectionQualityMstDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
