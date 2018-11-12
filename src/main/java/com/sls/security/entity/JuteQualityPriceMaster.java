package com.sls.security.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity()
@Table(name="JUTE_QUALITY_PRICE_MASTER")

public class JuteQualityPriceMaster {
	
	@Id
	@Column(name="ID")
	private  long id;
	
	@Column(name="ITEM_CODE")
	private  String itemCode ;
	
	@Column(name="JUTE_QUALITY")
	private  String juteQuality ;
	
	@Column(name="RATE")
	private  float rate ;
	
	@Column(name="CURRENCY")
	private  String currency ;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getJuteQuality() {
		return juteQuality;
	}

	public void setJuteQuality(String juteQuality) {
		this.juteQuality = juteQuality;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	

}
