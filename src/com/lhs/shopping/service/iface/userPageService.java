package com.lhs.shopping.service.iface;

import java.util.List;


import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.User;

public interface userPageService {
           public int allpage();
           public  List<ShoppingUser> selectuser(int pageX,int pageoN);
}
