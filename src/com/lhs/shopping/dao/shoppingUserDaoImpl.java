package com.lhs.shopping.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lhs.shopping.dao.iface.shoppingUserDao;

import com.lhs.shopping.entity.ShoppingUser;

@Repository("shoppingUserDao")
public class shoppingUserDaoImpl implements shoppingUserDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryAll() {
		String sql="select * from shoppinguser";
		List<String> list = jdbcTemplate.queryForList("select userId from shoppinguser",String.class);
		System.out.println(list.size());
		return jdbcTemplate.queryForList(sql);
	}
	
	@Override
	public int addShoppingUser(ShoppingUser shoppinguser) {
		System.out.println(shoppinguser.toString());
		
		String sql="insert into shoppinguser values(1,?,?,?)";
		int count=jdbcTemplate.update(sql, new Object[]{shoppinguser.getEmiail(),shoppinguser.getUsername(),shoppinguser.getPassword()});
		return count;
	
	}

	@Override
	public int deleteShopingUser(int userid) {
		  String sql="delete  shoppinguser where userId=?";
		    
	      int i=jdbcTemplate.update(sql, new Object[] { userid},new int[] { java.sql.Types.INTEGER }
	            
	    		  );
	      System.out.println(i+"我是删除参数");
	      return i;
	}
	

}
