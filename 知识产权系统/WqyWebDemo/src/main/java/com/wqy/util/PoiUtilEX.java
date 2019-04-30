package com.wqy.util;

import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.CTMarker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * POI工具类 poi版本3.9
 *
 * @author wangqiuye 2007
 */
public class PoiUtilEX {



    /**
     *
     * 获取Excel的图片数据 只支持Excel 2007
     *
     * @param sheet 要获取图片的Excel里的Sheet
     * @param wb    要获取的Excel工作簿 暂时没有使用到
     * @return
     */
    public static Map<Integer, PictureData> getPicture(XSSFSheet sheet, XSSFWorkbook wb) {
        Map<Integer, PictureData> sheetIndexPicMap = new HashMap<Integer, PictureData>();

        for (POIXMLDocumentPart dr : sheet.getRelations()) {
            if (dr instanceof XSSFDrawing) {
                XSSFDrawing drawing = (XSSFDrawing) dr;
                List<XSSFShape> shapes = drawing.getShapes();
                for (XSSFShape shape : shapes) {
                    XSSFPicture pic = (XSSFPicture) shape;
                    XSSFClientAnchor anchor = pic.getPreferredSize();
                    CTMarker ctMarker = anchor.getFrom();
                    int picIndex = ctMarker.getRow();
                    sheetIndexPicMap.put(picIndex, pic.getPictureData());
                }
            }
        }

        return sheetIndexPicMap;
    }

    /**
     * 单行单图片
     * 保存图片 只支持Excel 2007
     *
     * @param map      获取的图片数据
     * @param rootPath 指定保存图片根目录 request.getSession().getServletContext().getRealPath("/upload/images/");
     */
    public static Map<Integer, String> savePicture(Map<Integer, PictureData> map, String rootPath) {
        //设置返回数据
        Map<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {

            PictureData pictureData = map.get(i);//获取图片数据1
            byte[] data = pictureData.getData();//获取图片的byte[]类型数据
            //设置文件保存路径
            String fileName = "EX2007"+UUID.randomUUID() + ".png";
            String path = rootPath + "/" + fileName;
            //进行保存文件
            FileOutputStream out = null;
            try {
                out = new FileOutputStream(new File(path));//1.创建文件
                out.write(data);//2.保存
                out.flush();//3.推送
                out.close();//4.关闭
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                System.out.println("11");
                e.printStackTrace();
            }

            map1.put(i, fileName);
        }
        return map1;
    }


}
