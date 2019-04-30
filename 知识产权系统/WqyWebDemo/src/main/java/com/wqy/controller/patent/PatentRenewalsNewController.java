package com.wqy.controller.patent;

import com.wqy.model.patent.WebPatentRenewalsNewInfo;
import com.wqy.service.PatentRenewalsNewsService;
import com.wqy.util.Results;
import com.wqy.util.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.util.Map;

/**
 * 专利续展Controller
 */
@Controller
public class PatentRenewalsNewController {
    @Autowired
    private PatentRenewalsNewsService patentRenewalsNewsService;

    /**
     * 根据查询条件查询数据/显示数据列表
     * @param webPatentRenewalsNewInfo
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/zlxzListNEW.do")
    @ResponseBody
    public Map listEX(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo,int page,int rows){
        System.out.println(webPatentRenewalsNewInfo.toString());
        return patentRenewalsNewsService.listEX(webPatentRenewalsNewInfo,page,rows);
    }

    /**
     * 获取编辑的数据
     * @param webPatentRenewalsNewInfo
     * @return
     */
    @RequestMapping("/zlxzSelectByIdNEW.do")
    @ResponseBody
    public Results selectById(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo){
        Results results = new Results();
        results.setObj(webPatentRenewalsNewInfo);
        results.setResult(true);
        results.setMsg("编辑");
        return  results;
    }

    /**
     * 编辑数据更新/保存
     * @param webPatentRenewalsNewInfo
     * @return
     */
    @RequestMapping("/zlxzUpdateNEW.do")
    @ResponseBody
    public Results update(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) throws ParseException {
        System.out.println(webPatentRenewalsNewInfo.toString());
        Results results = patentRenewalsNewsService.update(webPatentRenewalsNewInfo);
        return results;
    }

    /**
     * 新增数据
     * @param webPatentRenewalsNewInfo
     * @return
     */
    @RequestMapping("/zlxzAddNEW.do")
    @ResponseBody
    public Results add(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo) throws ParseException {
        System.out.println(webPatentRenewalsNewInfo.toString());
        Results results = patentRenewalsNewsService.add(webPatentRenewalsNewInfo);
        return results;
    }

    /**
     * 上传图示
     * @return
     */
    @RequestMapping("zlxzUploadNEW.do")
    @ResponseBody
    public Results upload(HttpServletRequest request, MultipartFile uploadfile ){
        return Upload.uploadImages(uploadfile,request,"1");
    }

    /**
     * 删除数据
     * @param webPatentRenewalsNewInfo
     * @return
     */
    @RequestMapping("/zlxzDelNEW.do")
    @ResponseBody
    public Results del(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo){
        System.out.println(webPatentRenewalsNewInfo.toString());
        Results results = patentRenewalsNewsService.del(webPatentRenewalsNewInfo);
        return results;
    }
}
