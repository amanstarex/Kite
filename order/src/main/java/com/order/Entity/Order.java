package com.order.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer orderID;
	private Integer quantity;
	private Integer punchTime;
	
	
	public Order(Integer orderID, Integer quantity, Integer punchTime) {
		super();
		this.orderID = orderID;
		this.quantity = quantity;
		this.punchTime = punchTime;
	}


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getOrderID() {
		return orderID;
	}


	public void setOrderID(Integer orderID) {
		this.orderID = orderID;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Integer getPunchTime() {
		return punchTime;
	}


	public void setPunchTime(Integer punchTime) {
		this.punchTime = punchTime;
	}


	@Override
	public String toString() {
		return "Order [orderID=" + orderID + ", quantity=" + quantity + ", punchTime=" + punchTime + "]";
	}
	
	
	
	
	
}
