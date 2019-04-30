package com.wqy.service;

import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/9/3 10:36
 * @Description: 微信公众号Service
 */
@Service("wxService")
public interface WXService {

    /**
     *  更新 微信公众号数据
     * @throws IOException
     */
    void update() throws IOException;
}
