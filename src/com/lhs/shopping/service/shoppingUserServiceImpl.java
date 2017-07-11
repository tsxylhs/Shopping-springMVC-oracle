package com.lhs.shopping.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhs.shopping.dao.iface.shoppingUserDao;

import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.service.iface.shoppingUserService;
@Service("shoppingUserService")
public class shoppingUserServiceImpl implements shoppingUserService {
	@Resource 
	shoppingUserDao shoppingUserDao;
	 public int addShoppingUser(ShoppingUser ShoppingUser){
		return shoppingUserDao.addShoppingUser(ShoppingUser);
		 
	 }
	@Override
	public List<Map<String, Object>> queryAll() {
		// TODO Auto-generated method stub
		return shoppingUserDao.queryAll();
	}
	@Override
	public int deleteShoppingUser(int userid) {
		return shoppingUserDao.deleteShopingUser(userid);
	}
}
