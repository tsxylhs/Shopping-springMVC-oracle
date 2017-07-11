package com.lhs.shopping.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lhs.shopping.entity.Goods;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.service.iface.shoppingGoodsservice;
@Controller
public class shoppingGoodsController {
	@Resource
	shoppingGoodsservice shoppingGoodsservice;
@RequestMapping("addgoodsAdd")
public ModelAndView addgoods(HttpServletRequest req,HttpServletResponse resp, Goods goods){
	String go=req.getParameter("go");
	String name=req.getParameter("name");
	System.out.println(name);
	System.out.println(go);
	System.out.println(goods);
	User user=new User();
	user.setUsername(name);
	ModelAndView mv=new ModelAndView();
	
	if("发布并关闭窗口".equals(go)){
		mv.addObject("user",user);
		shoppingGoodsservice.insertGoods(goods);
		mv.setViewName("view/index");
		
		return mv;
		
	}
	else{
		mv.addObject("name",name);
		shoppingGoodsservice.insertGoods(goods);
		mv.setViewName("view/addgoods");
		return mv;
		
	}
	
	
	
}
@RequestMapping("deletegoods")
public ModelAndView deletegoods(HttpServletRequest req){
	int ids=0;
	   String id=req.getParameter("goodsId");
	   if("".equals(id)==false){
		ids=Integer.parseInt(id);
	   }
	   
	   shoppingGoodsservice.deletegoods(ids);
	   ModelAndView mv=new ModelAndView();
	   mv.setViewName("view/index");
	return mv;
	   
	
	
}
}
