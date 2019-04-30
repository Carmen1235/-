package com.wqy.service;

import com.wqy.util.Results;
import org.springframework.stereotype.Service;

/**
 * 用户登陆注册Service
 * @author
 */
@Service("userService")
public interface UserService {
    /**
     * 用户登陆
     * @param name
     * @param password
     * @return
     */
     Results userLogin(String name, String password);

    /**
     * 用户注册
     * @param name
     * @param password
     * @return
     */
    Results userReg(String name, String password);
}
