package com.lhs.shopping.entity;
/*
 * create :lhs
 * 购物车
 */
import java.sql.Date;

public class goodsCart {
	private int cartId;
	private int userId;
	private Date createTime;
	private float totalPrice;//商品总价
	private int totalCount;
	
	@Override
	public String toString() {
		return "goodsCart [cartId=" + cartId + ", userId=" + userId + ", createTime=" + createTime + ", totalPrice="
				+ totalPrice + ", totalCount=" + totalCount + "]";
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	

}
