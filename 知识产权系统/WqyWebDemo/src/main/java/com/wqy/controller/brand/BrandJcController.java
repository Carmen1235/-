package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandJcInfo;
import com.wqy.service.BrandJcService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标监测Controller
 * @author wanqgiuye
 */

@Controller
public class BrandJcController implements BaseController<WebBrandJcInfo>{
    @Autowired
    private BrandJcService brandJcService;

    /**
     * 查询商标监测数据列表
     * @return
     */
    @RequestMapping("/sbjcList.do")
    @ResponseBody
    @Override
    public Map listEX(WebBrandJcInfo webBrandJcInfo,int page,int rows) throws ParseException {
        Map map = brandJcService.listEX(webBrandJcInfo,page,rows);
        return map;
    }

    /**
     * 新增商标监测数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbjcAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandJcInfo web) throws ParseException {
        return brandJcService.add(web);
    }

    /**
     * 删除商标监测数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbjcDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandJcInfo web) {
        return brandJcService.del(web);
    }

    /**
     * 查询选中的商标监测数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbjcSelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandJcInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标监测数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbjcUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandJcInfo web) throws ParseException {
        return brandJcService.update(web);
    }


}
