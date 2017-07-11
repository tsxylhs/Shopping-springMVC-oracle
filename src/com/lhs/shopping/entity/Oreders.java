package com.lhs.shopping.entity;

import java.sql.Date;

public class Oreders {
 
	private int orderId;
	private int userId;
	private Date orderTime; 
 	private int totalCount;
	private float totalPrice ;
    private String	payMode;
    private String deliverMode ;
	private char isOut;
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
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getPayMode() {
		return payMode;
	}
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	public String getDeliverMode() {
		return deliverMode;
	}
	public void setDeliverMode(String deliverMode) {
		this.deliverMode = deliverMode;
	}
	public char getIsOut() {
		return isOut;
	}
	public void setIsOut(char isOut) {
		this.isOut = isOut;
	}
	
}
