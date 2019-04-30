package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.brand.WebBrandYyInfo;
import com.wqy.pojo.brand.BrandYyInfo;
import com.wqy.service.BrandYyService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 商标异议ServiceImpl
 */
@Service
public class BrandYyServiceImpl implements BrandYyService {

    /**
     * 商标库Dao
     */
    @Autowired
    private BrandMapper brandMapper;
    /**
     * 商标异议Dao
     */
    @Autowired
    private BrandYyMapper brandYyMapper;
    /**
     * 商标撤销Dao
     */
    @Autowired
    private BrandCxMapper brandCxMapper;
    /**
     * 商标诉讼Dao
     */
    @Autowired
    private BrandSsMapper brandSsMapper;
    /**
     * 商标监测Dao
     */
    @Autowired
    private BrandJcMapper brandJcMapper;
    /**
     * 商标使用Dao
     */
    @Autowired
    private BrandSyMapper brandSyMapper;
    /**
     * 商标转让Dao
     */
    @Autowired
    private BrandZrMapper brandZrMapper;
    /**
     * 商标许可Dao
     */
    @Autowired
    private BrandXkMapper brandXkMapper;
    /**
     * 商标提醒事项Dao
     */
    @Autowired
    private BrandNoticeMapper brandNoticeMapper;

    public BrandMapper getBrandMapper() {
        return brandMapper;
    }

    public void setBrandMapper(BrandMapper brandMapper) {
        this.brandMapper = brandMapper;
    }

    public BrandYyMapper getBrandYyMapper() {
        return brandYyMapper;
    }

    public void setBrandYyMapper(BrandYyMapper brandYyMapper) {
        this.brandYyMapper = brandYyMapper;
    }

    public BrandCxMapper getBrandCxMapper() {
        return brandCxMapper;
    }

    public void setBrandCxMapper(BrandCxMapper brandCxMapper) {
        this.brandCxMapper = brandCxMapper;
    }

    public BrandSsMapper getBrandSsMapper() {
        return brandSsMapper;
    }

    public void setBrandSsMapper(BrandSsMapper brandSsMapper) {
        this.brandSsMapper = brandSsMapper;
    }

    public BrandJcMapper getBrandJcMapper() {
        return brandJcMapper;
    }

    public void setBrandJcMapper(BrandJcMapper brandJcMapper) {
        this.brandJcMapper = brandJcMapper;
    }

    public BrandSyMapper getBrandSyMapper() {
        return brandSyMapper;
    }

    public void setBrandSyMapper(BrandSyMapper brandSyMapper) {
        this.brandSyMapper = brandSyMapper;
    }

    public BrandZrMapper getBrandZrMapper() {
        return brandZrMapper;
    }

    public void setBrandZrMapper(BrandZrMapper brandZrMapper) {
        this.brandZrMapper = brandZrMapper;
    }

    public BrandXkMapper getBrandXkMapper() {
        return brandXkMapper;
    }

    public void setBrandXkMapper(BrandXkMapper brandXkMapper) {
        this.brandXkMapper = brandXkMapper;
    }

    public BrandNoticeMapper getBrandNoticeMapper() {
        return brandNoticeMapper;
    }

    public void setBrandNoticeMapper(BrandNoticeMapper brandNoticeMapper) {
        this.brandNoticeMapper = brandNoticeMapper;
    }

    /**
     * 查询商标异议数据列表
     *
     * @param
     * @return
     */
    @Override
    public Map listEX(WebBrandYyInfo webBrandYyInfo, int page, int rows) throws ParseException {

        String str = webBrandYyInfo.getHid_value_address();
        String[] strs = str.split(",");
        webBrandYyInfo.setAdds(Arrays.asList(strs));

        PageHelper.startPage(page, rows);

        List<BrandYyInfo> lists = brandYyMapper.listEX(webBrandYyInfo);

        PageInfo<BrandYyInfo> pageInfo = new PageInfo(lists);

        Map map = new HashMap();
        map.put("total", pageInfo.getTotal());
        map.put("rows", lists);
        return map;
    }

    /**
     * 更新商标异议数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebBrandYyInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        /*设置ID*/
        brand.setId(web.getPid());
        /*设置商标标样*/
        brand.setBrandStyle(Optional.ofNullable(web.getBrandStyle()).orElse(""));
        /*设置商标名称*/
        brand.setBrandName(Optional.ofNullable(web.getBrandName()).orElse(""));
        /*设置商标申请号*/
        brand.setApplyNumber(Optional.ofNullable(web.getApplyNumber()).orElse(""));
        /*设置商标申请人*/
        brand.setApplyName(Optional.ofNullable(web.getApplyName()).orElse(""));
        /*设置商标类别*/
        brand.setCategory(Optional.ofNullable(web.getCategory()).orElse(""));
        /*设置群组*/
        brand.setGroups(Optional.ofNullable(web.getGroups()).orElse(""));

        /*设置申请日*/
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        /*设置初审公告日*/
        if (!web.getCbsdggr().isEmpty()) {
            brand.setCbsdggr(sdf.parse(web.getCbsdggr()));
        }


        //设置商标异议
        BrandYy brandYy = new BrandYy();
        brandYy.setId(web.getId());
        brandYy.setPid(web.getPid());
        brandYy.setYyf(web.getYyf());
        brandYy.setByyf(web.getByyf());
        brandYy.setYyqz(web.getYyqz());
        if (!web.getTyyrq().isEmpty()) {
            brandYy.setTyyrq(sdf.parse(web.getTyyrq()));
        }
        brandYy.setYydljg(web.getYydljg());
        brandYy.setYyjg(web.getYyjg());
        //更新商标库
        int i = brandMapper.updateByPrimaryKeySelective(brand);
        //更新商标异议库
        int j = brandYyMapper.updateByPrimaryKeySelective(brandYy);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;
    }

    /**
     * 新增商标异议数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebBrandYyInfo web) throws ParseException {
        String id = "yy-" + UUID.randomUUID();
        String pid = "b-" + UUID.randomUUID();
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        /*设置ID*/
        brand.setId(pid);
        /*设置商标标样*/
        if (!web.getBrandStyle().isEmpty()) {
            brand.setBrandStyle(web.getBrandStyle().substring(1, web.getBrandStyle().length()));
        }
        /*设置商标名称*/
        brand.setBrandName(web.getBrandName());
        /*设置商标申请号*/
        brand.setApplyNumber(web.getApplyNumber());
        /*设置商标申请人*/
        brand.setApplyName(web.getApplyName());
        /*设置商标类别*/
        brand.setCategory(web.getCategory());
        /*设置群组*/
        brand.setGroups(web.getGroups());
        /*设置申请日*/
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        /*设置初审公告日*/
        if (!web.getCbsdggr().isEmpty()) {
            brand.setNoticeDate(sdf.parse(web.getCbsdggr()));
        }
        //设置商标异议
        BrandYy brandYy = new BrandYy();
        brandYy.setId(id);
        brandYy.setPid(pid);
        brandYy.setYyf(web.getYyf());
        brandYy.setByyf(web.getByyf());
        brandYy.setYyqz(web.getYyqz());
        if (!web.getTyyrq().isEmpty()) {
            brandYy.setTyyrq(sdf.parse(web.getTyyrq()));
        }
        brandYy.setYydljg(web.getYydljg());
        brandYy.setYyjg(web.getYyjg());

        //设置商标撤销
        BrandCx brandCx = new BrandCx();
        brandCx.setId("cx-" + UUID.randomUUID());
        brandCx.setPid(pid);

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

        //设置商标提醒事项
        BrandNotice brandNotice = new BrandNotice();
        brandNotice.setId("notice-" + UUID.randomUUID());
        brandNotice.setPid(pid);
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
     * 删除商标异议数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebBrandYyInfo web) {
        int i = brandMapper.deleteByPrimaryKey(web.getPid());
        Results results = new Results();
        results.setMsg("删除了" + i + "条数据");
        return results;
    }

    /**
     * 查询商标异议数据
     *
     * @param web
     * @return
     */
    @Override
    public Results select(WebBrandYyInfo web) {
        return null;
    }
}
