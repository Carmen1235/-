package com.wqy.util;

import org.aspectj.util.FileUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * 文件下载工具类
 * @author WordK 王秋叶
 */
public class Download {

    //老方法 存在问题 下载文件打不开损坏
    public static void download(HttpServletRequest request, HttpServletResponse response,String fileName){
        String filePath =  request.getSession().getServletContext().getRealPath("/upload/files/");
        File file = new File(filePath, fileName);
        if(file.exists()){
            try {
                response.reset();
                response.setCharacterEncoding("utf-8");
                response.setHeader("content-type", "application/octet-stream");
                response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
                OutputStream output = response.getOutputStream();

                byte[] buffer = new byte[1024];
                FileInputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);

                int num;
                while ((num=bis.read())!=-1){
                    output.write(buffer,0,num);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件不存在！");
        }

    }

    /**
     *  新下载文件的方法 可用 更新2018/6/13
     * @param request 请求
     * @param response 响应
     * @param fileName 文件名
     * @param filePath 文件存放路径
     * @return 返回实体
     * @throws IOException IO异常
     */
    public static ResponseEntity<byte[]> bulidResponseEntity(HttpServletRequest request, HttpServletResponse response,String fileName,String filePath) throws IOException {
        byte[] body = null;

        File file = new File(filePath, fileName);
        if(!file.exists()){
            response.sendError(404,"找不到文件");
        }
        InputStream is = new FileInputStream(file);
        body = new byte[is.available()];
        is.read(body);
        //设置请求头
        HttpHeaders headers = new HttpHeaders();
        //通知游览器attachment（下载方式）打开
        String strfile = new String(fileName.getBytes("utf-8"),"iso-8859-1");
        headers.set("Content-Disposition","attachment; filename="+strfile);
        //application/octet-stream二进制流数据
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        //HTTP状态
        HttpStatus status = HttpStatus.OK;
        //响应的实体
        ResponseEntity<byte[]> entity = new ResponseEntity<byte[]>(body,headers,status);
        return entity;
    }


}
