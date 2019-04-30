package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.BrandJcMapper;
import com.wqy.entity.BrandJc;
import com.wqy.entity.BrandJcExample;
import com.wqy.model.brand.WebBrandJcInfo;
import com.wqy.pojo.brand.BrandJcInfo;
import com.wqy.service.BrandJcService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 商标监测
 */
@Controller
public class BrandJcServiceImpl implements BrandJcService {
    /**商标监测Dao*/
    @Autowired
    private BrandJcMapper brandJcMapper;

    /**
     * 查询商标监测数据列表
     *
     * @param
     * @return
     */
    @Override
    public Map listEX(WebBrandJcInfo webBrandJcInfo, int page, int rows) throws ParseException {
        String str = webBrandJcInfo.getHid_value_address();
        String[] strs = str.split(",");
        webBrandJcInfo.setAdds(Arrays.asList(strs));
        //设置分页数据
        PageHelper.startPage(page, rows);

        BrandJcExample example = new BrandJcExample();
        BrandJcExample.Criteria criteria = example.createCriteria();
        /*设置排序*/
        example.setOrderByClause(webBrandJcInfo.getSort() + " " + webBrandJcInfo.getOrder());
        /*设置查询条件*/
        //申请号
        if (!webBrandJcInfo.getApplyNumber().isEmpty()) {
            criteria.andApplyNumberEqualTo(webBrandJcInfo.getApplyNumber());
        }
        //类别
        if (!webBrandJcInfo.getSbType().isEmpty()) {
            criteria.andSbTypeEqualTo(webBrandJcInfo.getSbType());
        }
        //申请日
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        if (!webBrandJcInfo.getApply_date_start().isEmpty() && !webBrandJcInfo.getApply_date_end().isEmpty()) {
            criteria.andApplyDateBetween(sdf.parse(webBrandJcInfo.getApply_date_start()), sdf.parse(webBrandJcInfo.getApply_date_end()));
        }
        if (!webBrandJcInfo.getApply_date_start().isEmpty() && webBrandJcInfo.getApply_date_end().isEmpty()) {
            criteria.andApplyDateGreaterThanOrEqualTo(sdf.parse(webBrandJcInfo.getApply_date_start()));
        }
        if (webBrandJcInfo.getApply_date_start().isEmpty() && !webBrandJcInfo.getApply_date_end().isEmpty()) {
            criteria.andApplyDateLessThanOrEqualTo(sdf.parse(webBrandJcInfo.getApply_date_end()));
        }
        //获取数据 和 数据总数
        List<BrandJc> lists = brandJcMapper.selectByExample(example);
        PageInfo<BrandJc> pageInfo = new PageInfo(lists);
        Map map = new HashMap();

        map.put("total", pageInfo.getTotal());
        map.put("rows", lists);
        return map;
    }

    /**
     * 更新商标检测数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebBrandJcInfo web) throws ParseException {
        //设置日期规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标监测库
        BrandJc brandJc = new BrandJc();
        /*设置ID*/
        brandJc.setId(web.getId());
        /*设置疑似商标标样*/
        brandJc.setImage(Optional.ofNullable(web.getImage()).orElse(""));
        /*设置疑似商标申请号*/
        brandJc.setApplyNumber(Optional.ofNullable(web.getApplyNumber()).orElse(""));
        /*设置疑似商标申请人*/
        brandJc.setApplyName(Optional.ofNullable(web.getApplyName()).orElse(""));
        /*设置疑似商标类别*/
        brandJc.setSbType(Optional.ofNullable(web.getSbType()).orElse(""));
        /*设置疑似商标群组*/
        brandJc.setGroups(Optional.ofNullable(web.getGroups()).orElse(""));
        /*设置疑似商标申请日*/
        if (!web.getApplyDate().isEmpty()) {
            brandJc.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        /*设置疑似商标初审公告日*/
        if (!web.getStartDate().isEmpty()) {
            brandJc.setStartDate(sdf.parse(web.getStartDate()));
        }
        /*设置疑似商标异议截止日*/
        if (!web.getEndDate().isEmpty()) {
            brandJc.setEndDate(sdf.parse(web.getEndDate()));
        }
        /*监测确认结果*/
        brandJc.setResults(Optional.ofNullable(web.getResults()).orElse(""));

        //更新商标监测库
        int j = brandJcMapper.updateByPrimaryKeySelective(brandJc);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + j + "条数据");
        return results;
    }

    /**
     * 新增商标监测数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebBrandJcInfo web) throws ParseException {
        String id = "jc-" + UUID.randomUUID();
        //设置日期规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标监测库
        BrandJc brandJc = new BrandJc();
        /*设置ID*/
        brandJc.setId(id);
        /*设置疑似商标标样*/
        if(!Optional.ofNullable(web.getImage()).orElse("").isEmpty()){
            brandJc.setImage(web.getImage().substring(1,web.getImage().length()));
        }
        /*设置疑似商标申请号*/
        brandJc.setApplyNumber(Optional.ofNullable(web.getApplyNumber()).orElse(""));
        /*设置疑似商标申请人*/
        brandJc.setApplyName(Optional.ofNullable(web.getApplyName()).orElse(""));
        /*设置疑似商标类别*/
        brandJc.setSbType(Optional.ofNullable(web.getSbType()).orElse(""));
        /*设置疑似商标群组*/
        brandJc.setGroups(Optional.ofNullable(web.getGroups()).orElse(""));
        /*设置疑似商标申请日*/
        if (!web.getApplyDate().isEmpty()) {
            brandJc.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        /*设置疑似商标初审公告日*/
        if (!web.getStartDate().isEmpty()) {
            brandJc.setStartDate(sdf.parse(web.getStartDate()));
        }
        /*设置疑似商标异议截止日*/
        if (!web.getEndDate().isEmpty()) {
            brandJc.setEndDate(sdf.parse(web.getEndDate()));
        }
        /*监测确认结果*/
        brandJc.setResults(Optional.ofNullable(web.getResults()).orElse(""));

        //新增商标监测
        int i = brandJcMapper.insertSelective(brandJc);

        //设置返回前端数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增了" + i + "条数据");
        return results;
    }

    /**
     * 删除商标监测数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebBrandJcInfo web) {
        int i = brandJcMapper.deleteByPrimaryKey(web.getId());
        Results results = new Results();
        results.setMsg("删除了" + i + "条数据");
        results.setResult(true);
        return results;
    }


}
