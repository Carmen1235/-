package com.wqy.controller.patent;

import com.wqy.model.patent.WebPatentInfo;
import com.wqy.service.PatentService;
import com.wqy.util.Results;
import com.wqy.util.Upload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

/**
 * 专利Controller
 */
@Controller
public class PatentController {
    @Autowired
    private PatentService patentService;

    /**
     * 根据条件查询/查询显示数据list
     * @param webPatentInfo
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/zlList.do")
    @ResponseBody
    public Map listEX(WebPatentInfo webPatentInfo,int page,int rows,String sort,String order){
        return patentService.listEX(webPatentInfo,page,rows,sort,order);
    }

    /**
     * 专利库导出
     */
    @RequestMapping("/zlExport.do")
    public void exportExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        patentService.exportEX(request,response);
    }

    /**
     * 专利库导入
     */
    @RequestMapping("/zlImport.do")
    @ResponseBody
    public Results importExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("excel");

        InputStream is = file.getInputStream();
        String fileName = file.getOriginalFilename();
        patentService.importExcelEX(is,fileName,request);

        Results results = new Results();
        results.setMsg("导入成功！");
        results.setResult(true);
        return  results;
    }

    /**
     * 专利库查询
     */
//    @RequestMapping("zlSelect.do")
//    @ResponseBody
//    public Results select( String zlSearchPantentName,String row,String page){
//        System.out.println("查询："+row+" "+page);
//        Results select = patentService.select(zlSearchPantentName);
//        return select;
//    }
    /**
     * 上传图示
     * @return
     */
    @RequestMapping("zlUpload.do")
    @ResponseBody
    public Results upload(HttpServletRequest request, MultipartFile uploadfile ){
        return Upload.uploadImages(uploadfile,request,"1");
    }
    /**
     * 新增专利转让数据
     * @param web
     * @return
     */
    @RequestMapping("/zlAdd.do")
    @ResponseBody
    public Results add(WebPatentInfo web) throws ParseException {
        Results add = patentService.add(web);
        return add;
    }

    /**
     * 删除专利数据
     * @param web
     * @return
     */
    @RequestMapping("/zlDel.do")
    @ResponseBody
    public Results del(WebPatentInfo web){
        return patentService.del(web);
    }


    /**
     * 获取编辑数据
     * @param web
     * @return
     */
    @RequestMapping("/zlSelectById.do")
    @ResponseBody
    public Results selectById(WebPatentInfo web){
//        System.out.println(web.toString());
        Results r = new Results();
        r.setObj(web);
        r.setMsg("获取编辑数据");
        return r;
    }

    /**
     * 更新专利转让数据
     * @param web
     * @return
     */
    @RequestMapping("/zlUpdate.do")
    @ResponseBody
    public Results update(WebPatentInfo web) throws ParseException {
        return patentService.update(web);
    }
}
