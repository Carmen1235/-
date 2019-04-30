package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandYyInfo;
import com.wqy.service.BrandYyService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标异议Controller
 */
@Controller
public class BrandYyController implements BaseController<WebBrandYyInfo> {
    @Autowired
    private BrandYyService brandYyService;

    /**
     * 查询异议数据列表
     *
     * @param
     * @return
     */
    @RequestMapping("/sbyyList.do")
    @ResponseBody
    @Override
    public Map listEX(WebBrandYyInfo webBrandYyInfo,int page,int rows) throws ParseException {
        return brandYyService.listEX(webBrandYyInfo,page,rows);
    }

    /**
     * 新增商标异议数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbyyAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandYyInfo web) throws ParseException {
        System.out.println(web.toString());
        return brandYyService.add(web);
    }

    /**
     * 删除商标异议数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbyyDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandYyInfo web) {
        return brandYyService.del(web);
    }

    /**
     * 查询选中的商标异议数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbyySelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandYyInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标异议数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbyyUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandYyInfo web) throws ParseException{
        return brandYyService.update(web);
    }
}
