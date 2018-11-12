package com.sls.security.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SELECTION_QUALITY_MST")
public class SelectioinQuallityMst {
	
	@Id
	@Column(name="REC_ID")
	private long recId;
	
	@Column(name="QUALITY")
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
		return "SelectioinQuallityMst [recId=" + recId + ", quality=" + quality + "]";
	}

	public SelectioinQuallityMst(long recId, String quality) {
		super();
		this.recId = recId;
		this.quality = quality;
	}

	public SelectioinQuallityMst() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
