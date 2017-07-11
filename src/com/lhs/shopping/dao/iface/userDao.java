package com.lhs.shopping.dao.iface;

import java.util.List;
import java.util.Map;


import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.users;

public interface userDao {
	   public List<Map<String, Object>> queryAll();
       public int insertuser(users user);
       public users   checkUserNameAndPassword(users user);  
       public int allpage();
       public  List<ShoppingUser> selectuser(int pageX,int pageoN);
       public int deleteUser(ShoppingUser user);
       }
