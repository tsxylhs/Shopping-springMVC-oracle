package com.lhs.shopping.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lhs.shopping.dao.iface.userDao;

import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.entity.users;



@Repository("userDao")
public class userDaoImpl implements userDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryAll() {
		String sql="select * from shoppinguser";
		List<String> list = jdbcTemplate.queryForList("select USERID FROM shoppinguser",String.class);
		System.out.println(list.size());
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int insertuser(users user) {
		String sql="insert into users values(user_id.nextval,?,?,?)";
		System.out.println(user.toString());
		int count=jdbcTemplate.update(sql, new Object[]{user.getUsername(),user.getUserpassword(),user.getUserphone()});
		return count;
	}

	public users checkUserNameAndPassword(users user){
		System.out.println(user.getUsername()+""+user.getUserpassword());
		String sql="select * from users where username=? and userpassword=?";
		List<users> list=jdbcTemplate.query(sql,new Object[]{user.getUsername(),user.getUserpassword()},((RowMapper<users>)(rs,index)->
			new users(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4))
		));
		return null==list||list.size()==0?null:list.get(0);
	}
	/*
	@Override
	public List<User> queryByName(String name) {
		String sql="select * from users where name like ?";
		List<User> list=null;
		list=jdbcTemplate.query(sql,new Object[]{"%"+name+"%"},(RowMapper<User>) (rs, arg1) -> 
			new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4))
		);
		return list;
	}*/

	@Override
	public int allpage() {
				String sql =" select count(*) from shoppinguser";
				Number number=  jdbcTemplate.queryForObject(sql, Integer.class);
			    return (number != null ? number.intValue() : 0);	
			    
	}

	@Override
	public List<ShoppingUser> selectuser(int pageX, int pageoN) {
	       String sql="select * from shoppinguser where rowid in(select rid from (select rownum rn,rid from(select rowid rid,userId from shoppinguser) where rownum<?) where rn>?)";
		List<ShoppingUser> list=jdbcTemplate.query(sql,new Object[]{pageX*pageoN,(pageX-1)*pageoN},((RowMapper<ShoppingUser>)(rs,index)->
		new ShoppingUser(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4))
	));
	return null==list||list.size()==0?null:list;
	}
	 
	public int deleteUser(ShoppingUser user){
	      String sql="delete  shoppinguser where userId=?";
	    
	      int i=jdbcTemplate.update(sql, new Object[] { user.getUserId()},new int[] { java.sql.Types.INTEGER }
	            
	    		  );
	      System.out.println(i+"我是删除参数");
	      return i;
	      
	    		  
		
	}








	
}
