package com.wqy.service;

import com.wqy.util.Results;
import org.springframework.stereotype.Service;

/**
 * 用户登陆注册Service
 */
@Service("userService")
public interface UserService {
    public Results userLogin(String name,String password);//用户登陆
    public Results userReg(String name,String password);//用户注册
}
