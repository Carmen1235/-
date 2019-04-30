package com.wqy.controller.patent;

import com.wqy.model.patent.WebPatentInvalidDeclareInfo;
import com.wqy.service.PatentInvalidDeclareService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.util.Map;

/**
 * 专利无效宣告Controller
 * @author wangqiuye
 */
@Controller
public class PatentInvalidDeclareController {
    @Autowired
    private PatentInvalidDeclareService patentInvalidDeclareService;

    /**
     * 根据条件查询专利无效宣告数据/显示数据list
     * @param webPatentInvalidDeclareInfo
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/zlwxxgList.do")
    @ResponseBody
    public Map listEX(WebPatentInvalidDeclareInfo webPatentInvalidDeclareInfo,int page,int rows){
        return  patentInvalidDeclareService.listEX(webPatentInvalidDeclareInfo,page,rows);
    }

    /**
     * 查询专利无效宣告数据
     * @return
     */
    @RequestMapping("/zlwxxgSelectById.do")
    @ResponseBody
    public Results selectById(WebPatentInvalidDeclareInfo web){
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新专利无效宣告数据
     * @return
     */
    @RequestMapping("/zlwxxgUpdate.do")
    @ResponseBody
    public Results update(WebPatentInvalidDeclareInfo web) throws ParseException {
        return patentInvalidDeclareService.update(web);
    }

    /**
     * 删除专利无效宣告数据
     * @return
     */
    @RequestMapping("/zlwxxgDel.do")
    @ResponseBody
    public Results del(WebPatentInvalidDeclareInfo web){
        return patentInvalidDeclareService.del(web);
    }

    /**
     * 新增专利无效宣告数据
     * @return
     */
    @RequestMapping("zlwxxgAdd.do")
    @ResponseBody
    public Results add(WebPatentInvalidDeclareInfo web) throws ParseException {
        return patentInvalidDeclareService.add(web);
    }

    /**
     * 专利续展宣告数据导出
     * @return
     */
    @RequestMapping("/zlwxxgExport.do")
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
         patentInvalidDeclareService.export(request,response);
    }
}
