package com.wqy.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 导出Excel
 * @author wangqiuye
 */
public class Export {

    public static void export(String filePath) throws IOException {
        //创建工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建Sheet
        HSSFSheet sheet = workbook.createSheet();
        //创建Row
        HSSFRow row = sheet.createRow(0);
        //设置表头
        String[] header = {"用户名","密码","xx"};
        HSSFCell cell = null;
        for(int i =0;i<header.length;i++){
            cell = row.createCell(i);//获取该行的某列
            cell.setCellValue(header[i]);//对获取的列设置值
        }

        //设置图片
        //获取图片工具
        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();
        //设置图片来源
        BufferedImage bufferedImage = ImageIO.read(new File(filePath));
        //设置图片输出
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //输入转换到输出
        ImageIO.write(bufferedImage,"png",byteArrayOutputStream);

        //设置图片存放位置
        HSSFClientAnchor anchor = new HSSFClientAnchor(0,0,0,0,(short)1,1,(short)2,2);

        //打开图片工具导入图片
        drawingPatriarch.createPicture(anchor,workbook.addPicture(byteArrayOutputStream.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));

        workbook.write(new FileOutputStream(new File("c:\\xx.xls")));
    }
}
