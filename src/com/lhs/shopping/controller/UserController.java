package com.lhs.shopping.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.lhs.shopping.service.iface.userService;
import com.lhs.shopping.entity.User;
@Controller
public class UserController {
	@Resource
	userService userService;
	@RequestMapping("register")
	public String login(HttpServletRequest request,HttpServletResponse response ,User user){
	    if(userService.insertuser(user)!=0){
		return "home";
	    }
	    else{
		return "login";
	        }
	    }
}
