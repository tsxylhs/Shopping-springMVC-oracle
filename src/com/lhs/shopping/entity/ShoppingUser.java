package com.lhs.shopping.entity;

public class ShoppingUser {
	private int userId;
	private String Emiail;
	private String username;
	private String password;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ShoppingUser() {
		super();
	}
	public ShoppingUser(int userId, String emiail, String username, String password) {
		super();
		this.userId = userId;
		Emiail = emiail;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "ShoppingUser [userId=" + userId + ", Emiail=" + Emiail + ", username=" + username + ", password="
				+ password + "]";
	}


}
