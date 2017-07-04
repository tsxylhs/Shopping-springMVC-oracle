package com.lhs.shopping.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.lhs.shopping.dao.iface.userDao;
import com.lhs.shopping.entity.User;


@Repository("userDao")
public class userDaoImpl implements userDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryAll() {
		String sql="select * from users";
		List<String> list = jdbcTemplate.queryForList("select USERID FROM USERS",String.class);
		System.out.println(list.size());
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public int insertuser(User user) {
		String sql="insert into users values(user_id.nextval,?,?,?,?,?)";
		System.out.println(user.toString());
		int count=jdbcTemplate.update(sql, new Object[]{user.getUsername(),user.getUserpassword(),user.getAge(),user.getSex(),user.getAddress()});
		return count;
	}

	public User checkUserNameAndPassword(User user){
		String sql="select * from users where username=? and userpassword=?";
		List<User> list=jdbcTemplate.query(sql,new Object[]{user.getUsername(),user.getUserpassword()},((RowMapper<User>)(rs,index)->
			new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6))
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
				String sql =" select count(*) from users";
				Number number=  jdbcTemplate.queryForObject(sql, Integer.class);
			    return (number != null ? number.intValue() : 0);	
			    
	}

	@Override
	public List<User> selectuser(int pageX, int pageoN) {
	       String sql="select * from users where rowid in(select rid from (select rownum rn,rid from(select rowid rid,userId from users) where rownum<?) where rn>?)";
		List<User> list=jdbcTemplate.query(sql,new Object[]{pageX*pageoN,(pageX-1)*pageoN},((RowMapper<User>)(rs,index)->
		new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6))
	));
	return null==list||list.size()==0?null:list;
	}
	
	
}
