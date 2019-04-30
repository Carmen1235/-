package com.wqy.service;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.patent.WebPatentAcceptInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 专利转让Service
 */
@Service
public interface PatentAcceptService {
    //根据条件查询
    public Results select(String searchPantentName);
    //查询专利转让数据列表
    public Map list(EasyUIDataGrid easyUIgDataGrid);

    /**
     * 根据条件查询、显示数据list
     * @param webPatentAcceptInfo
     * @param page
     * @param rows
     * @return
     */
    Map listEX(WebPatentAcceptInfo webPatentAcceptInfo,int page,int rows);
    //更新专利转让数据
    public Results update(WebPatentAcceptInfo web) throws ParseException;
    //新增专利转让数据
    public Results add(WebPatentAcceptInfo web) throws ParseException;
    //删除专利转让数据
    public Results del(WebPatentAcceptInfo web);
}
