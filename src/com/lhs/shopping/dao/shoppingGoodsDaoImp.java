package com.lhs.shopping.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lhs.shopping.dao.iface.shoppingGoodsDao;
import com.lhs.shopping.entity.Goods;


@Repository("shoppingGoodsDao")
public class shoppingGoodsDaoImp implements shoppingGoodsDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	public List<Map<String, Object>> queryAll() {
		String sql="select * from goods";
		List<String> list = jdbcTemplate.queryForList("select goodsId from goods",String.class);
		System.out.println(list.size());
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public int insertGoods(Goods goods) {
		
			System.out.println(goods.toString());	
			String sql="insert into goods values(1,?,?,?,?)";
			int count=jdbcTemplate.update(sql, new Object[]{goods.getGoodsName(),goods.getGoodsPrice(),goods.getGoodsmessages(),goods.getFlag()});
			return count;
		
		}
	@Override
	public int deletegoods(int ids) {
		System.out.println(ids);
		String sql="delete  goods where goodsId=?";
	    
	      int i=jdbcTemplate.update(sql, new Object[] { ids},new int[] { java.sql.Types.INTEGER }
	            
	    		  );
	      System.out.println(i+"我是删除参数");
	      return i;
	}
	}



