package com.wqy.service;

import com.wqy.model.patent.WebPatentInvalidDeclareInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

/**
 * 专利无效宣告Service
 */
@Service
public interface PatentInvalidDeclareService {

    /**
     * 根据条件查询专利无效宣告数据/显示数据list
     * @param webPatentInvalidDeclareInfo
     * @param page
     * @param rows
     * @return
     */
    Map listEX(WebPatentInvalidDeclareInfo webPatentInvalidDeclareInfo,int page,int rows);

    //新增专利无效宣告数据
    public Results add(WebPatentInvalidDeclareInfo web) throws ParseException;
    //新增专利无效宣告数据
    public Results del(WebPatentInvalidDeclareInfo web);
    //更新专利无效宣告数据
    public Results update(WebPatentInvalidDeclareInfo web) throws ParseException;
    //导出专利无效宣告数据
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException;

}
