package com.lhs.shopping.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhs.shopping.entity.User;
import com.lhs.shopping.service.iface.userService;
import com.lhs.shopping.dao.iface.userDao;


@Service("userService")
public class userServiceImpl implements userService {
	@Resource 
	userDao userDao;
	@Override
	public int insertuser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertuser(user);
	}
  
}
