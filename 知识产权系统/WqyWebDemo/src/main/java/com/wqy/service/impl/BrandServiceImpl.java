package com.wqy.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wqy.dao.mapper.*;
import com.wqy.entity.*;
import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.brand.WebBrandInfo;
import com.wqy.service.BrandService;
import com.wqy.util.PoiUtil;
import com.wqy.util.PoiUtilEX;
import com.wqy.util.Results;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.*;

/**
 * 商标库ServiceImpl
 *
 * @author wangqiuye
 */
@Service
public class BrandServiceImpl implements BrandService {
    /**
     * 商标库Dao
     */
    @Autowired
    private BrandMapper brandMapper;
    /**
     * 商标异议Dao
     */
    @Autowired
    private BrandYyMapper brandYyMapper;
    /**
     * 商标撤销Dao
     */
    @Autowired
    private BrandCxMapper brandCxMapper;
    /**
     * 商标诉讼Dao
     */
    @Autowired
    private BrandSsMapper brandSsMapper;
    /**
     * 商标监测Dao
     */
    @Autowired
    private BrandJcMapper brandJcMapper;
    /**
     * 商标使用Dao
     */
    @Autowired
    private BrandSyMapper brandSyMapper;
    /**
     * 商标转让Dao
     */
    @Autowired
    private BrandZrMapper brandZrMapper;
    /**
     * 商标许可Dao
     */
    @Autowired
    private BrandXkMapper brandXkMapper;
    /**
     * 商标提醒事项Dao
     */
    @Autowired
    private BrandNoticeMapper brandNoticeMapper;

    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 查询商标库数据
     *
     * @return
     */
    @Override
    public Map list(WebBrandInfo webBrandInfo, EasyUIDataGrid dataGrid) {
        String str = webBrandInfo.getHid_value_address();
        String[] lists = str.split(",");
        webBrandInfo.setAdds(Arrays.asList(lists));
        //设置分页，一定要再查询之前
        PageHelper.startPage(dataGrid.getPage(), dataGrid.getRows());
        //查询数据

        BrandExample brandExample = new BrandExample();
        BrandExample.Criteria criteria = brandExample.createCriteria();
        /**设置排序*/
        brandExample.setOrderByClause(webBrandInfo.getSort() + " " + webBrandInfo.getOrder());
        /**设置查询条件*/
        if ((!"".equals(webBrandInfo.getHid_value_address()) && webBrandInfo.getHid_value_address() != null)) {
            criteria.andAddressIn(Arrays.asList(lists));
        }
        //商标名称
        if (!StringUtils.isEmpty(webBrandInfo.getBrandName())) {
            criteria.andBrandNameLike("%" + webBrandInfo.getBrandName() + "%");
        }
        //申请号
        if (!StringUtils.isEmpty(webBrandInfo.getApplyNumber())) {
            criteria.andApplyNumberEqualTo(webBrandInfo.getApplyNumber());
        }
        //法律状态
        if (!StringUtils.isEmpty(webBrandInfo.getState())) {
            criteria.andStateEqualTo(webBrandInfo.getState());
        }
        //类别
        if (!StringUtils.isEmpty(webBrandInfo.getCategory())) {
            criteria.andCategoryEqualTo(webBrandInfo.getCategory());
        }
        //保护地域
        if (!StringUtils.isEmpty(webBrandInfo.getProtectedAreas())) {
            criteria.andProtectedAreasEqualTo(webBrandInfo.getProtectedAreas());
        }
        //代理机构
        if (!StringUtils.isEmpty(webBrandInfo.getAgency())) {
            criteria.andAgencyEqualTo(webBrandInfo.getAgency());
        }
        /**查询结果*/
        List<Brand> brands = brandMapper.selectByExample(brandExample);
        //设置查询分页数据 为了获取数据总数
        PageInfo<Brand> pageInfo = new PageInfo(brands);

        /**返回前端*/
        Map map = new HashMap(2);
        map.put("rows", brands);
        map.put("total", pageInfo.getTotal());
        return map;
    }

    /**
     * 导出商标 导出Excel 2003
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String path = request.getSession().getServletContext().getRealPath("/xls/sbExportTemp.xls");
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
        List<Brand> brands = brandMapper.selectByExample(new BrandExample());
        //设置数据
        for (int rowNum = 0; rowNum < brands.size(); rowNum++) {
            HSSFRow row = sheet.createRow(rowNum + 2);
            row.setHeight((short) (30 * 20));
            Brand brand = brands.get(rowNum);
            HSSFCell cell;

            for (int cellNum = 0; cellNum < sheet.getRow(0).getLastCellNum(); cellNum++) {
                cell = row.createCell(cellNum);
                cell.setCellStyle(PoiUtil.getFont("Arial", wb));
                if (cellNum == 0) {
                    cell.setCellValue(brand.getId());//
                }
                if (cellNum == 1) {
                    if (brand.getBrandStyle() != null) {
                        if (!brand.getBrandStyle().equals("")) {
                            //设置图片
//                        //获取图片工具
//                        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();
                            //设置图片来源
                            String filePath = request.getSession().getServletContext().getRealPath("/upload/images/");
                            System.out.println("图片路径：" + filePath + "\\" + brand.getBrandStyle());
                            BufferedImage bufferedImage = ImageIO.read(new File(filePath + "\\" + brand.getBrandStyle()));
                            //设置图片输出
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            //输入转换到输出
                            ImageIO.write(bufferedImage, "png", byteArrayOutputStream);

                            //设置图片存放位置
                            HSSFClientAnchor anchor = new HSSFClientAnchor(0, 0, 0, 0, (short) 1, (rowNum + 2), (short) 2, (rowNum + 3));

                            //打开图片工具导入图片
                            drawingPatriarch.createPicture(anchor, wb.addPicture(byteArrayOutputStream.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));
                        }
                    }

                }
                if (cellNum == 2) {
                    cell.setCellValue(brand.getBrandName());//商标名称
                }
                if (cellNum == 3) {
                    cell.setCellValue(brand.getGroups());//群组
                }
                if (cellNum == 4) {
                    cell.setCellValue(brand.getCategory());//类别
                }
                if (cellNum == 5) {
                    cell.setCellValue(brand.getProtectedAreas());//保护地域
                }
                if (cellNum == 6) {
                    cell.setCellValue(brand.getApplyName());//申请人
                }
                if (cellNum == 7) {
                    cell.setCellValue(brand.getAddress());//操作地
                }
                if (cellNum == 8) {
                    cell.setCellValue(brand.getApplyNumber());//申请号
                }
                if (cellNum == 9) {
                    cell.setCellValue(brand.getApplyDate() == null ? "" : sdf.format(brand.getApplyDate()));//申请日
                }
                if (cellNum == 10) {
                    cell.setCellValue(brand.getNoticeDate() == null ? "" : sdf.format(brand.getNoticeDate()));//初步审定公告日
                }
                if (cellNum == 11) {
                    cell.setCellValue(brand.getZcggr() == null ? "" : sdf.format(brand.getZcggr()));//注册公告日
                }
                if (cellNum == 12) {
                    cell.setCellValue(brand.getRegNumber());//注册号
                }
                if (cellNum == 13) {
                    cell.setCellValue(brand.getDeadline() == null ? "" : sdf.format(brand.getDeadline()));//专利权期限
                }
                if (cellNum == 14) {
                    cell.setCellValue(brand.getState());//法律状态
                }
                if (cellNum == 15) {
                    cell.setCellValue(brand.getSqxmb());//申请项目表
                }
                if (cellNum == 16) {
                    cell.setCellValue(brand.getAgency());//代理机构
                }
                if (cellNum == 17) {
                    cell.setCellValue(brand.getBrandSource());//商标来源
                }
                if (cellNum == 18) {
                    cell.setCellValue(brand.getBz());//备注
                }

            }
        }

        String fileName = "商标.xls";
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
     * 导出商标 导出Excel 2007
     *
     * @param request
     * @param response
     * @throws IOException
     */
    @Override
    public void exportEX(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String path = request.getSession().getServletContext().getRealPath("/xls/sbExport.xlsx");
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
        List<Brand> brands = brandMapper.selectByExample(new BrandExample());
        //设置数据
        for (int rowNum = 0; rowNum < brands.size(); rowNum++) {
            XSSFRow row = sheet.createRow(rowNum + 2);
            row.setHeight((short) (30 * 20));
            Brand brand = brands.get(rowNum);
            XSSFCell cell;

            for (int cellNum = 0; cellNum < sheet.getRow(0).getLastCellNum(); cellNum++) {
                cell = row.createCell(cellNum);
                cell.setCellStyle(PoiUtil.getFont("Arial", wb));
                if (cellNum == 0) {
                    cell.setCellValue(brand.getId());//
                }
                if (cellNum == 1) {
                    if (brand.getBrandStyle() != null) {
                        if (!brand.getBrandStyle().equals("")) {
                            //设置图片
//                        //获取图片工具
//                        HSSFPatriarch drawingPatriarch = sheet.createDrawingPatriarch();
                            //设置图片来源
                            String filePath = request.getSession().getServletContext().getRealPath("/upload/images/");
                            System.out.println("商标图片路径：" + filePath);
                            BufferedImage bufferedImage = ImageIO.read(new File(filePath, brand.getBrandStyle()));
                            //设置图片输出
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            //输入转换到输出
                            ImageIO.write(bufferedImage, "png", byteArrayOutputStream);

                            //设置图片存放位置
                            XSSFClientAnchor anchor = new XSSFClientAnchor(0, 0, 0, 0, (short) 1, (rowNum + 2), (short) 2, (rowNum + 3));

                            //打开图片工具导入图片
                            drawingPatriarch.createPicture(anchor, wb.addPicture(byteArrayOutputStream.toByteArray(), HSSFWorkbook.PICTURE_TYPE_PNG));
                        }
                    }

                }
                if (cellNum == 2) {
                    cell.setCellValue(brand.getBrandName());//商标名称
                }
                if (cellNum == 3) {
                    cell.setCellValue(brand.getGroups());//群组
                }
                if (cellNum == 4) {
                    cell.setCellValue(brand.getCategory());//类别
                }
                if (cellNum == 5) {
                    cell.setCellValue(brand.getProtectedAreas());//保护地域
                }
                if (cellNum == 6) {
                    cell.setCellValue(brand.getApplyName());//申请人
                }
                if (cellNum == 7) {
                    cell.setCellValue(brand.getAddress());//操作地
                }
                if (cellNum == 8) {
                    cell.setCellValue(brand.getApplyNumber());//申请号
                }
                if (cellNum == 9) {
                    cell.setCellValue(brand.getApplyDate() == null ? "" : sdf.format(brand.getApplyDate()));//申请日
                }
                if (cellNum == 10) {
                    cell.setCellValue(brand.getNoticeDate() == null ? "" : sdf.format(brand.getNoticeDate()));//初步审定公告日
                }
                if (cellNum == 11) {
                    cell.setCellValue(brand.getZcggr() == null ? "" : sdf.format(brand.getZcggr()));//注册公告日
                }
                if (cellNum == 12) {
                    cell.setCellValue(brand.getRegNumber());//注册号
                }
                if (cellNum == 13) {
                    cell.setCellValue(brand.getDeadline() == null ? "" : sdf.format(brand.getDeadline()));//专利权期限
                }
                if (cellNum == 14) {
                    cell.setCellValue(brand.getState());//法律状态
                }
                if (cellNum == 15) {
                    cell.setCellValue(brand.getSqxmb());//申请项目表
                }
                if (cellNum == 16) {
                    cell.setCellValue(brand.getAgency());//代理机构
                }
                if (cellNum == 17) {
                    cell.setCellValue(brand.getBrandSource());//商标来源
                }
                if (cellNum == 18) {
                    cell.setCellValue(brand.getBz());//备注
                }

            }
        }

        String fileName = "商标.xlsx";
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
     * 导入商标数据 2003
     *
     * @param is
     * @param fileName
     * @throws IOException
     */
    @Override
    public void importExcel(InputStream is, String fileName, HttpServletRequest request) throws IOException {
        List<Brand> lists = new ArrayList<>();

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
        for (int rowNum = 0; rowNum < sheet.getLastRowNum() + 1; rowNum++) {
            Brand brand = new Brand();
            HSSFRow row = sheet.getRow(rowNum);
            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                HSSFCell cell = row.getCell(colNum);
                if (colNum == 0) {
                    brand.setBrandStyle(map.get(rowNum));//商标标样
                }
                if (colNum == 1) {
                    brand.setBrandName(PoiUtil.formatCelll(cell));//商标名称
                }
                if (colNum == 2) {
                    brand.setGroups(PoiUtil.formatCelll(cell));//群组
                }
                if (colNum == 3) {
                    brand.setCategory(PoiUtil.formatCelll(cell));//类别
                }
                if (colNum == 4) {
                    brand.setProtectedAreas(PoiUtil.formatCelll(cell));//保护地域
                }
                if (colNum == 5) {
                    brand.setApplyName(PoiUtil.formatCelll(cell));//申请人
                }
                if (colNum == 6) {
                    brand.setAddress(PoiUtil.formatCelll(cell));//操作地
                }
                if (colNum == 7) {
                    brand.setApplyNumber(PoiUtil.formatCelll(cell));//申请号
                }
                if (colNum == 8) {
                    brand.setApplyDate(cell.getDateCellValue());//申请日
                }
                if (colNum == 9) {
                    System.out.println(cell.getDateCellValue() == null);
//                    brand.setNoticeDate();//初步审定公告日
                }
                if (colNum == 10) {
                    brand.setZcggr(cell.getDateCellValue());//注册公告日
                }
                if (colNum == 11) {
                    brand.setRegNumber(PoiUtil.formatCelll(cell));//注册号
                }
                if (colNum == 12) {
                    brand.setDeadline(cell.getDateCellValue());//专利权期限
                }
                if (colNum == 13) {
                    brand.setState(PoiUtil.formatCelll(cell));//法律状态
                }
                if (colNum == 14) {
                    brand.setSqxmb(PoiUtil.formatCelll(cell));//申请项目表
                }
                if (colNum == 15) {
                    brand.setAgency(PoiUtil.formatCelll(cell));//代理机构
                }
                if (colNum == 16) {
                    brand.setBrandSource(PoiUtil.formatCelll(cell));//商标来源
                }
                if (colNum == 17) {
                    brand.setBz(PoiUtil.formatCelll(cell));//备注
                }

            }
            brand.setId("i-b-" + UUID.randomUUID().toString());//导入的数据i-b-开头
            lists.add(brand);
        }

        for (int i = 0; i < lists.size(); i++) {
            String pid = lists.get(i).getId();

            //设置商标库
            Brand brand = lists.get(i);


            //设置商标异议
            BrandYy brandYy = new BrandYy();
            brandYy.setId("i-yy-" + UUID.randomUUID());
            brandYy.setPid(pid);

            //设置商标撤销库
            BrandCx brandCx = new BrandCx();
            brandCx.setId("i-cx-" + UUID.randomUUID());//设置ID
            brandCx.setPid(pid);//设置PID

            //设置商标诉讼库
            BrandSs brandSs = new BrandSs();
            brandSs.setId("i-ss-" + UUID.randomUUID());//设置id
            brandSs.setPid(pid);//设置pid


            //设置商标使用
            BrandSy brandSy = new BrandSy();
            brandSy.setId("i-sy-" + UUID.randomUUID());//设置id
            brandSy.setPid(pid);//设置pid

            //设置商标转让
            BrandZr brandZr = new BrandZr();
            brandZr.setId("i-zr" + UUID.randomUUID());//设置id
            brandZr.setPid(pid);//设置pid

            //设置商标许可
            BrandXk brandXk = new BrandXk();
            brandXk.setId("i-xk-" + UUID.randomUUID());//设置id
            brandXk.setPid(pid);//设置pid


            /**
             * 设置商标提醒事项
             */
            BrandNotice brandNotice = new BrandNotice();
            //设置id
            brandNotice.setId("i-notice-" + UUID.randomUUID());
            //设置pid
            brandNotice.setPid(pid);
            //默认关闭
            brandNotice.setEnables("关闭");

            //新增商标库
            brandMapper.insertSelective(brand);
            //新增商标异议
            brandYyMapper.insert(brandYy);
            //新增商标撤销
            brandCxMapper.insertSelective(brandCx);
            //新增商标诉讼
            brandSsMapper.insertSelective(brandSs);
            //新增商标使用
            brandSyMapper.insertSelective(brandSy);
            //新增商标转让
            brandZrMapper.insertSelective(brandZr);
            //新增商标许可
            brandXkMapper.insertSelective(brandXk);
            //新增商标提醒事项
            brandNoticeMapper.insertSelective(brandNotice);

        }
    }

    /**
     * 导入商标数据 2007
     *
     * @param is
     * @param fileName
     * @throws IOException
     */
    @Override
    public void importExcelEX(InputStream is, String fileName, HttpServletRequest request) throws IOException {
        List<Brand> lists = new ArrayList<>();

        //判断Excel版本
        XSSFWorkbook wb = null;

        wb = new XSSFWorkbook(is);//Excel2003
        XSSFSheet sheet = wb.getSheetAt(0);//第一个Sheet
        //获取图片
        Map<Integer, PictureData> picture = PoiUtilEX.getPicture(sheet, wb);
        //保存图片
        String rootPath = request.getSession().getServletContext().getRealPath("/upload/images/");
        Map<Integer, String> map = PoiUtilEX.savePicture(picture, rootPath);

        //导入数据
        for (int rowNum = 1; rowNum < sheet.getLastRowNum() + 1; rowNum++) {
            Brand brand = new Brand();
            XSSFRow row = sheet.getRow(rowNum);

            for (int colNum = 0; colNum < row.getLastCellNum(); colNum++) {
                XSSFCell cell = row.getCell(colNum);
                if (colNum == 0) {
                    //商标标样
                    brand.setBrandStyle(map.get(rowNum));
                }
                if (colNum == 1) {
                    //商标名称
                    brand.setBrandName(cell.getStringCellValue());
                }
                if (colNum == 2) {
                    //群组
                    brand.setGroups(cell.getStringCellValue());
                }
                if (colNum == 3) {
                    //类别
                    brand.setCategory(cell.getStringCellValue());
                }
                if (colNum == 4) {
                    //保护地域
                    brand.setProtectedAreas(cell.getStringCellValue());
                }
                if (colNum == 5) {
                    //申请人
                    brand.setApplyName(cell.getStringCellValue());
                }
                if (colNum == 6) {
                    //操作地
                    brand.setAddress(cell.getStringCellValue());
                }
                if (colNum == 7) {
                    //申请号
                    brand.setApplyNumber(cell.getStringCellValue());
                }
                if (colNum == 8) {
                    if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                        try {
                            brand.setApplyDate(sdf.parse(cell.getStringCellValue()));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                    } else {
                        //申请日
                        brand.setApplyDate(cell.getDateCellValue());
                    }

                }
                if (colNum == 9) {
                    if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                        try {
                            brand.setCbsdggr(sdf.parse(cell.getStringCellValue()));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    } else {
                        //初步审定公告日
                        brand.setCbsdggr(cell.getDateCellValue());
                    }

                }
                if (colNum == 10) {
                    if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                        try {
                            brand.setZcggr(sdf.parse(cell.getStringCellValue()));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }

                    } else {
                        //注册公告日
                        brand.setZcggr(cell.getDateCellValue());
                    }

                }
                if (colNum == 11) {
                    //注册号
                    brand.setRegNumber(cell.getStringCellValue());
                }
                if (colNum == 12) {
                    //专利权期限
                    brand.setDeadline(cell.getDateCellValue());
                }
                if (colNum == 13) {
                    //法律状态
                    brand.setState(cell.getStringCellValue());
                }
                if (colNum == 14) {
                    //申请项目表
                    brand.setSqxmb(cell.getStringCellValue());
                }
                if (colNum == 15) {
                    //代理机构
                    brand.setAgency(cell.getStringCellValue());
                }
                if (colNum == 16) {
                    //商标来源
                    brand.setBrandSource(cell.getStringCellValue());
                }
                if (colNum == 17) {
                    /*备注*/
                    brand.setBz(cell.getStringCellValue());
                }

            }
            System.out.println("第" + rowNum + "行成功！");
            //导入的数据i-b-开头
            brand.setId("i-b-" + UUID.randomUUID().toString());
            lists.add(brand);
        }

        lists.forEach(brand -> {
            String pid = brand.getId();
            //设置商标异议
            BrandYy brandYy = new BrandYy();
            brandYy.setId("i-yy-" + UUID.randomUUID());
            brandYy.setPid(pid);
            //设置商标撤销库
            BrandCx brandCx = new BrandCx();
            brandCx.setId("i-cx-" + UUID.randomUUID());
            brandCx.setPid(pid);
            //设置商标诉讼库
            BrandSs brandSs = new BrandSs();
            brandSs.setId("i-ss-" + UUID.randomUUID());
            brandSs.setPid(pid);
            //设置商标使用
            BrandSy brandSy = new BrandSy();
            brandSy.setId("i-sy-" + UUID.randomUUID());
            brandSy.setPid(pid);
            //设置商标转让
            BrandZr brandZr = new BrandZr();
            brandZr.setId("i-zr" + UUID.randomUUID());
            brandZr.setPid(pid);
            //设置商标许可
            BrandXk brandXk = new BrandXk();
            brandXk.setId("i-xk-" + UUID.randomUUID());
            brandXk.setPid(pid);
            /**
             * 设置商标提醒事项
             */
            BrandNotice brandNotice = new BrandNotice();
            brandNotice.setId("i-notice-" + UUID.randomUUID());
            brandNotice.setPid(pid);
            /*默认关闭*/
            brandNotice.setEnables("关闭");
            if(Optional.ofNullable(brand.getDeadline()).isPresent()){
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(brand.getDeadline());
                calendar.add(Calendar.YEAR, -1);
                brandNotice.setTxrq(calendar.getTime());
            }


            //新增商标库
            brandMapper.insertSelective(brand);
            //新增商标异议
            brandYyMapper.insert(brandYy);
            //新增商标撤销
            brandCxMapper.insertSelective(brandCx);
            //新增商标诉讼
            brandSsMapper.insertSelective(brandSs);
            //新增商标使用
            brandSyMapper.insertSelective(brandSy);
            //新增商标转让
            brandZrMapper.insertSelective(brandZr);
            //新增商标许可
            brandXkMapper.insertSelective(brandXk);
            //新增商标提醒事项
            brandNoticeMapper.insertSelective(brandNotice);
        });

    }


    /**
     * 更新商标数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results update(WebBrandInfo web) throws ParseException {
        logger.info("更新商标信息：" + web.toString());
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        //设置ID
        brand.setId(web.getId());
        //设置商标标样
        brand.setBrandStyle(web.getBrandStyle());
        //设置商标名称
        brand.setBrandName(web.getBrandName());
        //设置群组
        brand.setGroups(web.getGroups());
        //设置商标类别
        brand.setCategory(web.getCategory());
        //保护地域
        brand.setProtectedAreas(web.getProtectedAreas());
        //设置商标申请人
        brand.setApplyName(web.getApplyName());
        //操作地
        brand.setAddress(web.getAddress());
        //设置商标申请号
        brand.setApplyNumber(web.getApplyNumber());
        //设置申请日
        if (!web.getApplyDate().equals("")) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        //设置初审公告日期
        if (!web.getCbsdggr().equals("")) {
            brand.setCbsdggr(sdf.parse(web.getCbsdggr()));
            brand.setNoticeDate(sdf.parse(web.getCbsdggr()));
        }
        //设置注册公告日期
        if (!web.getZcggr().equals("")) {
            brand.setZcggr(sdf.parse(web.getZcggr()));
            brand.setRegDate(sdf.parse(web.getZcggr()));
        }
        //注册号
        brand.setRegNumber(web.getRegNumber());
        //专利权期限
        if (!web.getDeadline().equals("")) {
            brand.setDeadline(sdf.parse(web.getDeadline()));
        }
        //法律状态
        brand.setState(web.getState());
        //申请项目表
        brand.setSqxmb(web.getSqxmb());
        //代理机构
        brand.setAgency(web.getAgency());
        //商标来源
        brand.setBrandSource(web.getBrandSource());
        //备注
        brand.setBz(web.getBz());

        //设置商标异议

        //更新商标库
        int i = brandMapper.updateByPrimaryKeySelective(brand);
        //发送给前端页面的数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("更新了" + i + "条数据");
        return results;
    }

    /**
     * 新增商标数据
     *
     * @param web
     * @return
     * @throws ParseException
     */
    @Override
    public Results add(WebBrandInfo web) throws ParseException {
        String pid = "b-" + UUID.randomUUID();
        //设置日期转换规则
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //设置商标库
        Brand brand = new Brand();
        //设置ID
        brand.setId(pid);
        //设置商标标样
        if (!web.getBrandStyle().equals("")) {
            brand.setBrandStyle(web.getBrandStyle().substring(1, web.getBrandStyle().length()));
        }
        //设置商标名称
        brand.setBrandName(web.getBrandName());
        //设置群组
        brand.setGroups(web.getGroups());
        //设置商标类别
        brand.setCategory(web.getCategory());
        //保护地域
        brand.setProtectedAreas(web.getProtectedAreas());
        //设置商标申请人
        brand.setApplyName(web.getApplyName());
        //操作地
        brand.setAddress(web.getAddress());
        //设置商标申请号
        brand.setApplyNumber(web.getApplyNumber());
        //设置申请日
        if (!web.getApplyDate().equals("")) {
            brand.setApplyDate(sdf.parse(web.getApplyDate()));
        }
        //设置初审公告日期
        if (!web.getCbsdggr().equals("")) {
            brand.setCbsdggr(sdf.parse(web.getCbsdggr()));
            brand.setNoticeDate(sdf.parse(web.getCbsdggr()));
        }
        //设置注册公告日期
        if (!web.getZcggr().equals("")) {
            brand.setZcggr(sdf.parse(web.getZcggr()));
            brand.setRegDate(sdf.parse(web.getZcggr()));
        }
        //注册号
        brand.setRegNumber(web.getRegNumber());
        //专利权期限
        if (!web.getDeadline().equals("")) {
            brand.setDeadline(sdf.parse(web.getDeadline()));
        }
        //法律状态
        brand.setState(web.getState());
        //申请项目表
        brand.setSqxmb(web.getSqxmb());
        //代理机构
        brand.setAgency(web.getAgency());
        //商标来源
        brand.setBrandSource(web.getBrandSource());
        //备注
        brand.setBz(web.getBz());


        //设置商标异议
        BrandYy brandYy = new BrandYy();
        brandYy.setId("yy-" + UUID.randomUUID());
        brandYy.setPid(pid);

        //设置商标撤销
        BrandCx brandCx = new BrandCx();
        brandCx.setId("cx-" + UUID.randomUUID());
        brandCx.setPid(pid);

        //设置商标诉讼
        BrandSs brandSs = new BrandSs();
        brandSs.setId("ss-" + UUID.randomUUID());
        brandSs.setPid(pid);

        //设置商标使用
        BrandSy brandSy = new BrandSy();
        brandSy.setId("sy" + UUID.randomUUID());
        brandSy.setPid(pid);

        //设置商标转让
        BrandZr brandZr = new BrandZr();
        brandZr.setId("zr-" + UUID.randomUUID());
        brandZr.setPid(pid);

        //设置商标许可
        BrandXk brandXk = new BrandXk();
        brandXk.setId("xk-" + UUID.randomUUID());
        brandXk.setPid(pid);

        //设置商标提醒事项
        BrandNotice brandNotice = new BrandNotice();
        brandNotice.setId("notice-" + UUID.randomUUID());
        brandNotice.setPid(pid);

        //新增商标库
        int i = brandMapper.insertSelective(brand);
        //新增商标异议
        brandYyMapper.insert(brandYy);
        //新增商标撤销
        brandCxMapper.insertSelective(brandCx);
        //新增商标诉讼
        brandSsMapper.insertSelective(brandSs);
        //新增商标使用
        brandSyMapper.insertSelective(brandSy);
        //新增商标转让
        brandZrMapper.insertSelective(brandZr);
        //新增商标许可
        brandXkMapper.insertSelective(brandXk);
        //新增商标提醒事项
        brandNoticeMapper.insertSelective(brandNotice);

        //设置返回前端数据
        Results results = new Results();
        results.setResult(true);
        results.setMsg("新增了" + i + "条数据");
        return results;
    }

    /**
     * 删除商标数据
     *
     * @param web
     * @return
     */
    @Override
    public Results del(WebBrandInfo web) {
        int i = brandMapper.deleteByPrimaryKey(web.getId());
        Results results = new Results();
        results.setMsg("删除了" + i + "条数据");
        return results;
    }

}
