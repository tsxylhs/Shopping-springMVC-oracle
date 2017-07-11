package com.lhs.shopping.service.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.Goods;

public interface shoppingGoodsservice {
 public int insertGoods(Goods goods);
 public List<Map<String, Object>> queryAll();
public int deletegoods(int ids);
}
