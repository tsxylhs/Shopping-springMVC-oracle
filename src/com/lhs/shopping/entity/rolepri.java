package com.lhs.shopping.entity;

public class rolepri {
private String pre_name;
private String pre_url;
private int id;
public String getPre_name() {
	return pre_name;
}
public void setPre_name(String pre_name) {
	this.pre_name = pre_name;
}
public String getPre_url() {
	return pre_url;
}
public rolepri(String pre_name, String pre_url, int id) {
	super();
	this.pre_name = pre_name;
	this.pre_url = pre_url;
	this.id = id;
}
public rolepri() {
	// TODO Auto-generated constructor stub
}
public void setPre_url(String pre_url) {
	this.pre_url = pre_url;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
	
	
}
