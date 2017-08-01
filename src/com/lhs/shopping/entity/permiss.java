package com.lhs.shopping.entity;

public class permiss {
    private int id;
	private  String per_name;
	 private String per_url;
	 private String per_messger;
	 
	@Override
	public String toString() {
		return "permiss [id=" + id + ", per_name=" + per_name + ", per_url=" + per_url + ", per_messger=" + per_messger
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPer_name() {
		return per_name;
	}
	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}
	public String getPer_url() {
		return per_url;
	}
	public void setPer_url(String per_url) {
		this.per_url = per_url;
	}
	public String getPer_messger() {
		return per_messger;
	}
	public void setPer_messger(String per_messger) {
		this.per_messger = per_messger;
	}
	 
}
