package com.wqy.hr.core.util;

import com.wqy.hr.core.vo.ResponseOverTime;
import com.wqy.hr.core.vo.ResponseOverTimePlan;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.util.ResourceUtils;
import org.thymeleaf.spring5.context.SpringContextUtils;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.*;
import java.util.List;

/**
 * @author 王秋叶
 * @create 2019-02-22 10:04
 * @desc
 **/
@Slf4j
public class ExcelUtil {

    public static void main(String[] args) throws IOException {

    }


    private static  final String TEMP_PATH = "E:\\test\\otp.xlsx";
    private static final String[] OTP_HEADER = {"工号","姓名","部门","职位","加班类型","加班归属日期","开始日期","开始时间","结束日期","结束时间","扣除用餐时间","计划调休","加班原因"};
    private static final String[] OT_HEADER = {"序号","工号","姓名","加班类型","开始日期","开始时间","结束日期","结束时间","是否计划调休","扣除用餐时间","备注"};

    public static void otpExcel(List<ResponseOverTimePlan> list,String filePath) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFCellStyle cellStyle = ExcelUtil.setFontStyle(workbook);

        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        int length = OTP_HEADER.length;
        for(int i = 0;i<=length-1;i++){
            XSSFCell cell = row.createCell(i);
            cell.setCellValue(OTP_HEADER[i]);
            cell.setCellStyle(cellStyle);
        }
        List<List<String>> list1 = convertToList(list);
        for(int i = 0;i<=list.size()-1;i++){
            XSSFRow row1 = sheet.createRow(i + 1);
            List<String> strings = list1.get(i);
            for(int j = 0;j<=strings.size()-1;j++){
                XSSFCell cell = row1.createCell(j);
                cell.setCellValue(strings.get(j));
                cell.setCellStyle(cellStyle);
            }
        }

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
    }

    public static void otExcel(List<ResponseOverTime> list, String filePath) throws IOException{
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFCellStyle cellStyle = ExcelUtil.setFontStyle(workbook);


        XSSFSheet sheet = workbook.createSheet();
        XSSFRow row = sheet.createRow(0);
        int length = OT_HEADER.length;
        for(int i = 0;i<=length-1;i++){
            XSSFCell cell = row.createCell(i);
            cell.setCellValue(OT_HEADER[i]);
            cell.setCellStyle(cellStyle);
        }
        List<List<String>> list1 = convertToList2(list);
        for(int i = 0;i<=list.size()-1;i++){
            XSSFRow row1 = sheet.createRow(i + 1);
            List<String> strings = list1.get(i);
            for(int j = 0;j<=strings.size()-1;j++){
                XSSFCell cell = row1.createCell(j);
                cell.setCellValue(strings.get(j));
                cell.setCellStyle(cellStyle);
            }
        }

        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        outputStream.close();
    }

    public static void otpPrint(List<ResponseOverTimePlan> list, String filePath) throws IOException{

        FileInputStream fis = new FileInputStream(TEMP_PATH);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheetAt = workbook.getSheetAt(0);
        XSSFRow row = sheetAt.getRow(1);
        row.getCell(10).setCellValue("日期："+ LocalDate.now().toString());
        List<List<String>> lists = convertToList3(list);
        for(int i = 3,j=0;i<=lists.size()+3-1;i++,j++){
            XSSFRow listRow = sheetAt.createRow(i);
            List<String> strings = lists.get(j);
            for(int x =0;x<=strings.size()-1;x++){
                XSSFCell cell = listRow.createCell(x);
                cell.setCellValue(strings.get(x));
                cell.setCellStyle(ExcelUtil.setFontStyle(workbook));
            }
        }
        XSSFRow endRow = sheetAt.createRow(lists.size()+3+4);
        endRow.createCell(0).setCellValue("批准：");
        endRow.createCell(5).setCellValue("审核：");
        endRow.createCell(12).setCellValue("制表：");
        workbook.write(new FileOutputStream(filePath));
        workbook.close();
    }


    public static List<List<String>> convertToList(List<ResponseOverTimePlan> list){
        List<List<String>> resList = new ArrayList();
        list.forEach(e->{
            List<String> list1 = new ArrayList<>();
            list1.add(e.getCode());
            list1.add(e.getName());
            list1.add(e.getDepartmentName());
            list1.add(e.getJobName());
            list1.add(e.getType());
            list1.add(e.getVDay());
            list1.add(e.getSDay());
            list1.add(e.getSTime());
            list1.add(e.getEDay());
            list1.add(e.getETime());
            list1.add(e.getIsMeals());
            list1.add(e.getIsPlan());
            list1.add(e.getResult());
            resList.add(list1);
        });
        return resList;
    }
    public static List<List<String>> convertToList2(List<ResponseOverTime> list){
        List<List<String>> resList = new ArrayList();
        list.forEach(e->{
            List<String> list1 = new ArrayList<>();
            list1.add("");
            list1.add(e.getCode());
            list1.add(e.getName());
            list1.add(e.getType());
            list1.add(e.getSDay());
            list1.add(e.getSTime());
            list1.add(e.getEDay());
            list1.add(e.getETime());
            list1.add(e.getIsPlan());
            list1.add(e.getIsMeals());
            list1.add("Excel导入");
            resList.add(list1);
        });
        return resList;
    }
    public static List<List<String>> convertToList3(List<ResponseOverTimePlan> list){
        List<List<String>> resList = new ArrayList();
        list.forEach(e->{
            List<String> list1 = new ArrayList<>();
            list1.add(e.getCode());
            list1.add(e.getName());
            list1.add(e.getDepartmentName());
            list1.add(e.getJobName());
            list1.add(e.getType());
            list1.add(e.getVDay());
            list1.add(e.getSDay());
            list1.add(e.getSTime());
            list1.add(e.getEDay());
            list1.add(e.getETime());
            list1.add(e.getIsMeals());
            list1.add(e.getIsPlan());
            list1.add(e.getResult());
            list1.add("");
            resList.add(list1);
        });
        return resList;
    }


    public static XSSFCellStyle setFontStyle(XSSFWorkbook workbook){
        XSSFCellStyle cellStyle = workbook.createCellStyle();
        XSSFFont font = workbook.createFont();
        font.setFontName("黑体");
        font.setFontHeightInPoints((short)8);
        cellStyle.setFont(font);

        cellStyle.setBorderBottom(BorderStyle.THIN);
        cellStyle.setBorderTop(BorderStyle.THIN);
        cellStyle.setBorderRight(BorderStyle.THIN);
        cellStyle.setBorderLeft(BorderStyle.THIN);
        cellStyle.setWrapText(true);
        return cellStyle;
    }
}
