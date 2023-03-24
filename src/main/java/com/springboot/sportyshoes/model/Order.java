package com.springboot.sportyshoes.model;

import java.sql.Date;

public class Order {

	private int orderId;
	private int userId;
	private String shippingAddress;
	private double amount;
	private Date createdOn; 
	private String orderStatus;
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, int userId, String shippingAddress, double amount, Date createdOn, String orderStatus) {
		super();
		this.orderId = orderId;
		this.userId = userId;
		this.shippingAddress = shippingAddress;
		this.amount = amount;
		this.createdOn = createdOn;
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
