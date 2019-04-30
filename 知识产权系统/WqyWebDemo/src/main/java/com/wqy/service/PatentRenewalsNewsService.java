package com.wqy.service;

import com.wqy.model.patent.WebPatentRenewalsNewInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 专利续展Service
 */
@Service
public interface PatentRenewalsNewsService {
    /**
     * 根据查询条件查询数据/显示数据列表
     * @param webPatentRenewalsNewInfo
     * @param page
     * @param rows
     * @return
     */
    public Map listEX(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo,int page,int rows);

    //更新专利续展数据
    public Results update(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) throws ParseException;

    //新增专利续展数据
    public Results add(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) throws ParseException;

    //删除专利续展数据
    public Results del(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo);
}
