package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.brand.WebBrandCxInfo;
import com.wqy.pojo.brand.BrandCxInfo;
import com.wqy.service.BrandCxService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 商标撤销
 */
@Service
public class BrandCxServiceImpl implements BrandCxService {
    @Autowired
    private BrandMapper brandMapper;//商标库Dao
    @Autowired
    private BrandYyMapper brandYyMapper;//商标异议Dao
    @Autowired
    private BrandCxMapper brandCxMapper;//商标撤销Dao
    @Autowired
    private BrandSsMapper brandSsMapper;//商标诉讼Dao

    @Autowired
    private BrandSyMapper brandSyMapper;//商标使用Dao
    @Autowired
    private BrandZrMapper brandZrMapper;//商标转让Dao
    @Autowired
    private BrandXkMapper brandXkMapper;//商标许可Dao
    @Autowired
    private BrandNoticeMapper brandNoticeMapper;//商标提醒事项Dao




    /**
     * 查询商标撤销数据列表
     *
     * @param
     * @return
     */
    @Override
    public Map listEX(WebBrandCxInfo webBrandCxInfo,int page ,int rows)throws ParseException{
        String str = webBrandCxInfo.getHid_value_address();
        String[] strs = str.split(",");
        webBrandCxInfo.setAdds(Arrays.asList(strs));
        //设置分页
        PageHelper.startPage(page,rows);

        List<BrandCxInfo> lists = brandCxMapper.listEX(webBrandCxInfo);
        //获取总数据数
        PageInfo<BrandCxInfo> pageInfo = new PageInfo(lists);
        //打包发生给前台的数据
        Map map = new HashMap();
        map.put("total", pageInfo.getTotal());
        map.put("rows", lists);
        return map;
    }


    /**
     * 更新商标撤销数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebBrandCxInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        brand.setId(web.getPid());//设置ID
        if (!web.getBrandStyle().isEmpty()) {
            brand.setBrandStyle(web.getBrandStyle());//设置商标标样
        }
        brand.setBrandName(web.getBrandName());//设置商标名称
        brand.setApplyNumber(web.getApplyNumber());//设置商标申请号
        brand.setApplyName(web.getApplyName());//设置商标申请人
        brand.setCategory(web.getCategory());//设置商标类别
        brand.setGroups(web.getGroups());//设置群组
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));//设置申请日
        }
        if (!web.getCbsdggr().isEmpty()) {
            brand.setNoticeDate(sdf.parse(web.getCbsdggr()));//设置初审公告日
        }
        if (!web.getAuthorization().isEmpty()) {
            brand.setAuthorization(sdf.parse(web.getAuthorization()));//设置商标授权日
        }

        //设置商标异议
        BrandCx brandCx = new BrandCx();
        brandCx.setId(web.getId());
        brandCx.setPid(web.getPid());
        brandCx.setCxf(web.getCxf());
        brandCx.setBcxf(web.getBcxf());
        brandCx.setCxqz(web.getCxqz());
        if(!web.getCxrq().isEmpty()){
            brandCx.setCxrq(sdf.parse(web.getCxrq()));
        }
        brandCx.setCxdljg(web.getCxdljg());
        brandCx.setCxjg(web.getCxjg());

        //更新商标库
        int i = brandMapper.updateByPrimaryKeySelective(brand);
        //更新商标异议库
        int j = brandCxMapper.updateByPrimaryKeySelective(brandCx);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;
    }

    /**
     * 新增商标撤销数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebBrandCxInfo web) throws ParseException {
        String id = "cx-" + UUID.randomUUID();
        String pid = "b-" + UUID.randomUUID();
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        brand.setId(pid);//设置ID
        if (!web.getBrandStyle().isEmpty()) {
            brand.setBrandStyle(web.getBrandStyle().substring(1, web.getBrandStyle().length()));//设置商标标样
        }
        brand.setBrandName(web.getBrandName());//设置商标名称
        brand.setApplyNumber(web.getApplyNumber());//设置商标申请号
        brand.setApplyName(web.getApplyName());//设置商标申请人
        brand.setCategory(web.getCategory());//设置商标类别
        brand.setGroups(web.getGroups());//设置群组
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));//设置申请日
        }
        if (!web.getCbsdggr().isEmpty()) {
            brand.setNoticeDate(sdf.parse(web.getCbsdggr()));//设置初审公告日
        }
        if (!web.getAuthorization().isEmpty()) {
            brand.setAuthorization(sdf.parse(web.getAuthorization()));//设置商标授权日
        }

        //设置商标异议
        BrandYy brandYy = new BrandYy();
        brandYy.setId("yy-"+UUID.randomUUID());
        brandYy.setPid(pid);

        //设置商标撤销
        BrandCx brandCx = new BrandCx();
        brandCx.setId(id);
        brandCx.setPid(pid);
        brandCx.setCxf(web.getCxf());
        brandCx.setBcxf(web.getBcxf());
        brandCx.setCxqz(web.getCxqz());
        if(!web.getCxrq().isEmpty()){
            brandCx.setCxrq(sdf.parse(web.getCxrq()));
        }
        brandCx.setCxdljg(web.getCxdljg());
        brandCx.setCxjg(web.getCxjg());

        //设置商标诉讼
        BrandSs brandSs = new BrandSs();
        brandSs.setId("ss-" + UUID.randomUUID());
        brandSs.setPid(pid);

        //设置商标使用
        BrandSy brandSy = new BrandSy();
        brandSy.setId("sy" + UUID.randomUUID());
        brandSy.setPid(pid);

        //设置商标转让
        BrandZr brandZr = new BrandZr();
        brandZr.setId("zr-" + UUID.randomUUID());
        brandZr.setPid(pid);

        //设置商标许可
        BrandXk brandXk = new BrandXk();
        brandXk.setId("xk-" + UUID.randomUUID());
        brandXk.setPid(pid);

        /**
         * 设置商标提醒事项
         */
        BrandNotice brandNotice = new BrandNotice();
        brandNotice.setId("notice-" + UUID.randomUUID());
        brandNotice.setPid(pid);
        //默认关闭
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
     * 删除商标撤销数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebBrandCxInfo web) {

        int i = brandMapper.deleteByPrimaryKey(web.getPid());
        Results results = new Results();
        results.setMsg("删除了" + i + "条数据");
        return results;
    }
    /**
     * 查询商标撤销数据
     *
     * @param web
     * @return
     */
    @Override
    public Results select(WebBrandCxInfo web) {
        return null;
    }


}
