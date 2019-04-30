package com.wqy.service;

import com.wqy.model.brand.WebBrandXkInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标许可Service
 */
@Service
public interface BrandXkService {
    //查询商标许可数据列表
    public Map listEX(WebBrandXkInfo webBrandXkInfo,int page,int rows )throws ParseException;

    //更新商标许可数据
    public Results update(WebBrandXkInfo web) throws ParseException;
    //新增商标许可数据
    public Results add(WebBrandXkInfo web) throws ParseException;
    //删除商标许可数据
    public Results del(WebBrandXkInfo web);
    //查询商标许可数据
    public Results select(WebBrandXkInfo web);
}
