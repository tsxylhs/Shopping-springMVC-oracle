package com.lhs.shopping.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.druid.stat.TableStat.Mode;
import com.lhs.shopping.entity.Role;
import com.lhs.shopping.entity.permiss;
import com.lhs.shopping.entity.rolepri;
import com.lhs.shopping.entity.users;
import com.lhs.shopping.service.iface.managerService;
import com.lhs.shopping.service.iface.userPageService;
import com.lhs.shopping.service.iface.userService;
@Controller
public class managerUserController {
	@Resource
	userService userService;
	@Resource
	managerService managerService;
	
      //添加用户
	@RequestMapping("register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, users user) {
		System.out.println(user.toString());
		ModelAndView mv = new ModelAndView();
		if (userService.insertuser(user) != 0) {
         /*   List<Map<String, Object>> list = userService.queryAll();
			mv.addObject("users", list);*/
			mv.setViewName("login");
			return mv;
		} else {
			mv.setViewName("register");
			return mv;
		}
		
	}
	//登陆
	@SuppressWarnings("unused")
	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, users user) {
        ModelAndView mv = new ModelAndView();
		users user1 = new users();
	    user1=userService.checkuser(user);
	//    System.out.println(user1.toString());
		if (user1 != null) {
			
			List<Map<String, Object>> list=managerService.querypri(user1);
			for (int i=0;i<list.size();i++) {
				System.out.println("我是啥子");
				System.out.println(list.get(i));
				
			}
			mv.addObject("rolepri",list);
			mv.setViewName("/view/index");
			request.getSession().setAttribute("role", list);
			request.getSession().setAttribute("user", user1);
			return mv;
		} else {
			System.out.println("我是二傻子");
			int err=1;
			mv.addObject("err",err);
			mv.setViewName("login");
			return mv;
		}
	}
	/*//角色权限表
	@RequestMapping("rolepermission")
	public ModelAndView rolepermission(){
         List<Map<String,Object>> list=managerService.queryRoleperAll();
         for (int i=0;i<list.size();i++) {
				System.out.println(list.get(i));}
		return null;
		
	}*/
	//用户角色表
/*	@RequestMapping("userrole")
	public ModelAndView userrole(){
		 List<Map<String,Object>> list=managerService.queryUserRole();
		 for (int i=0;i<list.size();i++) {
				System.out.println(list.get(i));}
		 return null;
	}*/
	//查询所有用户
	@RequestMapping("findusers")
	public ModelAndView findusers(){
		 List<Map<String,Object>> list=managerService.queryUser();
		 List<Map<String,Object>> rolelist=managerService.queryRole();
		 List<Map<String,Object>> listuserrole=managerService.queryUserRole();
		 for (int i=0;i<list.size();i++) {
				System.out.println(list.get(i));}
		        ModelAndView mv=new ModelAndView();
		        mv.addObject("usermanager", list);
		        mv.addObject("rolelist",rolelist);
		        mv.addObject("listuserrole",listuserrole);
		        mv.setViewName("view/userMamager");
		return mv;
	}
	//删除用户
	@RequestMapping("deleteusers")
	public ModelAndView  deleteusers(HttpServletRequest  req){
	int userID=Integer.parseInt(req.getParameter("userID"));
		int userid=0;
		int i=managerService.deleteUser(userID);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
		
	}
	//查询所有角色
	@RequestMapping("findrole")
	public ModelAndView findrole(){
		 List<Map<String,Object>> list=managerService.queryRole();
		 List<Map<String,Object>> rplist=managerService.queryRoleperAll();
		 List<Map<String,Object>> plist=managerService.queryqueryPri();
		 for (int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
		 }
		ModelAndView mv=new ModelAndView();
		mv.addObject("rolelist",list);
		mv.addObject("rplist",rplist);
		mv.addObject("perlist",plist);
		mv.setViewName("view/rolepres");
		return mv;
	}
	/*//查询所有权限
	@RequestMapping("findpri")
	public ModelAndView findpri(){
		List<Map<String,Object>> list=managerService.queryqueryPri();
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		return null;
	}*/
	//给用户添加角色
	@RequestMapping("userAddrole")
	public ModelAndView userAdrole(HttpServletRequest req){
		int userID=Integer.parseInt(req.getParameter("userID"));
		int roleID=Integer.parseInt(req.getParameter("roleID"));
		System.out.println(userID+" "+roleID);
		int userid = 0;
		int roleid = 0;
		int i=managerService.userAddrole(userID,roleID);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
	}
	//角色添加权限
	@RequestMapping("roleAddpri")
	public ModelAndView roleAddpri(HttpServletRequest req){
		int perID=Integer.parseInt(req.getParameter("perID"));
		int roleID=Integer.parseInt(req.getParameter("roleID"));
		System.out.println(perID+" "+roleID);
	
	    int i=managerService.roleAddpri(roleID,perID);
	    ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
	}
	//添加角色
	@RequestMapping("Addrole")
	public ModelAndView addrole(Role role){
		System.out.println(role.toString());
		int i=managerService.Addrole(role);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
	}
	//删除用户角色
	@RequestMapping("deleteUserrole")
	public ModelAndView deleteUserrole(HttpServletRequest req){
	        int ur_id=Integer.parseInt(req.getParameter("ur_id"));
		int  i=managerService.deleteUserRole(ur_id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
	}
	//删除角色的权限
	@RequestMapping("deleterolepri")
	public ModelAndView deleterolepri(HttpServletRequest req){
		int rp_id=Integer.parseInt(req.getParameter("rp_id"));
		
		int i=managerService.deleteRolePri(rp_id);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
	}
	//添加权限
	@RequestMapping("addper")
	public ModelAndView addper(permiss permiss){
		System.out.println(permiss.toString());
		int i=managerService.addper(permiss);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("/view/index");
		return mv;
		
	}
}
