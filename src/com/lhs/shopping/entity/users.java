package com.lhs.shopping.entity;

public class users {
private int id;
private String username;
private String userpassword;
private String userphone;

public users(int id, String username, String userpassword, String userphone) {
	super();
	this.id = id;
	this.username = username;
	this.userpassword = userpassword;
	this.userphone = userphone;
}
public users() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getUserphone() {
	return userphone;
}
public void setUserphone(String userphone) {
	this.userphone = userphone;
}
@Override
public String toString() {
	return "users [id=" + id + ", username=" + username + ", userpassword=" + userpassword + ", userphone=" + userphone
			+ "]";
}

}
