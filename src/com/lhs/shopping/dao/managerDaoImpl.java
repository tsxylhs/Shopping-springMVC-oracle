package com.lhs.shopping.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.lhs.shopping.dao.iface.managerDao;
import com.lhs.shopping.entity.Role;
import com.lhs.shopping.entity.rolepri;
import com.lhs.shopping.entity.users;
@Repository("managerDao")
public class managerDaoImpl implements managerDao {
	@Resource
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Map<String, Object>> querypri(users user) {
	         System.out.println(user.getId());
		String sql="select u.username, p.id,p.per_name,p.per_url,p.per_massger "
				+ "from Users u inner join user_role ur on u.id=ur.user_id inner "
				+ "join role_permission rp on ur.role_id=rp.role_id "
				+ "inner join permission p on rp.permission_id=p.id where u.id='"+user.getId()+"'";
		
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public List<Map<String, Object>> queryRoleperAll() {
		String sql="  select  r.id,p.id ,r.rolename,p.per_name,p.per_url,p.per_massger from role r"
				+ " inner join role_permission rp on r.id=rp.role_id "
				+ "inner join permission p on rp.permission_id=p.id ";
		
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public List<Map<String, Object>> queryUserRole() {
		String sql="select  u.id, u.username, r.rolename,r.massage  from users u"
				+ " inner join user_role sr on u.id=sr.id "
				+ "inner join role r on sr.id=r.id";
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public List<Map<String, Object>> queryUser() {
		String sql="select * from Users";
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public List<Map<String, Object>> queryRole() {
	            String sql=" select * from role";
	return jdbcTemplate.queryForList(sql);
	}
	@Override
	public List<Map<String, Object>> querypPRI() {
		String sql=" select  * from permission";
		return jdbcTemplate.queryForList(sql);
	}
	@Override
	public int userAdrole(int userid, int roleid) {
		String sql="insert into user_role values(1,?,?)";
		int count=jdbcTemplate.update(sql, new Object[]{userid,roleid});
		return count;
	
	}
	@Override
	public int roleAddpri(int roleid, int priid) {
		String sql="insert into role_permission  values(1,?,?)";
		int count=jdbcTemplate.update(sql, new Object[]{roleid,priid});
		return count;
	}
	@Override
	public int Addrole(Role role) {
		String sql=" insert into role values(1,?,?)";
		int count=jdbcTemplate.update(sql,new Object[]{role.getRolename(),role.getRolemesage()});
		
		return 0;
	}
	@Override
	public int deleteUserRole(int userid, int role_id) {
	String sql=" delete user_role where user_Id=? and role_id=?";
	int count=jdbcTemplate.update(sql,new Object[]{userid});
	
		return count;
	}
	@Override
	public int deleteRolePri(int pri_id, int role_id) {
		String sql=" delete  role_permission  where permission_id=? and role_id=?";
		int count=jdbcTemplate.update(sql,new Object[]{pri_id,role_id});
		
		return count;
	}

	

}
