package com.lhs.shopping.dao.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.User;

public interface userDao {
	   public List<Map<String, Object>> queryAll();
       public int insertuser(User user);
       public User   checkUserNameAndPassword(User user);   public int allpage();
       public  List<User> selectuser(int pageX,int pageoN);
}
