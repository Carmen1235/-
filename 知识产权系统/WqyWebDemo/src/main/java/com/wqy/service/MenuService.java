package com.wqy.service;

import com.wqy.entity.User;
import org.springframework.stereotype.Service;

/**
 * 菜单Service
 */
@Service
public interface MenuService {
    //查询登陆的用户信息
    public User getUserById(String id);
}
