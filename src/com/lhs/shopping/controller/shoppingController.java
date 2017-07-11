package com.lhs.shopping.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.service.iface.shoppingUserService;
@Controller
public class shoppingController {
	@Resource
	shoppingUserService shoppingUserService;
	@RequestMapping("addShoppingUser")
	public ModelAndView addShoppingUser(HttpServletRequest req,HttpServletResponse  resp, ShoppingUser shoppinguser){
		   System.out.println(shoppinguser.toString());
		   ModelAndView mv = new  ModelAndView();
		  int i= shoppingUserService.addShoppingUser(shoppinguser);
		  mv.setViewName("/view/index");
		return mv; 
		
	}

	@RequestMapping("deleteshoppingUser")
	public ModelAndView deleteShoppingUser(HttpServletRequest req,HttpServletResponse  resp ){
	String id=	req.getParameter("userid");
	int userid = 0;
	if(id!=null){
		 userid=Integer.parseInt(id);
	}
	System.out.println(userid);
	shoppingUserService.deleteShoppingUser(userid);
	ModelAndView mv = new  ModelAndView();
	 mv.setViewName("/view/index");
		return mv; 
	
	}
}         
