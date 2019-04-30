package com.wqy.util;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * 上传的根据类
 * @author  WordK
 */
public class Upload {

    //上传图片
    public static  Results uploadImages(MultipartFile multipartFile, HttpServletRequest request,String index){
        //1.设置文件路径
        String realpath;
        if(index.equals("1")){
            realpath = request.getSession().getServletContext().getRealPath("/upload/images/");
        }else {
            realpath = request.getSession().getServletContext().getRealPath("/upload/files/");
        }
        //2.设置文件名
        String fileName = multipartFile.getOriginalFilename();

        //3.进行文件转换
        try {
            FileUtils.writeByteArrayToFile(new File(realpath,fileName),multipartFile.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //设置返回结果
        Results results = new Results();
        results.setMsg(fileName);

        return  results;
    }
}
