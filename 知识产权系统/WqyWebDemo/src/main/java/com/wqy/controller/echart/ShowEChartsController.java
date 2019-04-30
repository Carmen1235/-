package com.wqy.controller.echart;

import com.wqy.dao.mapper.BrandMapper;
import com.wqy.dao.mapper.PatentMapper;
import com.wqy.entity.Brand;
import com.wqy.entity.BrandExample;
import com.wqy.entity.Patent;
import com.wqy.entity.PatentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 王秋叶
 * @author: WangQiuYe
 * @Date: 2018/9/17 14:55
 * @Description: 显示图表Controller
 */
@Controller
public class ShowEChartsController {
    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private PatentMapper patentMapper;

    /**
     * 显示专利商标数量汇总图表
     * @return
     */
    @RequestMapping("/showAll.do")
    @ResponseBody
    public Map showAll(){

//        List<Patent> patents = patentMapper.selectByExample(new PatentExample());
//        List<Brand> brands = brandMapper.selectByExample(new BrandExample());
        Map map = new HashMap();
//        map.put("patents",patents.size());
//        map.put("brands",brands.size());

        return map;
    }
}
