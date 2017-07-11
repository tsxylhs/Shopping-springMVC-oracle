package com.lhs.shopping.entity;

public class ShoppingUser {
	private int userId;
	private String Emiail;
	private String username;
	private String password;
	@Override
	
	public String toString() {
		return "ShoppingUser [userId=" + userId + ", Emiail=" + Emiail + ", userName=" + username + ", password="
				+ password + "]";
	}
	public ShoppingUser(int userId, String emiail, String userName, String password) {
		super();
		this.userId = userId;
		this.Emiail = emiail;
		this.username = userName;
		this.password = password;
	}
	public ShoppingUser() {
		// TODO Auto-generated constructor stub
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmiail() {
		return Emiail;
	}
	public void setEmiail(String emiail) {
		Emiail = emiail;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
