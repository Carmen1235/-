package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.patent.WebPatentAcceptInfo;
import com.wqy.pojo.patent.PatentAcceptInfo;
import com.wqy.service.PatentAcceptService;
import com.wqy.util.LimitElements;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 专利转让ServiceImpl
 */
@Service
public class PatentAcceptServiceImpl implements PatentAcceptService {

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
     * 根据条件查询
     * @param searchPantentName
     * @return
     */
    @Override
    public Results select(String searchPantentName) {
        List<WebPatentAcceptInfo> lists = patentAcceptMapper.selectByXX(searchPantentName);
        Results results = new Results();
        Map map = new HashMap();
        map.put("rows",lists);
        map.put("total",lists.size());
        results.setObj(map);
        return results;
    }
    /**
     * 查询专利转让数据列表
     * @param easyUIDataGrid
     * @return
     */
    @Override
    public Map list(EasyUIDataGrid easyUIDataGrid) {
        LimitElements limitElements = new LimitElements();
        limitElements.setStart(easyUIDataGrid);
        limitElements.setSize(easyUIDataGrid);

        List<PatentAcceptInfo> rows = patentAcceptMapper.list(limitElements);

        Long total = patentAcceptMapper.count();

        Map map = new HashMap();
        map.put("total",total);
        map.put("rows",rows);
        return map;
    }

    /**
     * 根据条件查询、显示数据list
     * @param webPatentAcceptInfo
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Map listEX(WebPatentAcceptInfo webPatentAcceptInfo, int page, int rows) {

        String str = webPatentAcceptInfo.getHid_value_address();
        String[] strs = str.split(",");
        webPatentAcceptInfo.setAdds(Arrays.asList(strs));

        PageHelper.startPage(page,rows);

        List<PatentAcceptInfo> lists = patentAcceptMapper.listEX(webPatentAcceptInfo);

        PageInfo<PatentAcceptInfo> pageInfo = new PageInfo<>(lists);

        Map map = new HashMap();
        map.put("rows",lists);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    /**
     * 更新专利转让数据
     * @param web
     * @return
     */
    @Override
    public Results update(WebPatentAcceptInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置专利库
        Patent patent = new Patent();
        patent.setId(web.getPid());//设置id
        patent.setTechnicalClassification(web.getTechnical_classification());//设置技术分类
        patent.setPatentname(web.getPatentName());//设置技术名称
        patent.setImage(web.getImage());//设置图示
        patent.setProtectedAreas(web.getProtected_areas());//设置保护地域
        patent.setPatentType(web.getPatent_type());//设置专利类型
        if(!web.getApply_date().equals("")){
            patent.setApplyDate(sdf.parse(web.getApply_date()));//设置申请日
        }
        patent.setApplyName(web.getApply_name());//设置申请人
        patent.setApplyNumber(web.getApply_number());//设置申请号
        if(!web.getAccredit_date().equals("")){
            patent.setAccreditDate(sdf.parse(web.getAccredit_date()));//设置授权公告日
        }
        patent.setPatentNumber(web.getPatent_number());//设置专利号
        patent.setEgency(web.getEgency());//设置代理机构


        //设置专利转让库
        PatentAccept patentAccept = new PatentAccept();
        patentAccept.setId(web.getId());//设置id
        patentAccept.setPid(web.getPid());//设置pid
        patentAccept.setAssignNumber(web.getAssign_number());//设置转让合同编号
        patentAccept.setAssignName(web.getAssign_name());//设置转让方
        patentAccept.setAcceptName(web.getAccept_name());//设置受让方
        if(!web.getAccept_date().equals("")){
            patentAccept.setAcceptDate(sdf.parse(web.getAccept_date()));//设置转让申请日
        }
        if(!web.getAccept_finish_date().equals("")){
            patentAccept.setAcceptFinishDate(sdf.parse(web.getAccept_finish_date()));//设置转让完成日
        }
        patentAccept.setOther(web.getOther());//设置备注

        //更新专利库
        int i = patentMapper.updateByPrimaryKeySelective(patent);
        //更新专利转让库
        int j = patentAcceptMapper.updateByPrimaryKeySelective(patentAccept);
        //设置发送给页面数据结果
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了"+i+"条数据");
        return results;
    }

    /**
     * 新增专利转让数据
     * @param web
     * @return
     */
    @Override
    public Results add(WebPatentAcceptInfo web) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//设置转换Date规则
        String id = "zr-"+UUID.randomUUID();//获取ID
        String  pid = "p-"+UUID.randomUUID();//获取PID

        //新增专利库
        Patent p = new Patent();
        p.setId(pid);//设置id
        p.setTechnicalClassification(web.getTechnical_classification());//设置技术分类
        p.setPatentname(web.getPatentName());//设置专利名称
        p.setImage(web.getImage());//设置图示
        p.setProtectedAreas(web.getProtected_areas());//设置保护地域
        p.setPatentType(web.getPatent_type());//设置专利类型
        if(!web.getApply_date().equals("")){
            p.setApplyDate(sdf.parse(web.getApply_date()));//设置申请日
        }
        p.setApplyName(web.getApply_name());//设置申请人
        p.setApplyNumber(web.getApply_number());//设置申请号
        if(!web.getAccredit_date().equals("")){
            p.setAccreditDate(sdf.parse(web.getAccredit_date()));//设置授权公告日
        }
        p.setPatentNumber(web.getPatent_number());//设置专利号
        p.setEgency(web.getEgency());//设置代理机构

        //新增专利续展
        PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
        patentRenewalsNew.setId("xz-"+ UUID.randomUUID());//设置id
        patentRenewalsNew.setPid(pid);//设置pid

        //新增专利无效宣告
        PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
        patentInvalidDeclare.setId("wx-"+UUID.randomUUID());//设置id
        patentInvalidDeclare.setPid(pid);//设置pid

        //新增专利转让
        PatentAccept patentAccept = new PatentAccept();
        patentAccept.setId(id);//设置id
        patentAccept.setPid(pid);//设置pid
        patentAccept.setAssignNumber(web.getAssign_number());//设置转让合同编号
        patentAccept.setAssignName(web.getAssign_name());//设置转让方
        patentAccept.setAcceptName(web.getAccept_name());//设置受让方
        if(!web.getAccept_date().equals("")){
            patentAccept.setAcceptDate(sdf.parse(web.getAccept_date()));//设置转让申请日
        }
        if(!web.getAccept_finish_date().equals("")){
            patentAccept.setAcceptFinishDate(sdf.parse(web.getAccept_finish_date()));//设置转让完成日
        }
        patentAccept.setOther(web.getOther());//设置备注

        //新增专利诉讼
        PatentLawsuit patentLawsuit = new PatentLawsuit();
        patentLawsuit.setId("ss-"+UUID.randomUUID());//设置id
        patentLawsuit.setPid(pid);//设置pid

        //进行新增操作
        patentMapper.insertSelective(p);
        patentRenewalsNewMapper.insertSelective(patentRenewalsNew);
        patentInvalidDeclareMapper.insertSelective(patentInvalidDeclare);
        int i = patentAcceptMapper.insertSelective(patentAccept);
        patentLawsuitMapper.insertSelective(patentLawsuit);

        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增"+i+"条数据");
        return results;
    }

    /**
     * 删除专利转让数据
     * @param web
     * @return
     */
    @Override
    public Results del(WebPatentAcceptInfo web) {
        //操作删除专利转让数据 通过pid进行关联删除
        int i = patentMapper.deleteByPrimaryKey(web.getPid());
        //设置发送给页面的数据
        Results results =  new Results();
        results.setMsg("删除"+i+"条数据");
        results.setResult(true);
        return results;
    }
}
