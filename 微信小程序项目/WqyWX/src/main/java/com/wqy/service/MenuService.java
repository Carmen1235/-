package com.wqy.service;

import com.wqy.entity.User;
import org.springframework.stereotype.Service;

/**
 * 菜单Service
 * @author wangqiuye
 */
@Service
public interface MenuService {
    /**
     * /查询登陆的用户信息
     * @param id
     * @return
     */
     User getUserById(String id);
}
