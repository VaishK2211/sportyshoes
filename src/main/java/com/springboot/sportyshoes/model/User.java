package com.springboot.sportyshoes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Column(name="email_id")
	private String email;
	@Column(name="user_name")
	private String name;
	@Column(name="Shipping_Address")
	private String shippingAddress;
	@Column(name="phoneNo")
	private String phoneNo;
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int userId;
	@Column(name="is_Admin")
	private Boolean isAdmin=false;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String email, String name, String shippingAddress, String phoneNo, Boolean isAdmin) {
		super();
		this.email = email;
		this.name = name;
		this.shippingAddress = shippingAddress;
		this.phoneNo = phoneNo;
		this.isAdmin = isAdmin;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	
	
}
