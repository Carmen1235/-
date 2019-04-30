package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.BrandMapper;
import com.wqy.dao.mapper.BrandNoticeMapper;
import com.wqy.entity.Brand;
import com.wqy.entity.BrandNotice;
import com.wqy.model.notice.WebNoticeBrandInfo;
import com.wqy.pojo.brand.BrandNoticeInfo;
import com.wqy.service.NoticeBrandService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 商标提醒ServiceImpl
 */
@Service
public class NoticeBrandServiceImpl implements NoticeBrandService {
    @Autowired
    private BrandNoticeMapper brandNoticeMapper;//商标提醒Dao
    @Autowired
    private BrandMapper brandMapper;//商标库Dao

    /**
     *
     * @param
     * @return
     */
    @Override
    public Map listEX(WebNoticeBrandInfo web,int page,int rows)throws ParseException{
        String str = web.getHid_value_address();
        String[] strs = str.split(",");
        web.setAdds(Arrays.asList(strs));

        PageHelper.startPage(page,rows);

        List<BrandNoticeInfo> lists = brandNoticeMapper.listEX(web);

        PageInfo<BrandNoticeInfo> pageInfo = new PageInfo<>(lists);

        Map map = new HashMap();
        map.put("total", pageInfo.getTotal());
        map.put("rows", lists);
        return map;
    }


    /**
     * 更新商标转让数据
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebNoticeBrandInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        //设置id
        brand.setId(web.getPid());
        //商标标样
        brand.setBrandStyle(web.getBrandStyle());
        //商标名称
        brand.setBrandName(web.getBrandName());
        //商标申请号
        brand.setApplyNumber(web.getApplyNumber());
        //商标申请人
        brand.setApplyName(web.getApplyName());
        //商标类别
        brand.setCategory(web.getCategory());
        //群组
        brand.setGroups(web.getGroups());
        //申请日
        if (!web.getApplyDate().isEmpty()) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        //注册日
        if (!web.getZcggr().isEmpty()) {
            brand.setRegDate(sdf.parse(web.getZcggr()));
        }
        //专利权期限
        if (!web.getDeadline().isEmpty()) {
            brand.setRegDate(sdf.parse(web.getDeadline()));
        }


        //设置商标提醒库
        BrandNotice brandNotice = new BrandNotice();
        brandNotice.setId(web.getId());
        brandNotice.setPid(web.getPid());
        brandNotice.setEnables(web.getEnables());
        if (web.getYxrq()!=null&web.getYxrq()!="") {
            //提醒日期
            brandNotice.setTxrq(sdf.parse(web.getTxrq()));
        }



        //更新商标库
        int i = brandMapper.updateByPrimaryKeySelective(brand);
        //更新商提醒库
        int j = brandNoticeMapper.updateByPrimaryKeySelective(brandNotice);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;
    }
}
