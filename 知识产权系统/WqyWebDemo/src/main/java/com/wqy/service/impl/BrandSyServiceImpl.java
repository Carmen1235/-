package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.brand.WebBrandSyInfo;
import com.wqy.pojo.brand.BrandSyInfo;
import com.wqy.service.BrandSyService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 商标使用Sercie
 */
@Service
public class BrandSyServiceImpl implements BrandSyService {
    @Autowired
    private BrandMapper brandMapper;//商标库Dao
    @Autowired
    private BrandYyMapper brandYyMapper;//商标异议Dao
    @Autowired
    private BrandCxMapper brandCxMapper;//商标撤销Dao
    @Autowired
    private BrandSsMapper brandSsMapper;//商标诉讼Dao
    @Autowired
    private BrandJcMapper brandJcMapper;//商标监测Dao
    @Autowired
    private BrandSyMapper brandSyMapper;//商标使用Dao
    @Autowired
    private BrandZrMapper brandZrMapper;//商标转让Dao
    @Autowired
    private BrandXkMapper brandXkMapper;//商标许可Dao
    @Autowired
    private BrandNoticeMapper brandNoticeMapper;//商标提醒事项Dao

    /**
     * 查询商标使用数据列表
     *
     * @param
     * @return
     */
    @Override
    public Map listEX(WebBrandSyInfo webBrandSyInfo, int page , int rows)throws ParseException{
        String str = webBrandSyInfo.getHid_value_address();
        String[] strs = str.split(",");
        webBrandSyInfo.setAdds(Arrays.asList(strs));

        PageHelper.startPage(page,rows);

        List<BrandSyInfo> lists = brandSyMapper.listEX(webBrandSyInfo);

        PageInfo<BrandSyInfo> pageInfo = new PageInfo(lists);

        Map map = new HashMap();
        map.put("total", pageInfo.getTotal());
        map.put("rows", lists);
        return map;
    }

    /**
     * 更新商标使用数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebBrandSyInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        brand.setId(web.getPid());//设置id
        brand.setBrandStyle(web.getBrandStyle());//商标标样
        brand.setBrandName(web.getBrandName());//商标名称
        brand.setApplyNumber(web.getApplyNumber());//商标申请号
        brand.setApplyName(web.getApplyName());//商标申请人
        brand.setCategory(web.getCategory());//商标类别
        brand.setGroups(web.getGroups());//群组
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));//申请日
        }
        if (!web.getAuthorization().isEmpty()) {
            brand.setAuthorization(sdf.parse(web.getAuthorization()));//商标授权日
        }

        //设置商标使用库
        BrandSy brandSy = new BrandSy();
        brandSy.setId(web.getId());//设置id
        brandSy.setPid(web.getPid());//设置pid
        brandSy.setSbsydw(web.getSbsydw());
        brandSy.setSpjfw(web.getSpjfw());
        if (!web.getUse_start_date().isEmpty()) {
            brandSy.setUseStartDate(sdf.parse(web.getUse_start_date()));
        }
        brandSy.setSyzj(web.getSyzj());
        //更新商标库
        int i = brandMapper.updateByPrimaryKeySelective(brand);
        //更新商标诉讼库
        int j = brandSyMapper.updateByPrimaryKeySelective(brandSy);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;
    }
    /**
     * 新增商标使用数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebBrandSyInfo web) throws ParseException {
        String id = "sy-" + UUID.randomUUID();
        String pid = "b-" + UUID.randomUUID();
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        brand.setId(pid);//设置ID
        if (!web.getBrandStyle().isEmpty()) {
            brand.setBrandStyle(web.getBrandStyle().substring(1, web.getBrandStyle().length()));//设置商标标样
        }
        brand.setBrandName(web.getBrandName());//商标名称
        brand.setApplyNumber(web.getApplyNumber());//商标申请号
        brand.setApplyName(web.getApplyName());//商标申请人
        brand.setCategory(web.getSort());//商标类别
        brand.setGroups(web.getGroups());//群组
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));//申请日
        }
        if (!web.getAuthorization().isEmpty()) {
            brand.setAuthorization(sdf.parse(web.getAuthorization()));//商标授权日
        }

        //设置商标异议
        BrandYy brandYy = new BrandYy();
        brandYy.setId("yy-" + UUID.randomUUID());
        brandYy.setPid(pid);

        //设置商标撤销库
        BrandCx brandCx = new BrandCx();
        brandCx.setId("cx-" + UUID.randomUUID());//设置ID
        brandCx.setPid(pid);//设置PID

        //设置商标诉讼库
        BrandSs brandSs = new BrandSs();
        brandSs.setId("ss-"+UUID.randomUUID());//设置id
        brandSs.setPid(pid);//设置pid


        //设置商标使用
        BrandSy brandSy = new BrandSy();
        brandSy.setId(id);//设置id
        brandSy.setPid(pid);//设置pid
        brandSy.setSbsydw(web.getSbsydw());
        brandSy.setSpjfw(web.getSpjfw());
        if (!web.getUse_start_date().isEmpty()) {
            brandSy.setUseStartDate(sdf.parse(web.getUse_start_date()));
        }
        if(!web.getSyzj().isEmpty()){
            brandSy.setSyzj(web.getSyzj().substring(1,web.getSyzj().length()));
        }


        //设置商标转让
        BrandZr brandZr = new BrandZr();
        brandZr.setId("zr" + UUID.randomUUID());//设置id
        brandZr.setPid(pid);//设置pid

        //设置商标许可
        BrandXk brandXk = new BrandXk();
        brandXk.setId("xk-" + UUID.randomUUID());//设置id
        brandXk.setPid(pid);//设置pid

        //设置商标提醒事项
        BrandNotice brandNotice = new BrandNotice();
        brandNotice.setId("notice-" + UUID.randomUUID());//设置id
        brandNotice.setPid(pid);//设置pid
        brandNotice.setEnables("关闭");

        //新增商标库
        int i = brandMapper.insertSelective(brand);
        //新增商标异议
        brandYyMapper.insert(brandYy);
        //新增商标撤销
        brandCxMapper.insertSelective(brandCx);
        //新增商标诉讼
        brandSsMapper.insertSelective(brandSs);
        //新增商标使用
        brandSyMapper.insertSelective(brandSy);
        //新增商标转让
        brandZrMapper.insertSelective(brandZr);
        //新增商标许可
        brandXkMapper.insertSelective(brandXk);
        //新增商标提醒事项
        brandNoticeMapper.insertSelective(brandNotice);

        //设置返回前端数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增了" + i + "条数据");
        return results;
    }
    /**
     * 删除商标诉讼数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebBrandSyInfo web) {
        int i = brandMapper.deleteByPrimaryKey(web.getPid());
        Results results = new Results();
        results.setMsg("删除了" + i + "条数据");
        return results;
    }

    @Override
    public Results select(WebBrandSyInfo web) {
        return null;
    }


}
