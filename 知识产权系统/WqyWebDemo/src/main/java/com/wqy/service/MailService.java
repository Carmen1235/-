package com.wqy.service;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.WebMailInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * @author WordK 王秋叶
 * @create 2018-07-04 15:22
 * @desc 邮件Service
 **/
@Service
public interface MailService {
    //查询邮箱数据列表
    public Map list(EasyUIDataGrid easyUIgDataGrid);
    //更新邮箱数据
    public Results update(WebMailInfo web) throws ParseException;
}
