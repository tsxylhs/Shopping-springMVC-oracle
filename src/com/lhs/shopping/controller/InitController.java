package com.lhs.shopping.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lhs.shopping.entity.Goods;
import com.lhs.shopping.service.iface.shoppingGoodsservice;
import com.lhs.shopping.service.iface.shoppingUserService;
@Controller
public class InitController {
	@Resource
	shoppingUserService shoppingUserService;
	@Resource
	shoppingGoodsservice shoppingGoodsService;
	@RequestMapping("init")
	public ModelAndView init(){
	              ModelAndView mv=new ModelAndView();
	              int err=0;
	              mv.addObject("err",err);
	              mv.setViewName("/view/index");
	              
		return  mv ;
	}
	@RequestMapping("initlogin")
	public ModelAndView initlogin(){
	              ModelAndView mv=new ModelAndView();
	              int err=0;
	              mv.addObject("err",err);
	              mv.setViewName("login");
	              
		return  mv ;
	}
	
	@RequestMapping("index")
	public String index(){
		return "/view/index";
	}
	@RequestMapping("vipmanager")
	public ModelAndView vipmanager( HttpServletRequest req){
	 
                                          	 
	      ModelAndView mv=new ModelAndView();
	     
		 
		 mv.setViewName("/view/vipmanager");
		 List<Map<String, Object>> list = shoppingUserService.queryAll();
			mv.addObject("shoppingusers", list);
		return mv;
	}
	@RequestMapping("addgoods")
	public ModelAndView addgoods(HttpServletRequest req){
	 String name=req.getParameter("name");
		System.out.println(name);
		ModelAndView mv=new ModelAndView();
		mv.addObject("name",name);
		 mv.setViewName("/view/addgoods");
		 return mv;
		 
	}
	@RequestMapping("goodslist")
	public ModelAndView goodslist(HttpServletRequest req){
		String name=req.getParameter("name");
		  ModelAndView mv=new ModelAndView();
		 List<Map<String, Object>> list=shoppingGoodsService.queryAll();
		 mv.setViewName("view/goodsList");
			mv.addObject("name",name);
		 mv.addObject("shoppinggoods", list);
		return mv;
		
		
	}
	@RequestMapping("removesession")
	public String removesesion(HttpServletRequest req){
		req.getSession().removeAttribute("role");
		req.getSession().removeAttribute("user");
		return "/view/index";
	}


}
