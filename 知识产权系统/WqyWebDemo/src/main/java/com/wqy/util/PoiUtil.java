package com.wqy.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;

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
 * @author wangqiuye
 */
public class PoiUtil {

    /**
     * 设置字体
     *
     * @param fontName 字体名
     * @param wb       工作簿
     * @return
     */
    public static CellStyle getFont(String fontName, Workbook wb) {
        CellStyle cellStyle = wb.createCellStyle();

        Font font = wb.createFont();
        font.setFontName(fontName);
        font.setFontHeightInPoints((short) 11);

        //设置边框
        cellStyle.setBorderBottom(CellStyle.BORDER_THIN);
        cellStyle.setBorderLeft(CellStyle.BORDER_THIN);
        cellStyle.setBorderRight(CellStyle.BORDER_THIN);
        cellStyle.setBorderTop(CellStyle.BORDER_THIN);
        //
        cellStyle.setFont(font);
        return cellStyle;
    }

    /**
     * 单行单图片
     * 获取Excel的图片数据 只支持Excel2003
     *
     * @param sheet 要获取图片的Excel里的Sheet
     * @param wb    要获取的Excel工作簿 暂时没有使用到
     * @return
     */
    public static Map<Integer, HSSFPictureData> getPicture(HSSFSheet sheet, HSSFWorkbook wb) {
        //获取当前Sheet的图片工具
        HSSFPatriarch drawingPatriarch = sheet.getDrawingPatriarch();
        //获取所有图像
        List<HSSFShape> shapes = drawingPatriarch.getChildren();
        //判断是否有图像 >0代表有图像 然后对其进行处理保存
        Map<Integer, HSSFPictureData> map = new HashMap<>();
        if (shapes.size() > 0) {
            for (HSSFShape sp : shapes) {
                HSSFPicture pic = (HSSFPicture) sp;//强制转换成HSSFPicture
                HSSFPictureData pictureData = pic.getPictureData();//获取图片数据
                HSSFClientAnchor clientAnchor = pic.getPreferredSize();
                int row1 = clientAnchor.getRow1();//获取图片所再行(Row)
                map.put(row1, pictureData);
            }
        }
        return map;
    }

    /**
     * 单行单图片
     * 保存图片 只支持Excel2003
     *
     * @param map      获取的图片数据
     * @param rootPath 指定保存图片根目录 request.getSession().getServletContext().getRealPath("/upload/images/");
     */
    public static Map<Integer, String> savePicture(Map<Integer, HSSFPictureData> map, String rootPath) {
        //设置返回数据
        Map<Integer, String> map1 = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {
            HSSFPictureData pictureData = map.get(i);//获取图片数据
            byte[] data = pictureData.getData();//获取图片的byte[]类型数据
            //设置文件保存路径
            String fileName = UUID.randomUUID() + ".png";
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
                e.printStackTrace();
            }

            map1.put(i, fileName);
        }
        return map1;
    }

    /**
     * 格式化获取的参数 为String
     * 只支持Excel2003
     *
     * @param cell
     * @return
     */
    public static String formatCelll(HSSFCell cell) {
        String str = "";
        if (cell == null) {
            return null;
        }
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_BOOLEAN://把布尔类型转换成String
                str = String.valueOf(cell.getBooleanCellValue());
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if (!HSSFDateUtil.isCellDateFormatted(cell)) {//不是日期类型 把数字转换成String
                    str = String.valueOf(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_STRING:
                str = cell.getStringCellValue();
            default:
                break;
        }
        return str;
    }
}
