package com.lhs.shopping.service.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.ShoppingUser;

public interface shoppingUserService {
          public int addShoppingUser(ShoppingUser ShoppingUser);
          public List<Map<String, Object>> queryAll();
		public int deleteShoppingUser(int userid);
		
}
