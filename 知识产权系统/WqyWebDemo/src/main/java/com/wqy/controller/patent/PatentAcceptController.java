package com.wqy.controller.patent;

import com.wqy.model.patent.WebPatentAcceptInfo;
import com.wqy.service.PatentAcceptService;
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
 * 专利转让Controller
 */
@Controller
public class PatentAcceptController {
    @Autowired
    private PatentAcceptService patentAcceptService;

    /**
     * 查询专利转让数据列表
     * @param webPatentAcceptInfo
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/zlzrList.do")
    @ResponseBody
    public Map listEX(WebPatentAcceptInfo webPatentAcceptInfo,int page,int rows){
        return  patentAcceptService.listEX(webPatentAcceptInfo,page,rows);
    }

    /**
     * 获取编辑数据
     * @param webPatentAcceptInfo
     * @return
     */
    @RequestMapping("/zlzrSelectById.do")
    @ResponseBody
    public Results selectById(WebPatentAcceptInfo webPatentAcceptInfo){
        Results results = new Results();
        results.setObj(webPatentAcceptInfo);
        results.setMsg("获取编辑数据");
        return results;
    }

    /**
     * 更新专利转让数据
     * @param webPatentAcceptInfo
     * @return
     */
    @RequestMapping("/zlzrUpdate.do")
    @ResponseBody
    public Results update(WebPatentAcceptInfo webPatentAcceptInfo) throws ParseException {
        return patentAcceptService.update(webPatentAcceptInfo);
    }

    /**
     * 上传图示
     * @return
     */
    @RequestMapping("zlzrUpload.do")
    @ResponseBody
    public Results upload(HttpServletRequest request, MultipartFile uploadfile ){
        return Upload.uploadImages(uploadfile,request,"1");
    }

    /**
     * 新增专利转让数据
     * @param webPatentAcceptInfo
     * @return
     */
    @RequestMapping("/zlzrAdd.do")
    @ResponseBody
    public Results add(WebPatentAcceptInfo webPatentAcceptInfo) throws ParseException {
        return patentAcceptService.add(webPatentAcceptInfo);
    }

    /**
     * 删除专利转让数据
     * @param webPatentAcceptInfo
     * @return
     */
    @RequestMapping("/zlzrDel.do")
    @ResponseBody
    public Results del(WebPatentAcceptInfo webPatentAcceptInfo){
        return patentAcceptService.del(webPatentAcceptInfo);
    }
}
