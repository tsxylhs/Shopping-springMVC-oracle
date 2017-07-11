package com.lhs.shopping.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.entity.users;
import com.lhs.shopping.service.iface.userService;
import com.lhs.shopping.dao.iface.userDao;


@Service("userService")
public class userServiceImpl implements userService {
	@Resource 
	userDao userDao;
	@Override
	public int insertuser(users user) {
		// TODO Auto-generated method stub
		return userDao.insertuser(user);
	}
	@Override
	public users checkuser(users user) {
		// TODO Auto-generated method stub
		return userDao.checkUserNameAndPassword(user);
	}
	public List<Map<String, Object>> queryAll(){
		return userDao.queryAll();
	}
	public int deleteUser(ShoppingUser user){
		return userDao.deleteUser(user);
	}
}
