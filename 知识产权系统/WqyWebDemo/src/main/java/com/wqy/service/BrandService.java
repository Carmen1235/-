package com.wqy.service;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.brand.WebBrandInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

/**
 * 商标Service
 *
 * @author wangqiuye
 */
@Service
public interface BrandService {

    /**
     * 查询商标库数据
     */
    public Map list(WebBrandInfo webBrandInfo, EasyUIDataGrid dataGrid);

    /**
     * 新增商标数据
     */
    public Results add(WebBrandInfo web) throws ParseException;

    /**
     * 更新商标数据
     */
    public Results update(WebBrandInfo web) throws ParseException;

    /**
     * 删除商标数据
     */
    public Results del(WebBrandInfo web);

    /**
     * 导出商标库数据 2003
     */
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException;

    /**
     * 导出商标库数据 2007
     */
    public void exportEX(HttpServletRequest request, HttpServletResponse response) throws IOException;

    /**
     * 导入商标库数据 2003
     */
    public void importExcel(InputStream is, String fileName, HttpServletRequest request) throws IOException;

    /**
     * 导入商标库数据 2007
     */
    public void importExcelEX(InputStream is, String fileName, HttpServletRequest request) throws IOException;


}
