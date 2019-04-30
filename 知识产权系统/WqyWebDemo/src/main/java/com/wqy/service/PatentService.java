package com.wqy.service;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.patent.WebPatentInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

/**
 * 专利Service
 */
@Service
public interface PatentService {
    //根据条件查询
    public Results select(String zlSearchPantentName);


    /**
     * 根据条件查询数据/显示数据列表list
     * @param webPatentInfo
     * @param page
     * @param rows
     * @return
     */
    public Map listEX(WebPatentInfo webPatentInfo,int page,int rows,String sort,String order);

    //查询专利库数据
    public Map list(EasyUIDataGrid easyUIgDataGrid, String zlSearchPantentName);
    //导出专利库数据 2003
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException;
    //导出专利库数据 2007
    public void exportEX(HttpServletRequest request, HttpServletResponse response) throws IOException;
    //导入专利库数据 2003
    public void importExcel(InputStream is,String fileName,HttpServletRequest request) throws IOException;
    //导入专利库数据 2007
    public void importExcelEX(InputStream is,String fileName,HttpServletRequest request) throws IOException;
    //更新专利库数据
    public Results update(WebPatentInfo web) throws ParseException;

    //新增专利库数据
    public Results add(WebPatentInfo web) throws ParseException;

    //删除专利库数据
    public Results del(WebPatentInfo web);
}
