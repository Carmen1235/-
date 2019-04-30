package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandSyInfo;
import com.wqy.service.BrandSyService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标使用Controllelr
 */
@Controller
public class BrandSyController implements BaseController<WebBrandSyInfo>{
    @Autowired
    private BrandSyService brandSyService;

    /**
     * 查询商标使用数据列表
     * @param
     * @return
     */
    @RequestMapping("/sbsyList.do")
    @ResponseBody
    @Override
    public Map listEX(WebBrandSyInfo webBrandSyInfo,int page,int rows ) throws ParseException {
        Map map = brandSyService.listEX(webBrandSyInfo,page,rows);
        return map;
    }
    /**
     * 新增商标使用数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbsyAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandSyInfo web) throws ParseException {
        return brandSyService.add(web);
    }

    /**
     * 删除商标使用数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbsyDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandSyInfo web) {
        return brandSyService.del(web);
    }

    /**
     * 查询选中的商标使用数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbsySelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandSyInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标使用数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbsyUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandSyInfo web) throws ParseException {
        return brandSyService.update(web);
    }

}
