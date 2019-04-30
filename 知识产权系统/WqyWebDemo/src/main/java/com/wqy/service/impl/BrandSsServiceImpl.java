package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.brand.WebBrandSsInfo;
import com.wqy.pojo.brand.BrandSsInfo;
import com.wqy.service.BrandSsService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 商标诉讼ServiceImpl
 */
@Service
public class BrandSsServiceImpl implements BrandSsService {
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

    /**
     * 显示列表
     * @param
     * @return
     */
    @Override
    public Map listEX(WebBrandSsInfo webBrandSsInfo,int page,int rows )throws ParseException {
        String str = webBrandSsInfo.getHid_value_address();
        String[] strs = str.split(",");
        webBrandSsInfo.setAdds(Arrays.asList(strs));
        //设置分页
        PageHelper.startPage(page,rows);

        //获取查询数据
        List<BrandSsInfo> lists = brandSsMapper.listEX(webBrandSsInfo);

        PageInfo<BrandSsInfo> pageInfo = new PageInfo(lists);

        //打包发送给前台的数据
        Map map = new HashMap();
        map.put("total", pageInfo.getTotal());
        map.put("rows", lists);
        return map;
    }

    /**
     * 更新商标诉讼数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebBrandSsInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        /*设置id*/
        brand.setId(web.getPid());
        /*商标标样*/
        brand.setBrandStyle(web.getBrandStyle());
        /*商标名称*/
        brand.setBrandName(Optional.ofNullable(web.getBrandName()).orElse(""));
        /*商标申请号*/
        brand.setApplyNumber(Optional.ofNullable(web.getApplyNumber()).orElse(""));
        /*商标申请人*/
        brand.setApplyName(Optional.ofNullable(web.getApplyName()).orElse(""));
        /*商标类别*/
        brand.setCategory(Optional.ofNullable(web.getCategory()).orElse(""));
        /*群组*/
        brand.setGroups(Optional.ofNullable(web.getGroups()).orElse(""));
        /*申请日*/
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        /*申请单位*/
        brand.setApplyUnit(Optional.ofNullable(web.getApplyUnit()).orElse(""));
        /*使用单位*/
        brand.setUseUnit(Optional.ofNullable(web.getUseUnit()).orElse(""));

        //设置商标诉讼库
        BrandSs brandSs = new BrandSs();
        /*设置id*/
        brandSs.setId(web.getId());
        /*设置pid*/
        brandSs.setPid(web.getPid());
        /*设置诉讼类型*/
        brandSs.setSslx(Optional.ofNullable(web.getSslx()).orElse(""));
        /*设置审级*/
        brandSs.setSj(Optional.ofNullable(web.getSj()).orElse(""));
        /*设置原告*/
        brandSs.setYg(Optional.ofNullable(web.getYg()).orElse(""));
        /*设置被告*/
        brandSs.setBg(Optional.ofNullable(web.getBg()).orElse(""));
        /*设置案由*/
        brandSs.setAy(Optional.ofNullable(web.getAy()).orElse(""));
        /*设置诉讼请求*/
        brandSs.setSsqq(Optional.ofNullable(web.getSsqq()).orElse(""));
        /*设置案件结果*/
        brandSs.setAjjg(Optional.ofNullable(web.getAjjg()).orElse(""));
        /*设置裁判日期*/
        if (!web.getCprq().isEmpty()) {
            brandSs.setCprq(sdf.parse(web.getCprq()));
        }
        /*设置一审法院*/
        brandSs.setYsfy(Optional.ofNullable(web.getYsfy()).orElse(""));
        /*设置律师*/
        brandSs.setLs(Optional.ofNullable(web.getLs()).orElse(""));
        /*设置律师事务所*/
        brandSs.setLssws(Optional.ofNullable(web.getLssws()).orElse(""));
        /*第三人*/
        brandSs.setDsr(Optional.ofNullable(web.getDsr()).orElse(""));
        /*上诉信息*/
        brandSs.setSsxx(Optional.ofNullable(web.getSsxx()).orElse(""));
        /*涉案商标*/
        brandSs.setSasb(Optional.ofNullable(web.getSasb()).orElse(""));
        /*备注*/
        brandSs.setBz(Optional.ofNullable(web.getBz()).orElse(""));

        //更新商标库
        int i = brandMapper.updateByPrimaryKeySelective(brand);
        //更新商标诉讼库
        int j = brandSsMapper.updateByPrimaryKeySelective(brandSs);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;
    }

    /**
     * 新增商标诉讼数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebBrandSsInfo web) throws ParseException {
        String id = "ss-" + UUID.randomUUID();
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
        /*商标名称*/
        brand.setBrandName(Optional.ofNullable(web.getBrandName()).orElse(""));
        /*商标申请号*/
        brand.setApplyNumber(Optional.ofNullable(web.getApplyNumber()).orElse(""));
        /*商标申请人*/
        brand.setApplyName(Optional.ofNullable(web.getApplyName()).orElse(""));
        /*商标类别*/
        brand.setCategory(web.getCategory());
        /*群组*/
        brand.setGroups(web.getGroups());
        /*申请日*/
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        /*申请单位*/
        brand.setApplyUnit(Optional.ofNullable(web.getApplyUnit()).orElse(""));
        /*使用单位*/
        brand.setUseUnit(Optional.ofNullable(web.getUseUnit()).orElse(""));

        //设置商标异议
        BrandYy brandYy = new BrandYy();
        brandYy.setId("yy-" + UUID.randomUUID());
        brandYy.setPid(pid);

        //设置商标撤销库
        BrandCx brandCx = new BrandCx();
        /*设置ID*/
        brandCx.setId("cx-" + UUID.randomUUID());
        /*设置PID*/
        brandCx.setPid(pid);

        //设置商标诉讼库
        BrandSs brandSs = new BrandSs();
        /*设置id*/
        brandSs.setId(id);
        /*设置pid*/
        brandSs.setPid(pid);
        /*设置诉讼类型*/
        brandSs.setSslx(web.getSslx());
        /*设置审级*/
        brandSs.setSj(web.getSj());
        /*设置原告*/
        brandSs.setYg(web.getYg());
        /*设置被告*/
        brandSs.setBg(web.getBg());
        /*设置案由*/
        brandSs.setAy(web.getAy());
        /*设置诉讼请求*/
        brandSs.setSsqq(web.getSsqq());
        /*设置案件结果*/
        brandSs.setAjjg(web.getAjjg());
        /*设置裁判日期*/
        if (!web.getCprq().isEmpty()) {
            brandSs.setCprq(sdf.parse(web.getCprq()));
        }
        /*设置一审法院*/
        brandSs.setYsfy(web.getYsfy());
        /*设置律师*/
        brandSs.setLs(web.getLs());
        /*设置律师事务所*/
        brandSs.setLssws(web.getLssws());
        /*第三人*/
        brandSs.setDsr(web.getDsr());
        /*上诉信息*/
        brandSs.setSsxx(web.getSsxx());
        /*涉案商标*/
        if (!web.getSasb().isEmpty()) {
            brandSs.setSasb(web.getSasb().substring(1, web.getSasb().length()));
        }
        /*备注*/
        brandSs.setBz(web.getBz());

        //设置商标使用
        BrandSy brandSy = new BrandSy();
        /*设置id*/
        brandSy.setId("sy-" + UUID.randomUUID());
        /*设置pid*/
        brandSy.setPid(pid);

        //设置商标转让
        BrandZr brandZr = new BrandZr();
        /*设置id*/
        brandZr.setId("zr" + UUID.randomUUID());
        /*设置pid*/
        brandZr.setPid(pid);

        //设置商标许可
        BrandXk brandXk = new BrandXk();
        /*设置id*/
        brandXk.setId("xk-" + UUID.randomUUID());
        /*设置pid*/
        brandXk.setPid(pid);

        //设置商标提醒事项
        BrandNotice brandNotice = new BrandNotice();
        /*设置id*/
        brandNotice.setId("notice-" + UUID.randomUUID());
        /*设置pid*/
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
     * 删除商标诉讼数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebBrandSsInfo web) {
        int i = brandMapper.deleteByPrimaryKey(web.getPid());
        Results results = new Results();
        results.setMsg("删除了" + i + "条数据");
        return results;
    }

    /**
     * 查询商标诉讼数据
     *
     * @param web
     * @return
     */
    @Override
    public Results select(WebBrandSsInfo web) {
        return null;
    }
}
