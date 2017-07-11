package com.lhs.shopping.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.lhs.shopping.service.iface.shoppingGoodsservice;
import com.lhs.shopping.dao.iface.shoppingGoodsDao;
import com.lhs.shopping.entity.Goods;
@Service("shoppingGoodsservice")
public class shoppingGoodsServiceImp  implements  shoppingGoodsservice {
	@Resource 
	shoppingGoodsDao shoppingGoodsDao;
	
	public int insertGoods(Goods goods){
		return shoppingGoodsDao.insertGoods(goods);
	}
	public List<Map<String, Object>> queryAll(){
		return shoppingGoodsDao.queryAll();
	}
	@Override
	public int deletegoods(int ids) {
		// TODO Auto-generated method stub
		return shoppingGoodsDao.deletegoods(ids);
	}

}
