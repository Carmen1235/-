package com.wqy.service;

import com.wqy.model.brand.WebBrandYyInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标异议Service
 */
@Service
public interface BrandYyService {

    //查询商标异议数据列表
    public Map listEX(WebBrandYyInfo webBrandYyInfo,int page,int rows) throws ParseException;
    //更新商标异议数据
    public Results update(WebBrandYyInfo web) throws ParseException;
    //新增商标异议数据
    public Results add(WebBrandYyInfo web) throws ParseException;
    //删除商标异议数据
    public Results del(WebBrandYyInfo web);
    //查询商标异议数据
    public Results select(WebBrandYyInfo web);
}
