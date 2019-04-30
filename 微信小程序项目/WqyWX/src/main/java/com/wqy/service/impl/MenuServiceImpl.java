package com.wqy.service.impl;

import com.wqy.dao.mapper.UserMapper;
import com.wqy.entity.User;
import com.wqy.service.MenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 菜单ServiceImpl
 * @author
 */
@Service
public class MenuServiceImpl implements MenuService{
    @Resource
    private UserMapper userMapper;

    /**
     * 查询用户登陆的信息
     * @param id
     * @return
     */
    @Override
    public User getUserById(String id) {
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
