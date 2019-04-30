package com.wqy.service.impl;

import com.wqy.dao.mapper.UserMapper;
import com.wqy.entity.User;
import com.wqy.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 测试ServiceImpl
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUserById(Integer id) {
        User user = userMapper.selectByPrimaryKey("80fb6032-be4d-41b0-b420-0d9cbc73ff45");

        return user;
    }

    @Override
    public User testLogin(String name, String password) {
        User user = userMapper.login(name);
        return user;
    }


}
