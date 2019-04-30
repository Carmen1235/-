package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.patent.WebPatentRenewalsNewInfo;
import com.wqy.pojo.patent.PatentRenewalsNewInfo;
import com.wqy.service.PatentRenewalsNewsService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 专利续展ServiceImppl
 */
@Service
public class PatentRenewalsNewServiceImpl implements PatentRenewalsNewsService {
    @Autowired
    private PatentRenewalsNewMapper patentRenewalsNewMapper;//专利续展
    @Autowired
    private PatentMapper patentMapper;//专利
    @Autowired
    private PatentInvalidDeclareMapper patentInvalidDeclareMapper;//专利无效宣告
    @Autowired
    private PatentAcceptMapper patentAcceptMapper;//专利转让
    @Autowired
    private PatentLawsuitMapper patentLawsuitMapper;//专利诉讼

    /**
     * 根据查询条件查询数据/显示数据列表
     * @param webPatentRenewalsNewInfo
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Map listEX(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo, int page, int rows) {
        String str = webPatentRenewalsNewInfo.getHid_value_address();
        String[] strs = str.split(",");
        webPatentRenewalsNewInfo.setAdds(Arrays.asList(strs));
        PageHelper.startPage(page,rows);

        List<PatentRenewalsNewInfo> lists = patentRenewalsNewMapper.listEX(webPatentRenewalsNewInfo);

        PageInfo<PatentRenewalsNewInfo> pageInfo = new PageInfo<>(lists);

        Map map = new HashMap();
        map.put("total",pageInfo.getTotal());
        map.put("rows",lists);
        return map;
    }

    /**
     *
     * 更新专利续展数据
     * @param webPatentRenewalsNewInfo
     * @return
     */
    @Override
    public Results update(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 1. 设置更新专利表
        Patent patent = new Patent();
        patent.setId(webPatentRenewalsNewInfo.getPid());//设置主键
        patent.setTechnicalClassification(webPatentRenewalsNewInfo.getTechnical_classification());//设置技术分类
        patent.setPatentname(webPatentRenewalsNewInfo.getPatentName());//设置专利名称
        patent.setImage(webPatentRenewalsNewInfo.getImage());//设置图示
        patent.setPatentType(webPatentRenewalsNewInfo.getPatent_type());//设置专利类型
        patent.setProtectedAreas(webPatentRenewalsNewInfo.getProtected_areas());//设置保护地域
        patent.setApplyType(webPatentRenewalsNewInfo.getApply_type());//设置申请类型
        patent.setApplyName(webPatentRenewalsNewInfo.getApply_name());//设置申请人
        patent.setApplyNumber(webPatentRenewalsNewInfo.getApply_number());//设置申请号
        if(!webPatentRenewalsNewInfo.getApply_date().equals("")){
            patent.setApplyDate(sdf.parse(webPatentRenewalsNewInfo.getApply_date()));//设置申请日
        }

        patent.setState(webPatentRenewalsNewInfo.getState());//设置法律状态
        if(!webPatentRenewalsNewInfo.getAccredit_date().equals("")){
            patent.setAccreditDate(sdf.parse(webPatentRenewalsNewInfo.getAccredit_date()));//设置授权公告日
        }
        patent.setPatentNumber(webPatentRenewalsNewInfo.getPatent_number());//设置专利号
        patent.setEgency(webPatentRenewalsNewInfo.getEgency());//设置代理机构

        // 2. 设置更新专利续展表
        PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
        patentRenewalsNew.setId(webPatentRenewalsNewInfo.getId());//设置主键
        patentRenewalsNew.setAnnualFee(webPatentRenewalsNewInfo.getAnnual_fee());//设置年费缴纳


        int i= patentMapper.updateByPrimaryKeySelective(patent);//按主键更新专利表，不为空的更新，未空不更新
        int j = patentRenewalsNewMapper.updateByPrimaryKeySelective(patentRenewalsNew);//根据主键更新专利续展表，不为空的更新，未空不更新

        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了"+i+"条数据");
        return results;
    }


    /**
     * 新增专利续展数据
     * @param webPatentRenewalsNewInfo
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String id = "xz-"+UUID.randomUUID();
        String pid = "p-"+UUID.randomUUID();

        // 1 新增专利数据
        Patent patent = new Patent();
        patent.setId(pid);//设置主键
        patent.setTechnicalClassification(webPatentRenewalsNewInfo.getTechnical_classification());//设置技术分类
        patent.setPatentname(webPatentRenewalsNewInfo.getPatentName());//设置专利名称
        patent.setImage(webPatentRenewalsNewInfo.getImage());//设置图示
        patent.setPatentType(webPatentRenewalsNewInfo.getPatent_type());//设置专利类型
        patent.setProtectedAreas(webPatentRenewalsNewInfo.getProtected_areas());//设置保护地域
        patent.setApplyType(webPatentRenewalsNewInfo.getApply_type());//设置申请类型
        patent.setApplyName(webPatentRenewalsNewInfo.getApply_name());//设置申请人
        patent.setApplyNumber(webPatentRenewalsNewInfo.getApply_number());//设置申请号

        if(!webPatentRenewalsNewInfo.getApply_date().equals("")){
            patent.setApplyDate(sdf.parse(webPatentRenewalsNewInfo.getApply_date()));//设置申请日
        }

        patent.setState(webPatentRenewalsNewInfo.getState());//设置法律状态

        if(!webPatentRenewalsNewInfo.getAccredit_date().equals("")){
            patent.setAccreditDate(sdf.parse(webPatentRenewalsNewInfo.getAccredit_date()));//设置授权公告日
        }

        patent.setPatentNumber(webPatentRenewalsNewInfo.getPatent_number());//设置专利号
        patent.setEgency(webPatentRenewalsNewInfo.getEgency());//设置代理机构

        // 2. 设置新增专利续展表
        PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
        patentRenewalsNew.setId(id);//设置主键
        patentRenewalsNew.setPid(pid);//设置主键
        patentRenewalsNew.setAnnualFee(webPatentRenewalsNewInfo.getAnnual_fee());//设置年费缴纳

        // 3.专利无效宣告
        PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
        patentInvalidDeclare.setId("wx-"+UUID.randomUUID());
        patentInvalidDeclare.setPid(pid);

        // 4.专利转让
        PatentAccept patentAccept = new PatentAccept();
        patentAccept.setId("zr-"+UUID.randomUUID());
        patentAccept.setPid(pid);

        // 5.专利诉讼
        PatentLawsuit patentLawsuit = new PatentLawsuit();
        patentLawsuit.setId("ss-"+UUID.randomUUID());
        patentLawsuit.setPid(pid);

        int i = patentMapper.insert(patent);//新增专利
        int j = patentRenewalsNewMapper.insert(patentRenewalsNew);//新增专利续展
        patentInvalidDeclareMapper.insert(patentInvalidDeclare);//新增专利无效宣告
        patentAcceptMapper.insert(patentAccept);//新增专利转让
        patentLawsuitMapper.insert(patentLawsuit);//新增专利诉讼

        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增了"+i+"条数据");
        return results;
    }

    /**
     * 删除专利续展数据
     * @param webPatentRenewalsNewInfo
     * @return
     */
    @Override
    public Results del(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) {
        int i = patentMapper.deleteByPrimaryKey(webPatentRenewalsNewInfo.getPid());
        Results results = new Results();
        results.setResult(true);
        results.setMsg("删除了"+i+"条数据");
        return results;
    }
}
