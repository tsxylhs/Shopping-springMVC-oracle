package com.lhs.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class InitController {

	@RequestMapping("init")
	public ModelAndView init(){
	              ModelAndView mv=new ModelAndView();
	              int err=0;
	              mv.addObject("err",err);
	              mv.setViewName("login");
	              
		return  mv ;
	}


}
