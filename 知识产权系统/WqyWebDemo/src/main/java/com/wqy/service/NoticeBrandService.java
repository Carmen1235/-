package com.wqy.service;

import com.wqy.model.notice.WebNoticeBrandInfo;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标提醒Service
 */
@Service
public interface NoticeBrandService {

    //查询商标提醒数据列表
    public Map listEX(WebNoticeBrandInfo webNoticeBrandInfo,int page,int rows)throws ParseException;
    //更新商标提醒数据
    public Results update(WebNoticeBrandInfo web) throws ParseException;
}
