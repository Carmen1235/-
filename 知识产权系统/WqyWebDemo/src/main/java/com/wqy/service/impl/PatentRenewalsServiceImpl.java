package com.wqy.service.impl;

import com.wqy.dao.mapper.PatentRenewalsMapper;
import com.wqy.entity.PatentRenewals;
import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.WebZLXZ;
import com.wqy.service.PatentRenewalsService;

import com.wqy.util.LimitElements;
import com.wqy.util.ParseEasyUIDate;
import com.wqy.util.Results;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * 专利续展老版本 未关联 父表
 */
@Service
public class PatentRenewalsServiceImpl implements PatentRenewalsService {
    @Resource
    private PatentRenewalsMapper patentRenewalsMapper;
    @Override
    public Map  selectList(EasyUIDataGrid easyUIDataGrid) {
//        int start = (easyUIgDataGrid.getPage()-1)*easyUIgDataGrid.getRows();//计算起始位 (p-1)*r
//        int end = easyUIgDataGrid.getPage()+easyUIgDataGrid.getRows()-1;//计算结束位 p+r-1
//        System.out.println("开始："+start+"结束:"+end);
        LimitElements limitElements = new LimitElements();

//        limitElements.setStart(start);
//        limitElements.setEnd(end);
        limitElements.setStart(easyUIDataGrid);
        limitElements.setEnd(easyUIDataGrid);
        List<PatentRenewals> lists= patentRenewalsMapper.selectList(limitElements);
        Long count = patentRenewalsMapper.selectCount(null);
        Map map = new HashMap();
        map.put("rows",lists);
        map.put("total",count);
        return map;
    }

    @Override
    public Results add(WebZLXZ webZLXZ) {
        Results results = new Results();
        PatentRenewals patentRenewals = new PatentRenewals();
        patentRenewals.setId(UUID.randomUUID().toString());
        patentRenewals.setTechnicalclf(webZLXZ.getJ1());
        patentRenewals.setPatentname(webZLXZ.getJ2());
        patentRenewals.setPatenttype(webZLXZ.getJ4());
        patentRenewals.setProtectedareas(webZLXZ.getJ5());
        patentRenewals.setApplytype(webZLXZ.getJ6());
        //申请日
        patentRenewals.setApplydate(ParseEasyUIDate.parse(webZLXZ.getJ7()));

        patentRenewals.setApplyname(webZLXZ.getJ8());
        patentRenewals.setApplynumber(webZLXZ.getJ9());
        String state = "";
        if(webZLXZ.getJ10()==1){
            state="授权";
        } else {
            state="";
        }
        patentRenewals.setState(state);
        //授权公告日
        patentRenewals.setAccreditdate(ParseEasyUIDate.parse(webZLXZ.getJ11()));

        patentRenewals.setPatentnumber(webZLXZ.getJ12());
        patentRenewals.setAgency(webZLXZ.getJ13());
        patentRenewals.setAnnualfee(webZLXZ.getJ14());
        int insert = patentRenewalsMapper.insert(patentRenewals);
        if(insert>0){
            results.setResult(true);
            results.setMsg("增加"+insert+"条数据！");
        }else{
            results.setResult(false);
            results.setMsg("增加数据出错！");
        }

        return results;
    }

    @Override
    public Results del(String ids) {
        Results results = new Results();
        int i = patentRenewalsMapper.deleteByPrimaryKey(ids);
        if(i>0){
            results.setMsg("删除"+i+"条数据成功！");
            results.setResult(true);
        }
        return results;
    }

    @Override
    public Results select(WebZLXZ webZLXZ) {
        PatentRenewals record = new PatentRenewals();
        record.setTechnicalclf(webZLXZ.getJ1());
        record.setPatentname(webZLXZ.getJ2());
        record.setPatenttype(webZLXZ.getJ4());
        record.setProtectedareas(webZLXZ.getJ5());
        record.setApplytype(webZLXZ.getJ6());
        //申请日期
        record.setApplydate(ParseEasyUIDate.parse(webZLXZ.getJ7()));

        record.setApplyname(webZLXZ.getJ8());
        record.setApplynumber(webZLXZ.getJ9());
        String state = "";
        if(webZLXZ.getJ10()==1){
            state="授权";
        }else{
            state="";
        }
        record.setState(state);
        //授权宣告日
        record.setAccreditdate(ParseEasyUIDate.parse(webZLXZ.getJ11()));

        record.setPatentnumber(webZLXZ.getJ12());
        record.setAgency(webZLXZ.getJ13());

        List<PatentRenewals> lists= patentRenewalsMapper.select(record);
        Results results = new Results();
        if(lists.size()>0){
            results.setMsg("查询到"+lists.size()+"条数据");
        }else{
            results.setMsg("查询不到数据");
        }
        results.setResult(true);
        Map map = new HashMap();
        map.put("total",lists.size());
        map.put("rows",lists);
        results.setObj(map);
        return results;
    }
}
