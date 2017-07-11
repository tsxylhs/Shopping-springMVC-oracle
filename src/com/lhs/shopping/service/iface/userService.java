package com.lhs.shopping.service.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.ShoppingUser;
import com.lhs.shopping.entity.User;
import com.lhs.shopping.entity.users;

public interface userService {
    public int insertuser(users user);
    public users checkuser(users user);
    public List<Map<String, Object>> queryAll();
    public int deleteUser(ShoppingUser user);
}
