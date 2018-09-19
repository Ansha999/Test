package com.java.walmart.entity;




import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Order {

	@Id
	@Column
	private String OrderId;
	@Column
	private Date Orderdate;
	@Column
	private double OrderAmount;
	@Column
	private String status ;
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public Date getOrderdate() {
		return Orderdate;
	}
	public void setOrderdate(Date orderdate) {
		Orderdate = orderdate;
	}
	public double getOrderAmount() {
		return OrderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		OrderAmount = orderAmount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
