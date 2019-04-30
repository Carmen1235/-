package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.patent.WebPatentLawsuitInfo;
import com.wqy.pojo.patent.PatentLawsuitInfo;
import com.wqy.service.PatentLawsuitService;
import com.wqy.util.LimitElements;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 专利诉讼ServiceImpl
 */
@Service
public class PatentLawsuitServiceImpl implements PatentLawsuitService {
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
        List<WebPatentLawsuitInfo> lists = patentLawsuitMapper.selectByXX(searchPantentName);
        Results results = new Results();
        Map map = new HashMap();
        map.put("rows",lists);
        map.put("total",lists.size());
        results.setObj(map);
        return results;
    }

    /**
     * 查询专利诉讼数据列表
     * @param easyUIDataGrid
     * @return
     */

    @Override
    public Map list(EasyUIDataGrid easyUIDataGrid) {
        LimitElements limitElements = new LimitElements();
        limitElements.setStart(easyUIDataGrid);
        limitElements.setSize(easyUIDataGrid);

        List<PatentLawsuitInfo> rows = patentLawsuitMapper.list(limitElements);

        Long total = patentLawsuitMapper.count();

        Map map = new HashMap();
        map.put("total",total);
        map.put("rows",rows);
        return map;
    }

    /**
     * 根据条件查询、显示数据list
     * @param webPatentLawsuitInfo
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Map listEX(WebPatentLawsuitInfo webPatentLawsuitInfo, int page, int rows) {
        String str = webPatentLawsuitInfo.getHid_value_address();
        String[] strs = str.split(",");
        webPatentLawsuitInfo.setAdds(Arrays.asList(strs));
        PageHelper.startPage(page,rows);

        List<PatentLawsuitInfo> lists = patentLawsuitMapper.listEX(webPatentLawsuitInfo);

        PageInfo<PatentLawsuitInfo> pageInfo = new PageInfo<>(lists);

        Map map = new HashMap();
        map.put("rows",lists);
        map.put("total",pageInfo.getTotal());
        return map;
    }

    /**
     * 新增专利诉讼数据
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebPatentLawsuitInfo web) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//设置转换Date规则
        String id = "ss-"+ UUID.randomUUID();//获取ID
        String  pid = "p-"+UUID.randomUUID();//获取PID

        //新增专利库
        Patent p = new Patent();
        p.setId(pid);//设置id
        p.setTechnicalClassification(web.getTechnical_classification());//设置技术分类
        p.setPatentname(web.getPatentName());//设置专利名称
        if(!web.getImage().equals("")){
            p.setImage(web.getImage().substring(1,web.getImage().length()));//图示 去掉逗号
        }
        p.setPatentProduct(web.getPatent_product());//专利产品
        p.setApplyType(web.getApply_type());//申请类型
        p.setProtectedAreas(web.getProtected_areas());//设置保护地域
        p.setPatentType(web.getPatent_type());//设置专利类型
        if(!web.getApply_date().equals("")){
            p.setApplyDate(sdf.parse(web.getApply_date()));//设置申请日
        }
        p.setApplyName(web.getApply_name());//设置申请人

        if(!web.getAccredit_date().equals("")){
            p.setAccreditDate(sdf.parse(web.getAccredit_date()));//设置授权公告日
        }
        p.setPatentNumber(web.getPatent_number());//设置专利号


        //新增专利续展
        PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
        patentRenewalsNew.setId("xz-"+ UUID.randomUUID());//设置id
        patentRenewalsNew.setPid(pid);//设置pid

        //新增专利无效宣告
        PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
        patentInvalidDeclare.setId("wx"+UUID.randomUUID());//设置id
        patentInvalidDeclare.setPid(pid);//设置pid


        //新增专利转让
        PatentAccept patentAccept = new PatentAccept();
        patentAccept.setId("zr-"+UUID.randomUUID());//设置id
        patentAccept.setPid(pid);//设置pid


        //新增专利诉讼
        PatentLawsuit patentLawsuit = new PatentLawsuit();
        patentLawsuit.setId(id);//设置id
        patentLawsuit.setPid(pid);//设置pid
        patentLawsuit.setSuit(web.getSuit());//设置提诉讼公司/人
        patentLawsuit.setSolicitor(web.getSolicitor());//设置诉讼律师
        patentLawsuit.setLawyer(web.getLawyer());//设置应诉律师
        if(web.getProcess()!=null){
            patentLawsuit.setProcess(web.getProcess().substring(1,web.getProcess().length()));//设置诉讼过程
        }
        if(web.getProcess()!=null){
            patentLawsuit.setResults(web.getResults().substring(1,web.getResults().length()));//设置诉讼结果
        }
        patentLawsuit.setOther(web.getOther());//设置备注

        //进行新增操作
        patentMapper.insertSelective(p);
        patentRenewalsNewMapper.insertSelective(patentRenewalsNew);
        patentInvalidDeclareMapper.insertSelective(patentInvalidDeclare);
        patentAcceptMapper.insertSelective(patentAccept);
        int i =patentLawsuitMapper.insertSelective(patentLawsuit);

        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增"+i+"条数据");
        return results;
    }

    /**
     * 删除专利诉讼数据
     * @param web
     * @return
     */
    @Override
    public Results del(WebPatentLawsuitInfo web) {
        //删除专利库 进行关联删除其他表对应数据
        int i= patentMapper.deleteByPrimaryKey(web.getPid());

        Results results = new Results();
        results.setMsg("删除了"+i+"条数据");
        return  results;
    }

    @Override
    public Results update(WebPatentLawsuitInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置专利库
        Patent patent = new Patent();
        patent.setId(web.getPid());//设置id
        patent.setTechnicalClassification(web.getTechnical_classification());//设置技术分类
        patent.setPatentname(web.getPatentName());//设置技术名称
        patent.setImage(web.getImage());//设置图示
        patent.setPatentProduct(web.getPatent_product());//专利产品
        patent.setApplyType(web.getApply_type());//申请类型
        patent.setProtectedAreas(web.getProtected_areas());//设置保护地域
        patent.setPatentType(web.getPatent_type());//设置专利类型
        if(!web.getApply_date().equals("")){
            patent.setApplyDate(sdf.parse(web.getApply_date()));//设置申请日
        }
        patent.setApplyName(web.getApply_name());//设置申请人

        if(!web.getAccredit_date().equals("")){
            patent.setAccreditDate(sdf.parse(web.getAccredit_date()));//设置授权公告日
        }
        patent.setPatentNumber(web.getPatent_number());//设置专利号



        //设置专利诉讼
        PatentLawsuit patentLawsuit = new PatentLawsuit();
        patentLawsuit.setId(web.getId());//设置id
        patentLawsuit.setPid(web.getPid());//设置pid
        patentLawsuit.setSuit(web.getSuit());//设置提诉讼公司/人
        patentLawsuit.setSolicitor(web.getSolicitor());//设置诉讼律师
        patentLawsuit.setLawyer(web.getLawyer());//设置应诉律师
        if(web.getProcess()!=null){
            patentLawsuit.setProcess(web.getProcess().substring(1,web.getProcess().length()));//设置诉讼过程
        }
        if(web.getResults()!=null){
            patentLawsuit.setResults(web.getResults().substring(1,web.getResults().length()));//设置诉讼结果
        }
        patentLawsuit.setOther(web.getOther());//设置备注

        //更新专利库
        int i = patentMapper.updateByPrimaryKeySelective(patent);
        //更新专利无效宣言库
        int j = patentLawsuitMapper.updateByPrimaryKeySelective(patentLawsuit);
        //设置发送给页面数据结果
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了"+i+"条数据");
        return results;
    }
}
