package com.kite.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trade {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tradeId;
	
	private Long buy;
	private Long sell;
	private Long price;
	
	
	
	public Trade() {
		super();
	}
	public Trade(Long buy, Long sell, Long price, Integer tradeId) {
		super();
		this.buy = buy;
		this.sell = sell;
		this.price = price;
		this.tradeId = tradeId;
	}
	
	
	
	public Integer getTradeId() {
		return tradeId;
	}
	public void setTradeId(Integer tradeId) {
		this.tradeId = tradeId;
	}
	public Long getBuy() {
		return buy;
	}
	public void setBuy(Long buy) {
		this.buy = buy;
	}
	public Long getSell() {
		return sell;
	}
	public void setSell(Long sell) {
		this.sell = sell;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Trade [tradeId=" + tradeId + ", buy=" + buy + ", sell=" + sell + ", price=" + price + "]";
	}
	
	
	
	
	
	
}
