package com.lhs.shopping.entity;
/*
 * create :lhs
 * 2017-07-06 
 * 商品类
 */
import java.sql.Blob;

public class Goods {
  private int goodsId;
  private String goodsName;
  private float goodsPrice;
  private Blob goodsImage;
  private String goodsmessages;
  private String flag;
  public String getFlag() {
	return flag;
}

public void setFlag(String flag) {
	this.flag = flag;
}

public Goods(){}
  
public Goods(int goodsId, String goodsName, float goodsPrice, Blob goodsImage, String goodsmessages,String flag) {
	super();
	this.goodsId = goodsId;
	this.goodsName = goodsName;
	this.goodsPrice = goodsPrice;
	this.goodsImage = goodsImage;
	this.goodsmessages = goodsmessages;
	this.flag=flag;
}
@Override
public String toString() {
	return "Goods [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + ", goodsImage="
			+ goodsImage + ", goodsmessages=" + goodsmessages + ", flag=" + flag + "]";
}
public int getGoodsId() {
	return goodsId;
}
public void setGoodsId(int goodsId) {
	this.goodsId = goodsId;
}
public String getGoodsName() {
	return goodsName;
}
public void setGoodsName(String goodsName) {
	this.goodsName = goodsName;
}
public float getGoodsPrice() {
	return goodsPrice;
}
public void setGoodsPrice(float goodsPrice) {
	this.goodsPrice = goodsPrice;
}
public Blob getGoodsImage() {
	return goodsImage;
}
public void setGoodsImage(Blob goodsImage) {
	this.goodsImage = goodsImage;
}
public String getGoodsmessages() {
	return goodsmessages;
}
public void setGoodsmessages(String goodsmessages) {
	this.goodsmessages = goodsmessages;
}
  
}
