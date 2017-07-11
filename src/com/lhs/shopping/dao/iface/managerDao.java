package com.lhs.shopping.dao.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.Role;
import com.lhs.shopping.entity.rolepri;
import com.lhs.shopping.entity.users;

public interface managerDao {

	public List<Map<String, Object>> querypri(users user);

	public List<Map<String, Object>> queryRoleperAll();

	public List<Map<String, Object>> queryUserRole();

	public List<Map<String, Object>> queryUser();

	public List<Map<String, Object>> queryRole();

	public List<Map<String, Object>> querypPRI();

	public int userAdrole(int userid, int roleid);

	public int roleAddpri(int roleid, int priid);

	public int Addrole(Role role);

	public int deleteUserRole(int userid, int roleid);

	public int deleteRolePri(int pri_id, int role_id);


	

}
