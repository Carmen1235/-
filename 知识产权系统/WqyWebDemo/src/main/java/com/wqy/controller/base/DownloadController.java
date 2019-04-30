package com.wqy.controller.base;

import com.wqy.util.Download;
import com.wqy.util.Results;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文件下载Controller
 */
@Controller
public class DownloadController {

    @RequestMapping("/downloadFiles.do")
    @ResponseBody
    public Results downloadFiles(HttpServletRequest request, HttpServletResponse response, String fileName){
        Download.download(request,response,fileName);
        Results results = new Results();
        return results;
    }


    /**
     * 下载附件 使用
     * 新的下载方法 可用
     * @param request 请求
     * @param response 响应
     * @param fileName 文件名
     * @return
     * @throws IOException
     */
    @RequestMapping("/downloadFiles1.do")
    public ResponseEntity<byte[]> downloadFiles1(HttpServletRequest request, HttpServletResponse response, String fileName) throws IOException {
        String filePath =  request.getSession().getServletContext().getRealPath("/upload/files/");//文件存放的路径
        return Download.bulidResponseEntity(request,response,fileName,filePath);
    }

    /**
     * 下载导出模板 专利导出模板 商标导出模板 使用
     * 新的下载方法 可用
     * @param request 请求
     * @param response 响应
     * @param fileName 文件名
     * @return
     * @throws IOException
     */
    @RequestMapping("/downloadTemplate.do")
    public ResponseEntity<byte[]> downloadTemplate(HttpServletRequest request, HttpServletResponse response, String fileName) throws IOException {
        String filePath =  request.getSession().getServletContext().getRealPath("/xls/");//文件存放的路径
        return Download.bulidResponseEntity(request,response,fileName,filePath);
    }
}
