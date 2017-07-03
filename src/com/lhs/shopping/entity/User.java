package com.lhs.shopping.entity;

public class User {
	private int userId;
	private String username;
	private String userpassword;
	private int age;
	private String sex;
	private String address;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userpassword=" + userpassword + ", age=" + age
				+ ", sex=" + sex + ", address=" + address + "]";
	}

	public User(String username, String userpassword, int age, String sex, String address) {
		super();
		this.username = username;
		this.userpassword = userpassword;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

	public User() {
		super();
	}

	public User(int userId, String username, String userpassword, int age, String sex, String address) {
		super();
		this.userId = userId;
		this.username = username;
		this.userpassword = userpassword;
		this.age = age;
		this.sex = sex;
		this.address = address;
	}

}
