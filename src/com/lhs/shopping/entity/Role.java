package com.lhs.shopping.entity;

public class Role {
private int id;
private String rolename;
private String rolemesage;
@Override
public String toString() {
	return "Role [id=" + id + ", rolename=" + rolename + ", rolemesage=" + rolemesage + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getRolename() {
	return rolename;
}
public void setRolename(String rolename) {
	this.rolename = rolename;
}
public String getRolemesage() {
	return rolemesage;
}
public void setRolemesage(String rolemesage) {
	this.rolemesage = rolemesage;
}
}
