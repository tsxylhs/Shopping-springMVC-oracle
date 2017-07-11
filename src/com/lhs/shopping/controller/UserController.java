package com.lhs.shopping.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lhs.shopping.service.iface.userPageService;
import com.lhs.shopping.service.iface.userService;
import com.lhs.shopping.dao.iface.userDao;

import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.entity.users;

@Controller
public class UserController {
	@Resource
	userService userService;
	@Resource
	userPageService userPageService;
	int pageOn = 5;
	/*
	
	@RequestMapping("register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, users user) {
		ModelAndView mv = new ModelAndView();
		if (userService.insertuser(user) != 0) {

			List<Map<String, Object>> list = userService.queryAll();
			mv.addObject("users", list);
			mv.setViewName("login");
		} else {
			mv.setViewName("register");
			return mv;
		}
		return mv;
	}

	@RequestMapping("login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, users user) {

		ModelAndView mv = new ModelAndView();
		int pageXX=1;
		String pageX = request.getParameter("pageNos");
		if(pageX!=null){
			 pageXX=Integer.parseInt(pageX);
		}
		users user1 = new users();
	    user1=userService.checkuser(user);
		int pageall = userPageService.allpage();
		if (user1 != null) {
			mv.setViewName("/view/index");
			List<ShoppingUser> list = userPageService.selectuser(pageXX, pageOn);
			mv.addObject("recordCount", pageall);
			//mv.addObject("user", user1);
			request.getSession().setAttribute("user", user1);
			mv.addObject("pageNos", pageXX);
			mv.addObject("users", list);

			return mv;
		} else {
			int err=1;
			mv.addObject("err",err);
			mv.setViewName("login");
			return mv;
		}
	}
*/
	@RequestMapping("userdelete")
	public ModelAndView userdelete(HttpServletRequest req, HttpServletResponse response) {
		System.out.println(req.getParameter("userid"));
		ModelAndView mv=new ModelAndView();
	        ShoppingUser user=new ShoppingUser();
	        int err=1;
	        user.setUserId(Integer.parseInt( req.getParameter("userid")));
	        if(userService.deleteUser(user)!=0){
	        	int pageXX=1;
	    		String pageX = req.getParameter("pageNos");
	    		if(pageX!=null){
	    			 pageXX=Integer.parseInt(pageX);
	    		}
	    		User user1 = new User();
	    		int pageall = userPageService.allpage();
	    			mv.setViewName("/view/home");
	    			List<ShoppingUser> list = userPageService.selectuser(pageXX, pageOn);
	    			 mv.addObject("err",err);
	    			mv.addObject("recordCount", pageall);
	    			mv.addObject("pageNos", pageXX);
	    			mv.addObject("users", list);
	        	   return mv;
	        	
	        }
	    		else{
	    			err=0;
	    			 mv.setViewName("/view/home");
	    			 mv.addObject("err",err);
	    			 return mv;
	    		}
		             
	    		
	}
	@RequestMapping("inituser")
	public ModelAndView inituser(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		int pageXX=1;
		String pageX = request.getParameter("pageNos");
		if(pageX!=null){
			 pageXX=Integer.parseInt(pageX);
		}
		
		/*
		 * 分页分析 定义每页行数 pageoN 获取总行数 rowall 总页数 if(rowall/pageoN!=0){ pageall=
		 * rowall/pageoN+1; } 显示根据页数显示 如果是第二页 要显示的页数 x； x
		 * 
		 */
		    int pageall = userPageService.allpage();
			mv.setViewName("/view/home");
			List<ShoppingUser> list = userPageService.selectuser(pageXX, pageOn);
			mv.addObject("recordCount", pageall);
			mv.addObject("pageNos", pageXX);
			mv.addObject("users", list);

			return mv;
		
		
		
	}

}
