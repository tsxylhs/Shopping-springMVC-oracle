package com.lhs.shopping.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lhs.shopping.dao.iface.userDao;
import com.lhs.shopping.entity.User;


@Repository("userDao")
public class userDaoImpl implements userDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	
	/*public List<Map<String, Object>> queryAll() {
		String sql="select * from users";
		return jdbcTemplate.queryForList(sql);
	}*/

	@Override
	public int insertuser(User user) {
		String sql="insert into users values(user_id.nextval,?,?,?,?,?)";
		System.out.println(user.toString());
		int count=jdbcTemplate.update(sql, new Object[]{user.getUsername(),user.getUserpassword(),user.getAge(),user.getSex(),user.getAddress()});
		return count;
	}

	/*public User checkUserNameAndPassword(String name,String password){
		String sql="select * from users where name=? and password=?";
		List<User> list=jdbcTemplate.query(sql,new Object[]{name,password},((RowMapper<User>)(rs,index)->
			new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4))
		));
		return null==list||list.size()==0?null:list.get(0);
	}
	
	@Override
	public List<User> queryByName(String name) {
		String sql="select * from users where name like ?";
		List<User> list=null;
		list=jdbcTemplate.query(sql,new Object[]{"%"+name+"%"},(RowMapper<User>) (rs, arg1) -> 
			new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4))
		);
		return list;
	}*/
	
	
}
