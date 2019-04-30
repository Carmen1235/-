package com.wqy.service;

import com.wqy.model.brand.WebBrandJcInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标监测
 */
@Controller
public interface BrandJcService {


    //查询商标监测数据列表
    public Map listEX(WebBrandJcInfo webBrandJcInfo,int page,int rows)throws ParseException;

    //更新商标监测数据
    public Results update(WebBrandJcInfo web) throws ParseException;
    //新增商标监测数据s
    public Results add(WebBrandJcInfo web) throws ParseException;
    //删除商标监测数据
    public Results del(WebBrandJcInfo web);

}
