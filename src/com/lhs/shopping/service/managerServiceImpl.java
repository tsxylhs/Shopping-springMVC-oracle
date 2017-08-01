package com.lhs.shopping.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lhs.shopping.entity.Role;
import com.lhs.shopping.entity.permiss;
import com.lhs.shopping.entity.rolepri;
import com.lhs.shopping.entity.users;
import com.lhs.shopping.service.iface.managerService;
import com.lhs.shopping.dao.iface.managerDao;
@Service("managerService")
public class managerServiceImpl implements managerService{

	@Resource 
	managerDao managerDao;
	public List<Map<String, Object>> querypri(users user) {
		// TODO Auto-generated method stub
		return managerDao.querypri(user);
	}
	@Override
	public List<Map<String, Object>> queryRoleperAll() {
		// TODO Auto-generated method stub
		return managerDao.queryRoleperAll();
	}
	@Override
	public List<Map<String, Object>> queryUserRole() {
		// TODO Auto-generated method stub
		return managerDao.queryUserRole();
	}
	@Override
	public List<Map<String, Object>> queryUser() {
		// TODO Auto-generated method stub
		return managerDao.queryUser();
	}
	@Override
	public List<Map<String, Object>> queryRole() {
		// TODO Auto-generated method stub
		return managerDao.queryRole();
	}
	@Override
	public List<Map<String, Object>> queryqueryPri() {
		// TODO Auto-generated method stub
		return managerDao.querypPRI();
	}
	@Override
	public int userAddrole(int userid, int roleid) {
		// TODO Auto-generated method stub
		return managerDao.userAdrole(userid,roleid);
	}
	@Override
	public int roleAddpri(int roleid, int priid) {
		
		return managerDao.roleAddpri(roleid, priid);
	}
	@Override
	public int Addrole(Role role) {
		// TODO Auto-generated method stub
		return managerDao.Addrole(role);
	}

	@Override
	public int deleteUserRole( int ur_id) {
		// TODO Auto-generated method stub
		return managerDao.deleteUserRole(ur_id);
	}
	@Override
	public int deleteRolePri( int role_id) {
		// TODO Auto-generated method stub
		return managerDao.deleteRolePri(role_id);
	}
	@Override
	public int deleteUser(int userid) {
		// TODO Auto-generated method stub
		return managerDao.deleteuser(userid);
	}
	@Override
	public int addper(permiss permiss) {
		// TODO Auto-generated method stub
		return managerDao.addper(permiss);
	}


}
