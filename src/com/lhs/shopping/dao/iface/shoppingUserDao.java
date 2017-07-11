package com.lhs.shopping.dao.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.ShoppingUser;

public interface shoppingUserDao {
     public int addShoppingUser(ShoppingUser shoppinguser);
     public List<Map<String, Object>> queryAll();
	public int deleteShopingUser(int userid);
}
