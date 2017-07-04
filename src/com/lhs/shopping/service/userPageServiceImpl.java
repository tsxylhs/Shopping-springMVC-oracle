package com.lhs.shopping.service;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhs.shopping.dao.iface.userDao;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.service.iface.userPageService;
@Service("userPageService")
public class userPageServiceImpl implements userPageService {
	@Resource 
	userDao userDao;
	@Override
	public int allpage() {
		int pageOn=5;
		int rowall=userDao.allpage();
		int pageall = 0;
		if (rowall / pageOn != 0) {
			pageall = rowall / pageOn + 1;
		} else {
			pageall = rowall / pageOn;
		}
		System.out.println(pageall);
		return rowall ;
	}

	@Override
	public List<User> selectuser(int pageX, int pageoN) {
		// TODO Auto-generated method stub
		return userDao.selectuser(pageX, pageoN);
	}

}
