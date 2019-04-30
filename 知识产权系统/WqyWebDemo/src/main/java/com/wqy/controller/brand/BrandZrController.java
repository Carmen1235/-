package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandZrInfo;
import com.wqy.service.BrandZrService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标转让Controller
 */
@Controller
public class BrandZrController implements BaseController<WebBrandZrInfo>{
    @Autowired
    private BrandZrService brandZrService;


    /**
     * 查询商标转让数据列表
     * @param
     * @return
     */
    @RequestMapping("/sbzrList.do")
    @ResponseBody
    @Override
    public Map listEX(WebBrandZrInfo webBrandZrInfo,int page,int rows) throws ParseException {
        Map map = brandZrService.listEX(webBrandZrInfo,page,rows);
        return map;
    }

    /**
     * 新增商标转让数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbzrAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandZrInfo web) throws ParseException {
        return brandZrService.add(web);
    }

    /**
     * 删除商标转让数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbzrDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandZrInfo web) {
        return brandZrService.del(web);
    }

    /**
     * 查询选中的商标转让数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbzrSelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandZrInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标转让数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbzrUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandZrInfo web) throws ParseException {
        return brandZrService.update(web);
    }

}
