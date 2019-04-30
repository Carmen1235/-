package com.wqy.service;

import com.wqy.model.brand.WebBrandSyInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标使用Service
 */
@Service
public interface BrandSyService {

    //查询商标使用数据列表
    public Map listEX(WebBrandSyInfo webBrandSyInfo,int page ,int rows)throws ParseException;

    //更新商标使用数据
    public Results update(WebBrandSyInfo web) throws ParseException;
    //新增商标使用数据
    public Results add(WebBrandSyInfo web) throws ParseException;
    //删除商标使用数据
    public Results del(WebBrandSyInfo web);
    //查询商标使用数据
    public Results select(WebBrandSyInfo web);
}
