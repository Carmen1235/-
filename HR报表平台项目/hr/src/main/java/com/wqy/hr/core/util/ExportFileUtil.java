package com.wqy.hr.core.util;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Optional;

/**
 * @author 王秋叶
 * @create 2019-02-22 9:42
 * @desc
 **/
public class ExportFileUtil {
    private final static String FILENAME = "临时文件";

    public static void export(String filePath, HttpServletResponse response,String fileName){

        String encode = null;
        try {
            encode = URLEncoder.encode( Optional.ofNullable(fileName).orElse(ExportFileUtil.FILENAME), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        response.setHeader("content-disposition","attachment;filename="+encode+".xlsx");
        ServletOutputStream out = null;
        FileInputStream fis = null;
        try{
            out = response.getOutputStream();
            fis = new FileInputStream(filePath);
            int len = 0;
            byte[] buffer = new byte[1024];
            while ((len=fis.read(buffer))>1){
                out.write(buffer,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
