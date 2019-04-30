package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandSsInfo;
import com.wqy.service.BrandSsService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标诉讼Controller
 */
@Controller
public class BrandSsController implements BaseController<WebBrandSsInfo> {

    @Autowired
    private BrandSsService brandSsService;



    /**
     *  查询商标诉讼数据列表
     * @param
     * @return
     */

    @Override
    @RequestMapping("/sbssList.do")
    @ResponseBody
    public Map listEX(WebBrandSsInfo webBrandSsInfo,int page,int rows) throws ParseException {
        Map map = brandSsService.listEX(webBrandSsInfo,page,rows);
        return map;
    }

    /**
     * 新增商标诉讼数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbssAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandSsInfo web) throws ParseException {
        return brandSsService.add(web);
    }

    /**
     * 删除商标诉讼数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbssDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandSsInfo web) {
        return brandSsService.del(web);
    }

    /**
     * 查询选中的商标诉讼数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbssSelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandSsInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标诉讼数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbssUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandSsInfo web) throws ParseException {
        return brandSsService.update(web);
    }

}
