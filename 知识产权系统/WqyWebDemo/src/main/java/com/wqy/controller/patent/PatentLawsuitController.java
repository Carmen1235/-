package com.wqy.controller.patent;

import com.wqy.model.patent.WebPatentLawsuitInfo;
import com.wqy.service.PatentLawsuitService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 专利诉讼Controller
 */
@Controller
public class PatentLawsuitController {
    @Autowired
    private PatentLawsuitService patentLawsuitService;

    /**
     * 查询专利诉讼数据列表
     * @return
     */

    @RequestMapping("/zlssList.do")
    @ResponseBody
    public Map listEX(WebPatentLawsuitInfo webPatentLawsuitInfo,int page,int rows){
        System.out.println(webPatentLawsuitInfo.toString());
        return patentLawsuitService.listEX(webPatentLawsuitInfo,page,rows);
    }


    /**
     * 查询专利诉讼数据
     * @return
     */
    @RequestMapping("/zlssSelectById.do")
    @ResponseBody
    public Results selectById(WebPatentLawsuitInfo web){
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新专利诉讼数据
     * @return
     */
    @RequestMapping("/zlssUpdate.do")
    @ResponseBody
    public Results update(WebPatentLawsuitInfo web) throws ParseException {
        return patentLawsuitService.update(web);
    }

    /**
     * 删除专利诉讼数据
     * @return
     */
    @RequestMapping("/zlssDel.do")
    @ResponseBody
    public Results del(WebPatentLawsuitInfo web){
        System.out.println(web.toString());
        return patentLawsuitService.del(web);
    }

    /**
     * 新增专利诉讼数据
     * @return
     */
    @RequestMapping("zlssAdd.do")
    @ResponseBody
    public Results add(WebPatentLawsuitInfo web) throws ParseException {
        System.out.println(web.toString());
        return patentLawsuitService.add(web);
    }
}
