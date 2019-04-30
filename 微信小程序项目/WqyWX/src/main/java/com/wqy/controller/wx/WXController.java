package com.wqy.controller.wx;


import com.wqy.service.WXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.io.IOException;


/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/9/3 10:15
 * @Description: 微信公众号Controller
 */
@Controller
public class WXController {

    @Autowired
    private WXService wxService;

    /**
     *  更新 微信公众号数据
     * @throws IOException
     */
    // 每天2小时执行一次
    @Scheduled(cron = "0 0 */2 * * ?")
    public void updateAccessToken() throws IOException {
        wxService.update();
    }
}
