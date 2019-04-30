package com.wqy.service;

import com.wqy.model.brand.WebBrandSsInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标诉讼Service
 */
@Service
public interface BrandSsService {
    //查询商标诉讼数据列表
    public Map listEX(WebBrandSsInfo webBrandSsInfo,int page,int rows )throws ParseException;
    //更新商标诉讼数据
    public Results update(WebBrandSsInfo web) throws ParseException;
    //新增商标诉讼数据
    public Results add(WebBrandSsInfo web) throws ParseException;
    //删除商标诉讼数据
    public Results del(WebBrandSsInfo web);
    //查询商标诉讼数据
    public Results select(WebBrandSsInfo web);
}
