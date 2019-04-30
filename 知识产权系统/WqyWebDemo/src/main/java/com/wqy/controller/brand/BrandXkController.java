package com.wqy.controller.brand;

import com.wqy.controller.base.BaseController;
import com.wqy.model.brand.WebBrandXkInfo;
import com.wqy.service.BrandXkService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标许可Controller
 */
@Controller
public class BrandXkController implements BaseController<WebBrandXkInfo>{
    @Autowired
    private BrandXkService brandXkService;

    /**
     * 商标许可数据列表查询
     * @param
     * @return
     */
    @Override
    @RequestMapping("/sbxkList.do")
    @ResponseBody
    public Map listEX(WebBrandXkInfo webBrandXkInfo,int page,int rows) throws ParseException {
        Map map = brandXkService.listEX(webBrandXkInfo,page,rows);
        return map;
    }

    /**
     * 新增商标许可数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbxkAdd.do")
    @ResponseBody
    @Override
    public Results add(WebBrandXkInfo web) throws ParseException {
        return brandXkService.add(web);
    }

    /**
     * 删除商标许可数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbxkDel.do")
    @ResponseBody
    @Override
    public Results del(WebBrandXkInfo web) {
        return brandXkService.del(web);
    }

    /**
     * 查询选中的商标许可数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbxkSelectById.do")
    @ResponseBody
    @Override
    public Results selectById(WebBrandXkInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标许可数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbxkUpdate.do")
    @ResponseBody
    @Override
    public Results update(WebBrandXkInfo web) throws ParseException {
        return brandXkService.update(web);
    }

}
