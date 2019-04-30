package com.wqy.service;


import com.wqy.entity.User;
import org.springframework.stereotype.Service;

/**
 * 测试Service
 */
@Service
public interface TestService {
    public User getUserById(Integer id);

    public User testLogin(String name,String password);
}
