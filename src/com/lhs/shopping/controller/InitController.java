package com.lhs.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class InitController {

	@RequestMapping("init")
	public String init(){
		System.out.println("123123213");
		return "login";
	}


}
