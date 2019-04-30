package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandCxInfo;
import com.wqy.service.BrandCxService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标撤销Controller
 */
@Controller
public class BrandCxController implements BaseController<WebBrandCxInfo>{
    @Autowired
    private BrandCxService brandCxService;

    /**
     * 获取商标撤销数据列表
     */
    @RequestMapping("/sbcxList.do")
    @ResponseBody
    @Override
    public Map listEX(WebBrandCxInfo webBrandCxInfo,int page,int rows) throws ParseException {
        System.out.println("sbcx:"+webBrandCxInfo.toString());
        Map map = brandCxService.listEX(webBrandCxInfo,page,rows);
        return map;
    }

    /**
     * 新增商标撤销数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbcxAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandCxInfo web) throws ParseException {
        return brandCxService.add(web);
    }

    /**
     * 删除商标撤销数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbcxDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandCxInfo web) {
        return brandCxService.del(web);
    }

    /**
     * 查询选中的商标撤销数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbcxSelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandCxInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标撤销数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbcxUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandCxInfo web) throws ParseException {
        return brandCxService.update(web);
    }


}
