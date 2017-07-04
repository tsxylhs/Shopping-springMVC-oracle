package com.lhs.shopping.service.iface;

import java.util.List;
import java.util.Map;

import com.lhs.shopping.entity.User;

public interface userService {
    public int insertuser(User user);
    public User checkuser(User user);
    public List<Map<String, Object>> queryAll();
    public int deleteUser(User user);
}
