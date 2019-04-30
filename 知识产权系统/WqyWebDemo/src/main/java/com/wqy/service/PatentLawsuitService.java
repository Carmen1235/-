package com.wqy.service;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.patent.WebPatentLawsuitInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 专利诉讼Service
 */
@Service
public interface PatentLawsuitService {
    //根据条件查询
    public Results select(String searchPantentName);
    //查询专利诉讼数据信息列表
    public Map list(EasyUIDataGrid easyUIgDataGrid);

    /**
     * 根据条件查询、显示数据list
     * @param webPatentLawsuitInfo
     * @param page
     * @param rows
     * @return
     */
    Map listEX(WebPatentLawsuitInfo webPatentLawsuitInfo,int page,int rows);

    //新增专利诉讼数据
    public Results add(WebPatentLawsuitInfo web) throws ParseException;
    //新增专利诉讼数据
    public Results del(WebPatentLawsuitInfo web);
    //更新专利诉讼数据
    public Results update(WebPatentLawsuitInfo web) throws ParseException;
}
