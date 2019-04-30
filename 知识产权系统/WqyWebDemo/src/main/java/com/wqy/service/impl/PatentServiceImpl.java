package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.patent.WebPatentInfo;
import com.wqy.service.PatentService;
import com.wqy.util.PoiUtil;
import com.wqy.util.PoiUtilEX;
import com.wqy.util.Results;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 专利库ServiceImpl
 */
@Service
public class PatentServiceImpl implements PatentService {
    @Autowired
    private PatentRenewalsNewMapper patentRenewalsNewMapper;//专利续展
    @Autowired
    private PatentMapper patentMapper;//专利
    @Autowired
    private PatentInvalidDeclareMapper patentInvalidDeclareMapper;//专利无效宣告
    @Autowired
    private PatentAcceptMapper patentAcceptMapper;//专利转让
    @Autowired
    private PatentLawsuitMapper patentLawsuitMapper;//专利诉讼

    /**
     * 更新条件查询
     *
     * @param zlSearchPantentName
     * @return
     */
    @Override
    public Results select(String zlSearchPantentName) {
        List<Patent> lists = patentMapper.selectByXX(zlSearchPantentName);
        Results results = new Results();
        Map map = new HashMap();
        map.put("rows", lists);
        map.put("total", lists.size());
        results.setObj(map);
        return results;
    }



    /**
     * 根据条件查询数据/显示数据列表list
     * @param webPatentInfo
     * @param page
     * @param rows
     * @return
     */
    @Override
    public Map listEX(WebPatentInfo webPatentInfo, int page, int rows,String sort,String order) {
        String str = webPatentInfo.getHid_value_address();
        String[] strs = str.split(",");
        webPatentInfo.setAdds(Arrays.asList(strs));
        webPatentInfo.setSort(sort);
        webPatentInfo.setOrder(order);
        PageHelper.startPage(page,rows);

        List<Patent> lists = patentMapper.listEX(webPatentInfo);

        PageInfo<Patent> patentPageInfo = new PageInfo<>(lists);

        Map map = new HashMap();
        map.put("rows",lists);
        map.put("total",patentPageInfo.getTotal());
        return map;
    }

    /**
     * 查询专利库数据
     *
     * @return
     */
    @Override
    public Map list(EasyUIDataGrid easyUIDataGrid, String zlSearchPantentName) {
        int pageNum = easyUIDataGrid.getPage();
        int pageSize = easyUIDataGrid.getRows();
        //设置分页查询，一点要再查询的前面设置
        PageHelper.startPage(pageNum, pageSize);
        List<Patent> patents = patentMapper.selectByXX(zlSearchPantentName);

        //获取分页的数据
        PageInfo<Patent> pageInfo = new PageInfo<>(patents);
        Map map = new HashMap();
        map.put("rows", patents);//获取查询的总数据
        map.put("total", pageInfo.getTotal());//数据总数
        return map;
    }

    /**
     * 导出专利库数据 导出Excel 2003
     *
     * @param request
     * @param response
     */
    @Override
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String path = request.getSession().getServletContext().getRealPath("/xls/zlExportTemp.xls");
        System.out.println("专利导出路径：" + path);
        //读取工作簿
        FileInputStream fis = new FileInputStream(path);
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        fis.close();

        //新建Sheet
        HSSFSheet sheet = wb.getSheetAt(0);
        //
        //获取图片工具
        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();
        //设置表头
        //获取数据
        List<Patent> patents = patentMapper.selectByExample(new PatentExample());
        //设置数据
        for (int rowNum = 0; rowNum < patents.size(); rowNum++) {
            HSSFRow row = sheet.createRow(rowNum + 1);
            row.setHeight((short) (30 * 20));
            Patent patent = patents.get(rowNum);
            HSSFCell cell;

            for (int cellNum = 0; cellNum < sheet.getRow(1).getLastCellNum(); cellNum++) {
                cell = row.createCell(cellNum);
                cell.setCellStyle(PoiUtil.getFont("Arial", wb));
                if (cellNum == 0) {
                    cell.setCellValue(patent.getId());//
                }
                if (cellNum == 1) {
                    cell.setCellValue(patent.getTechnicalClassification());//技术分类
                    System.out.println("技术分类: " + patent.getTechnicalClassification());
                }
                if (cellNum == 2) {
                    cell.setCellValue(patent.getPatentProduct());//专利产品
                }
                if (cellNum == 3) {
                    cell.setCellValue(patent.getPatentNumber());//专利名称
                }
//                if (cellNum == 4) {
//                    if (!patent.getImage().equals("")) {
//                        //设置图片
////                        //获取图片工具
////                        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();
//                        //设置图片来源
//                        String filePath = request.getSession().getServletContext().getRealPath("/upload/images/");
//                        System.out.println("图片路径：" + filePath);
//                        BufferedImage bufferedImage = ImageIO.read(new File(filePath, patent.getImage()));
//                        //设置图片输出
//                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//                        //输入转换到输出
//                        ImageIO.write(bufferedImage, "png", byteArrayOutputStream);
//
//                        //设置图片存放位置
//                        HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 4, (rowNum + 3), (short) 5, (rowNum + 4));
//
//                        //打开图片工具导入图片
//                        drawingPatriarch.createPicture(anchor, wb.addPicture(byteArrayOutputStream.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));
//                    }
//                }
                if (cellNum == 5) {
                    cell.setCellValue(patent.getProtectedAreas());//保护地域
                }
                if (cellNum == 6) {
                    cell.setCellValue(patent.getApplyType());//申请类型
                }
                if (cellNum == 7) {
                    cell.setCellValue(patent.getPatentType());//专利类型
                }
                if (cellNum == 8) {
                    cell.setCellValue(patent.getAddress());//操作地
                }
                if (cellNum == 9) {
                    cell.setCellValue(patent.getApplyDate() == null ? "" : sdf.format(patent.getApplyDate()));//申请日
                }
                if (cellNum == 10) {
                    cell.setCellValue(patent.getApplyName());//申请人
                }
                if (cellNum == 11) {
                    cell.setCellValue(patent.getApplyNumber());//申请号
                }
                if (cellNum == 12) {
                    cell.setCellValue(patent.getGkh());//公开号
                }
                if (cellNum == 13) {
                    cell.setCellValue(patent.getAccreditDate() == null ? "" : sdf.format(patent.getAccreditDate()));//授权公告日
                }
                if (cellNum == 14) {
                    cell.setCellValue(patent.getPatentNumber());//专利号
                }
                if (cellNum == 15) {
                    cell.setCellValue(patent.getPatentEndDate() == null ? "" : sdf.format(patent.getPatentEndDate()));//专利截止日期
                }
                if (cellNum == 16) {
                    cell.setCellValue(patent.getPatentInvalidDate() == null ? "" : sdf.format(patent.getPatentInvalidDate()));//专利失效日期
                }
                if (cellNum == 17) {
                    cell.setCellValue(patent.getState());//法律状态
                }
                if (cellNum == 18) {
                    cell.setCellValue(patent.getEgency());//代理机构
                }
                if (cellNum == 19) {
                    cell.setCellValue(patent.getApplyTable());//申请项目表
                }
                if (cellNum == 20) {
                    cell.setCellValue(patent.getLy());//来源
                }
                if (cellNum == 21) {
                    cell.setCellValue(patent.getBz());//备注
                }
            }
        }

        String fileName = "专利.xls";
        response.reset();
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
        ServletOutputStream out = response.getOutputStream();

        //导出
        wb.write(out);
        out.flush();
        out.close();

    }

    /**
     * 导出专利库数据 导出Excel 2007
     *
     * @param request
     * @param response
     */
    @Override
    public void exportEX(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String path = request.getSession().getServletContext().getRealPath("/xls/zlExport.xlsx");
        System.out.println("专利2007导出路径：" + path);
        //读取工作簿
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        fis.close();

        //新建Sheet
        XSSFSheet sheet = wb.getSheetAt(0);
        //
        //获取图片工具
        XSSFDrawing drawingPatriarch = sheet.createDrawingPatriarch();
        //设置表头
        //获取数据
        List<Patent> patents = patentMapper.selectByExample(new PatentExample());
        //设置数据
        for (int rowNum = 0; rowNum < patents.size(); rowNum++) {
            XSSFRow row = sheet.createRow(rowNum + 2);
            row.setHeight((short) (30 * 20));
            Patent patent = patents.get(rowNum);
            XSSFCell cell;

            for (int cellNum = 0; cellNum < sheet.getRow(1).getLastCellNum(); cellNum++) {
                cell = row.createCell(cellNum);
                cell.setCellStyle(PoiUtil.getFont("Arial", wb));
                if (cellNum == 0) {
                    cell.setCellValue(patent.getId());//
                }
                if (cellNum == 1) {
                    cell.setCellValue(patent.getTechnicalClassification());//技术分类
                }
                if (cellNum == 2) {
                    cell.setCellValue(patent.getPatentProduct());//专利产品
                }
                if (cellNum == 3) {
                    cell.setCellValue(patent.getPatentNumber());//专利名称
                }
                if (cellNum == 4) {
                    if (patent.getImage() != null) {
                        if (!patent.getImage().equals("")) {
                            //设置图片
//                        //获取图片工具
//                        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();
                            //设置图片来源
                            String filePath = request.getSession().getServletContext().getRealPath("/upload/images/");
                            System.out.println("专利图片路径：" + filePath);
                            BufferedImage bufferedImage = ImageIO.read(new File(filePath, patent.getImage()));
                            //设置图片输出
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            //输入转换到输出
                            ImageIO.write(bufferedImage, "png", byteArrayOutputStream);

                            //设置图片存放位置
                            XSSFClientAnchor anchor = new XSSFClientAnchor(0, 0, 0, 0, (short) 4, (rowNum + 2), (short) 5, (rowNum + 3));

                            //打开图片工具导入图片
                            drawingPatriarch.createPicture(anchor, wb.addPicture(byteArrayOutputStream.toByteArray(), XSSFWorkbook.PICTURE_TYPE_PNG));
                        }
                    }

                }
                if (cellNum == 5) {
                    cell.setCellValue(patent.getProtectedAreas());//保护地域
                }
                if (cellNum == 6) {
                    cell.setCellValue(patent.getApplyType());//申请类型
                }
                if (cellNum == 7) {
                    cell.setCellValue(patent.getPatentType());//专利类型
                }
                if (cellNum == 8) {
                    cell.setCellValue(patent.getAddress());//操作地
                }
                if (cellNum == 9) {
                    cell.setCellValue(patent.getApplyDate() == null ? "" : sdf.format(patent.getApplyDate()));//申请日
                }
                if (cellNum == 10) {
                    cell.setCellValue(patent.getApplyName());//申请人
                }
                if (cellNum == 11) {
                    cell.setCellValue(patent.getApplyNumber());//申请号
                }
                if (cellNum == 12) {
                    cell.setCellValue(patent.getGkh());//公开号
                }
                if (cellNum == 13) {
                    cell.setCellValue(patent.getAccreditDate() == null ? "" : sdf.format(patent.getAccreditDate()));//授权公告日
                }
                if (cellNum == 14) {
                    cell.setCellValue(patent.getPatentNumber());//专利号
                }
                if (cellNum == 15) {
                    cell.setCellValue(patent.getPatentEndDate() == null ? "" : sdf.format(patent.getPatentEndDate()));//专利截止日期
                }
                if (cellNum == 16) {
                    cell.setCellValue(patent.getPatentInvalidDate() == null ? "" : sdf.format(patent.getPatentInvalidDate()));//专利失效日期
                }
                if (cellNum == 17) {
                    cell.setCellValue(patent.getState());//法律状态
                }
                if (cellNum == 18) {
                    cell.setCellValue(patent.getEgency());//代理机构
                }
                if (cellNum == 19) {
                    cell.setCellValue(patent.getApplyTable());//申请项目表
                }
                if (cellNum == 20) {
                    cell.setCellValue(patent.getLy());//来源
                }
                if (cellNum == 21) {
                    cell.setCellValue(patent.getBz());//备注
                }
            }
        }

        String fileName = "专利.xlsx";
        response.reset();
        response.setCharacterEncoding("utf-8");
        response.setHeader("content-type", "application/octet-stream");
        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
        ServletOutputStream out = response.getOutputStream();

        //导出
        wb.write(out);
        out.flush();
        out.close();

    }

    /**
     * 导入专利数据 2003
     *
     * @param is
     * @param fileName
     * @throws IOException
     */
    @Override
    public void importExcel(InputStream is, String fileName, HttpServletRequest request) throws IOException {
        List<Patent> lists = new ArrayList<>();

        //判断Excel版本
        HSSFWorkbook wb = null;

        wb = new HSSFWorkbook(is);//Excel2003
        HSSFSheet sheet = wb.getSheetAt(0);//第一个Sheet
        //获取图片
        Map<Integer, HSSFPictureData> picture = PoiUtil.getPicture(sheet, wb);
        //保存图片
        String rootPath = request.getSession().getServletContext().getRealPath("/upload/images/");
        Map<Integer, String> map = PoiUtil.savePicture(picture, rootPath);

        //导入数据
//        for(int i= 0;i<sheet.getLastRowNum();i++){
        System.out.println(sheet.getLastRowNum());

        for (int i = 0; i < sheet.getLastRowNum() + 1; i++) {
            Patent patent = new Patent();
            HSSFRow row = sheet.getRow(i);
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                HSSFCell cell = row.getCell(colNum);
                if (colNum == 0) {
                    patent.setTechnicalClassification(cell.getStringCellValue());//设置技术分类
                }
                if (colNum == 1) {
                    patent.setPatentProduct(cell.getStringCellValue());//设置专利产品
                }
                if (colNum == 2) {
                    patent.setPatentname(cell.getStringCellValue());//设置专利名称
                }
                if (colNum == 3) {
                    System.out.println(map.get(i));
                    if (map.get(i) != null) {
                        patent.setImage(map.get(i));//设置图 示
                    }
                }
                if (colNum == 4) {
                    patent.setProtectedAreas(cell.getStringCellValue());//设置保护地域
                }
                if (colNum == 5) {
                    patent.setApplyType(cell.getStringCellValue());//设置申请类型
                }
                if (colNum == 6) {
                    patent.setPatentType(cell.getStringCellValue());//设置专利类型
                }
                if (colNum == 7) {
                    patent.setAddress(cell.getStringCellValue());//设置操作地
                }
                if (colNum == 8) {
                    patent.setApplyDate(cell.getDateCellValue());//设置申请日
                }
                if (colNum == 9) {
                    patent.setApplyName(cell.getStringCellValue());//设置申请人
                }
                if (colNum == 10) {
                    patent.setApplyNumber(cell.getStringCellValue());//设置申请号
                }
                if (colNum == 11) {
                    patent.setGkh(cell.getStringCellValue());//设置公开号
                }
                if (colNum == 12) {
                    patent.setAccreditDate(cell.getDateCellValue());//设置授权公告日
                }
                if (colNum == 13) {
                    patent.setPatentNumber(cell.getStringCellValue());//设置专利号
                }
                if (colNum == 14) {
                    patent.setPatentEndDate(cell.getDateCellValue());//设置专利截止日
                }
                if (colNum == 15) {
                    patent.setPatentInvalidDate(cell.getDateCellValue());//设置失效日期
                }
                if (colNum == 16) {
                    patent.setState(cell.getStringCellValue());//设置法律状态
                }
                if (colNum == 17) {
                    patent.setEgency(cell.getStringCellValue());//设置代理机构
                }
                if (colNum == 18) {
                    patent.setApplyTable(cell.getStringCellValue());//设置申请项目表
                }
                if (colNum == 19) {
                    patent.setLy(cell.getStringCellValue());//设置来源
                }
                if (colNum == 20) {
                    patent.setBz(cell.getStringCellValue());//设置备注
                }
            }
            patent.setId("i-p-" + UUID.randomUUID().toString());//导入的数据i-p-开头
            lists.add(patent);
        }
        //        }

        for (int i = 0; i < lists.size(); i++) {
            String pid = lists.get(i).getId();
            //新增专利续展
            PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
            patentRenewalsNew.setId("i-xz-" + UUID.randomUUID());//设置id
            patentRenewalsNew.setPid(pid);//设置pid

            //新增专利无效宣告
            PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
            patentInvalidDeclare.setId("i-wx-" + UUID.randomUUID());//设置id
            patentInvalidDeclare.setPid(pid);//设置pid

            //新增专利转让
            PatentAccept patentAccept = new PatentAccept();
            patentAccept.setId("i-zr-" + UUID.randomUUID());//设置id
            patentAccept.setPid(pid);//设置pid


            //新增专利诉讼
            PatentLawsuit patentLawsuit = new PatentLawsuit();
            patentLawsuit.setId("i-ss-" + UUID.randomUUID());//设置id
            patentLawsuit.setPid(pid);//设置pid

            //进行新增操作
            patentMapper.insertSelective(lists.get(i));
            patentRenewalsNewMapper.insertSelective(patentRenewalsNew);
            patentInvalidDeclareMapper.insertSelective(patentInvalidDeclare);
            patentAcceptMapper.insertSelective(patentAccept);
            patentLawsuitMapper.insertSelective(patentLawsuit);
        }

    }

    /**
     * 导入专利数据 2007
     *
     * @param is
     * @param fileName
     * @throws IOException
     */
    @Override
    public void importExcelEX(InputStream is, String fileName, HttpServletRequest request) throws IOException {
        List<Patent> lists = new ArrayList<>();

        //判断Excel版本
        XSSFWorkbook wb = null;

        wb = new XSSFWorkbook(is);//Excel2007
        XSSFSheet sheet = wb.getSheetAt(0);//第一个Sheet
        //获取图片
        Map<Integer, PictureData> picture = PoiUtilEX.getPicture(sheet, wb);
        //保存图片
        String rootPath = request.getSession().getServletContext().getRealPath("/upload/images/");
        Map<Integer, String> map = PoiUtilEX.savePicture(picture, rootPath);

        //导入数据
//        for(int i= 0;i<sheet.getLastRowNum();i++){
        System.out.println(sheet.getLastRowNum());

        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            Patent patent = new Patent();
            XSSFRow row = sheet.getRow(i);
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                XSSFCell cell = row.getCell(colNum);
                if (colNum == 0) {
                    patent.setTechnicalClassification(cell.getStringCellValue());//设置技术分类
                }
                if (colNum == 1) {
                    patent.setPatentProduct(cell.getStringCellValue());//设置专利产品
                }
                if (colNum == 2) {
                    patent.setPatentname(cell.getStringCellValue());//设置专利名称
                }
                if (colNum == 3) {
                    System.out.println(map.get(i));
                    if (map.get(i) != null) {
                        patent.setImage(map.get(i));//设置图 示
                    }
                }
                if (colNum == 4) {
                    patent.setProtectedAreas(cell.getStringCellValue());//设置保护地域
                }
                if (colNum == 5) {
                    patent.setApplyType(cell.getStringCellValue());//设置申请类型
                }
                if (colNum == 6) {
                    patent.setPatentType(cell.getStringCellValue());//设置专利类型
                }
                if (colNum == 7) {
                    patent.setAddress(cell.getStringCellValue());//设置操作地
                }
                if (colNum == 8) {
                    patent.setApplyDate(cell.getDateCellValue());//设置申请日
                }
                if (colNum == 9) {
                    patent.setApplyName(cell.getStringCellValue());//设置申请人
                }
                if (colNum == 10) {
                    patent.setApplyNumber(cell.getStringCellValue());//设置申请号
                }
                if (colNum == 11) {
                    patent.setGkh(cell.getStringCellValue());//设置公开号
                }
                if (colNum == 12) {
                    patent.setAccreditDate(cell.getDateCellValue());//设置授权公告日
                }
                if (colNum == 13) {
                    patent.setPatentNumber(cell.getStringCellValue());//设置专利号
                }
                if (colNum == 14) {
                    patent.setPatentEndDate(cell.getDateCellValue());//设置专利截止日
                }
                if (colNum == 15) {
                    patent.setPatentInvalidDate(cell.getDateCellValue());//设置失效日期
                }
                if (colNum == 16) {
                    patent.setState(cell.getStringCellValue());//设置法律状态
                }
                if (colNum == 17) {
                    patent.setEgency(cell.getStringCellValue());//设置代理机构
                }
                if (colNum == 18) {
                    patent.setApplyTable(cell.getStringCellValue());//设置申请项目表
                }
                if (colNum == 19) {
                    patent.setLy(cell.getStringCellValue());//设置来源
                }
                if (colNum == 20) {
                    patent.setBz(cell.getStringCellValue());//设置备注
                }
            }
            patent.setId("i-p-" + UUID.randomUUID().toString());//导入的数据i-p-开头
            lists.add(patent);
        }
        //        }

        for (int i = 0; i < lists.size(); i++) {
            String pid = lists.get(i).getId();
            //新增专利续展
            PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
            patentRenewalsNew.setId("i-xz2007-" + UUID.randomUUID());//设置id
            patentRenewalsNew.setPid(pid);//设置pid

            //新增专利无效宣告
            PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
            patentInvalidDeclare.setId("i-wx2007-" + UUID.randomUUID());//设置id
            patentInvalidDeclare.setPid(pid);//设置pid

            //新增专利转让
            PatentAccept patentAccept = new PatentAccept();
            patentAccept.setId("i-zr2007-" + UUID.randomUUID());//设置id
            patentAccept.setPid(pid);//设置pid


            //新增专利诉讼
            PatentLawsuit patentLawsuit = new PatentLawsuit();
            patentLawsuit.setId("i-ss2007-" + UUID.randomUUID());//设置id
            patentLawsuit.setPid(pid);//设置pid

            //进行新增操作
            patentMapper.insertSelective(lists.get(i));
            patentRenewalsNewMapper.insertSelective(patentRenewalsNew);
            patentInvalidDeclareMapper.insertSelective(patentInvalidDeclare);
            patentAcceptMapper.insertSelective(patentAccept);
            patentLawsuitMapper.insertSelective(patentLawsuit);
        }

    }

    /**
     * 更新专利数据
     *
     * @param web
     * @return
     */
    @Override
    public Results update(WebPatentInfo web) throws ParseException {
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置专利库
        /**
         * 设置专利
         */
        Patent patent = new Patent();
        patent.setId(web.getId());//设置ID
        //设置
        patent.setTechnicalClassification(web.getTechnicalClassification());//技术分类</th>
        patent.setPatentname(web.getPatentname());//专利名称</th>
        patent.setImage(web.getImage());//图示</th>
        patent.setPatentProduct(web.getPatentProduct());//专利产品</th>
        patent.setApplyType(web.getApplyType());//申请类型</th>
        patent.setProtectedAreas(web.getProtectedAreas());//保护地域</th>
        patent.setPatentType(web.getPatentType());//专利类型</th>
        patent.setAddress(web.getAddress());//操作地</th>
        if (!web.getApplyDate().equals("")) {
            patent.setApplyDate(sdf.parse(web.getApplyDate()));//申请日</th>
        }
        patent.setApplyName(web.getApplyName());//申请人</th>
        patent.setApplyNumber(web.getApplyNumber());//申请号</th>
        patent.setState(web.getState());//法律状态</th>
        if (!web.getAccreditDate().equals("")) {
            patent.setAccreditDate(sdf.parse(web.getAccreditDate()));//授权公告日</th>
        }
        patent.setPatentNumber(web.getPatentNumber());//专利号</th>
        if (!web.getPatentEndDate().equals("")) {
            patent.setPatentEndDate(sdf.parse(web.getPatentEndDate()));//专利截止日期</th>
        }
        if (!web.getPatentInvalidDate().equals("")) {
            patent.setPatentInvalidDate(sdf.parse(web.getAccreditDate()));//专利失效日期</th>
        }
        patent.setEgency(web.getEgency());//代理机构</th>
        if (!web.getPriorityDeadline().equals("")) {
            patent.setPriorityDeadline(sdf.parse(web.getPriorityDeadline()));//优先权截止日期</th>
        }
        patent.setApplyTable(web.getApplyTable());//申请表</th>
        patent.setPatentLevel(web.getPatentLevel());//专利分级</th>
//            patent.setVettingProcess(web.getVettingProcess());//审查过程</th>

        //更新专利库
        int i = patentMapper.updateByPrimaryKeySelective(patent);
        //更新专利转让库
        //设置发送给页面数据结果
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;

    }

    @Override
    public Results add(WebPatentInfo web) throws ParseException {
        String pid = "p-" + UUID.randomUUID();//获取PID
        Results results = new Results();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//设置转换Date规则

            /**
             * 设置专利
             */
            Patent patent = new Patent();
            patent.setId(pid);//设置ID
            //设置
            patent.setTechnicalClassification(web.getTechnicalClassification());//技术分类</th>
            patent.setPatentname(web.getPatentname());//专利名称</th>
            patent.setImage(web.getImage());//图示</th>
            patent.setPatentProduct(web.getPatentProduct());//专利产品</th>
            patent.setApplyType(web.getApplyType());//申请类型</th>
            patent.setProtectedAreas(web.getProtectedAreas());//保护地域</th>
            patent.setPatentType(web.getPatentType());//专利类型</th>
            patent.setAddress(web.getAddress());//操作地</th>
            if (!web.getApplyDate().equals("")) {
                patent.setApplyDate(sdf.parse(web.getApplyDate()));//申请日</th>
            }
            patent.setApplyName(web.getApplyName());//申请人</th>
            patent.setApplyNumber(web.getApplyNumber());//申请号</th>
            patent.setState(web.getState());//法律状态</th>
            if (!web.getAccreditDate().equals("")) {
                patent.setAccreditDate(sdf.parse(web.getAccreditDate()));//授权公告日</th>
            }
            patent.setPatentNumber(web.getPatentNumber());//专利号</th>
            if (!web.getPatentEndDate().equals("")) {
                patent.setPatentEndDate(sdf.parse(web.getPatentEndDate()));//专利截止日期</th>
            }
            if (!web.getPatentInvalidDate().equals("")) {
                patent.setPatentInvalidDate(sdf.parse(web.getAccreditDate()));//专利失效日期</th>
            }
            patent.setEgency(web.getEgency());//代理机构</th>
            if (!web.getPriorityDeadline().equals("")) {
                patent.setPriorityDeadline(sdf.parse(web.getPriorityDeadline()));//优先权截止日期</th>
            }
            if (web.getApplyTable()!=null) {
                patent.setApplyTable(web.getApplyTable().substring(1, web.getApplyTable().length()));//申请表</th>
            }
            patent.setPatentLevel(web.getPatentLevel());//专利分级</th>
//            patent.setVettingProcess(web.getVettingProcess());//审查过程</th>
            /**
             * 专利续展
             */
            //新增专利续展
            PatentRenewalsNew patentRenewalsNew = new PatentRenewalsNew();
            patentRenewalsNew.setId("xz-" + UUID.randomUUID());//设置id
            patentRenewalsNew.setPid(pid);//设置pid

            /**
             * 专利无效宣告
             */
            //新增专利无效宣告
            PatentInvalidDeclare patentInvalidDeclare = new PatentInvalidDeclare();
            patentInvalidDeclare.setId("wx-" + UUID.randomUUID());//设置id
            patentInvalidDeclare.setPid(pid);//设置pid

            /**
             * 专利转让
             */
            //新增专利转让
            PatentAccept patentAccept = new PatentAccept();
            patentAccept.setId("zr-" + UUID.randomUUID().toString());//设置id
            patentAccept.setPid(pid);//设置pid

            /**
             * 专利诉讼
             */
            //新增专利诉讼
            PatentLawsuit patentLawsuit = new PatentLawsuit();
            patentLawsuit.setId("ss-" + UUID.randomUUID());//设置id
            patentLawsuit.setPid(pid);//设置pid


            int i = patentMapper.insertSelective(patent);
            patentRenewalsNewMapper.insertSelective(patentRenewalsNew);
            patentInvalidDeclareMapper.insertSelective(patentInvalidDeclare);
            patentAcceptMapper.insertSelective(patentAccept);
            patentLawsuitMapper.insertSelective(patentLawsuit);

            results.setMsg("新增了" + i + "条数据");
            results.setResult(true);


        return results;
    }

    /**
     * 删除专利库数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebPatentInfo web) {
        patentMapper.deleteByPrimaryKey(web.getId());
        Results r = new Results();
        r.setMsg("删除了1条数据");
        r.setResult(true);
        return r;
    }


}
