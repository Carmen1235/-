package com.wqy.service;

import com.wqy.model.brand.WebBrandCxInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标撤销Service
 */
@Service
public interface BrandCxService {


    //查询商标撤销数据列表
    Map listEX(WebBrandCxInfo webBrandCxInfo,int page ,int rows)throws ParseException;
    //更新商标撤销数据
    public Results update(WebBrandCxInfo web) throws ParseException;
    //新增商标撤销数据
    public Results add(WebBrandCxInfo web) throws ParseException;
    //删除商标撤销数据
    public Results del(WebBrandCxInfo web);
    //查询商标撤销数据
    public Results select(WebBrandCxInfo web);
}
