package com.java.walmart.entity;

public class OrderItem {

	
	private String itemId;
	private double price;
	private boolean active;
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isStatus() {
		return active;
	}
	public void setStatus(boolean status) {
		this.active = status;
	}
	
	
}
