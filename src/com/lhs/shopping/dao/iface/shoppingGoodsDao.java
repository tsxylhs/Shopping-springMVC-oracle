package com.lhs.shopping.dao.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.Goods;

public interface shoppingGoodsDao {

 public int insertGoods(Goods goods);
 public List<Map<String, Object>> queryAll();
public int deletegoods(int ids);
}
