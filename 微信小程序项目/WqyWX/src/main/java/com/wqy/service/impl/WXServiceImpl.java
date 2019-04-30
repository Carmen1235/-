package com.wqy.service.impl;

import com.wqy.dao.mapper.WxinfoMapper;
import com.wqy.dao.mapper.WxuserMapper;
import com.wqy.entity.Wxinfo;
import com.wqy.entity.WxinfoExample;
import com.wqy.service.WXService;
import com.wqy.util.WeiXinUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/9/3 10:37
 * @Description: 微信公众号ServiceImpl
 */

@Service
public class WXServiceImpl implements WXService {
    /**
     * 注入 微信公众号信息Dao
     */
    @Autowired
    private WxinfoMapper wxinfoMapper;



    /**
     *  更新 微信公众号数据
     * @throws IOException
     */
    @Override
    public void update() throws IOException {
        List<Wxinfo> wxinfos = wxinfoMapper.selectByExample(new WxinfoExample());
        Wxinfo wxinfo = wxinfos.get(0);
        WeiXinUtil weiXinUtil = new WeiXinUtil(wxinfo.gettAppid(),wxinfo.gettAppsecret());
        String accessToken = weiXinUtil.getAccessToken(weiXinUtil);

        wxinfo.settAccessToken(accessToken);
        wxinfoMapper.updateByExampleSelective(wxinfo,new WxinfoExample());

        System.out.println("更新微信公众号信息...");
    }
}
