package com.wqy.service;

import com.wqy.model.brand.WebBrandZrInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标转让Service
 */
@Controller
public interface BrandZrService {

    //查询商标转让数据列表
    public Map listEX(WebBrandZrInfo webBrandZrInfo,int page,int rows)throws ParseException;
    //更新商标转让数据
    public Results update(WebBrandZrInfo web) throws ParseException;
    //新增商标转让数据
    public Results add(WebBrandZrInfo web) throws ParseException;
    //删除商标转让数据
    public Results del(WebBrandZrInfo web);
    //查询商标转让数据
    public Results select(WebBrandZrInfo web);
}
