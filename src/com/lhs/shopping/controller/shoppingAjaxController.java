package com.lhs.shopping.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.entity.users;
import com.lhs.shopping.service.iface.userService;

@Controller
public class shoppingAjaxController {
	@Resource
	userService userService;

	@RequestMapping("shoppinglogin")
	public String shoppinglogin(HttpServletRequest req, HttpServletResponse resp) {
		users user = new users();
		PrintWriter out;
		try {
			out = resp.getWriter();

			HashMap<String, Object> map = new HashMap<String, Object>();
			String name = req.getParameter("username");
			String password = req.getParameter("userpassword");
			if ("".equals(name) && "".equals(password)) {
				map.put("message", "账号密码不可以为空");
				out.flush();
				out.close();
				return null;
			} else {
				user.setUsername(name);
				user.setUserpassword(password);
				System.out.println(user.toString());
				user=userService.checkuser(user);
				System.out.println(user);
               if(user!=null){
				resp.setCharacterEncoding("utf-8");
				map.put("message", "ajax返回数据！");
				map.put("result", "success");
		        map.put("user", user);
				String jsonString = JSONObject.toJSONString(map);
				out.print(jsonString);
				out.flush();
				out.close();
				return null;
			}
               else{
            	   map.put("message", "账号或密码错误");
   				out.flush();
   				out.close();
   				return null;
               }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
