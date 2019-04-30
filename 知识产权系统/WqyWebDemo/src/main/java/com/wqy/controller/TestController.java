package com.wqy.controller;

import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.util.PoiPublicUtil;
import cn.afterturn.easypoi.view.PoiBaseView;
import com.wqy.dao.mapper.BrandMapper;
import com.wqy.dao.mapper.PatentMapper;
import com.wqy.entity.*;
import com.wqy.service.TestService;
import com.wqy.util.Results;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试Controller
 */
@Controller
public class TestController {

    @Autowired
    private BrandMapper brandMapper;

    @Autowired
    private PatentMapper patentMapper;

    /**
     * 测试页面跳转test.jsp
     *
     * @return
     */
    @RequestMapping("/test.do")
    public String test() {
        return "test";
    }

    @Resource
    private TestService testService;


    /**
     * 测试Echarts
     * @return
     */
    @RequestMapping("/tt3.do")
    @ResponseBody
    public Map tt3(){
        List<Patent> patents = patentMapper.selectByExample(new PatentExample());
        List<Brand> brands = brandMapper.selectByExample(new BrandExample());
        Map map = new HashMap();
        map.put("zl",patents.size());
        map.put("sb",brands.size());
        return map;
    }

    /**
     * 测试转换JSON
     *
     * @return
     */
    @RequestMapping("/test1.do")
    @ResponseBody
    public User test1() {
        User user = testService.getUserById(1);
        return user;
    }

    /**
     * 测试模拟登陆
     *
     * @return
     */
    @RequestMapping("/testLogin.do")
    @ResponseBody
    public Results testLogin() {
        Results results = new Results();
        results.setMsg("登录成功");
        results.setResult(true);
//       User user = testService.testLogin("wq","123");
        User user = testService.testLogin("", "123");
        results.setObj(user);
        return results;
    }

    /**
     * 测试webUpload 文件上传
     *
     * @return
     */
    @RequestMapping("/testWebUpload.do")
    @ResponseBody
    public Results webUpload(HttpServletRequest request, HttpServletResponse response, String index) throws IOException {
        System.out.println("test文件上传" + index);
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        Map<String, MultipartFile> files = multipartHttpServletRequest.getFileMap();
        //上传到的位置
        String realpath;
        if (index.equals("1")) {
            realpath = request.getSession().getServletContext().getRealPath("/upload/images/");
        } else {
            realpath = request.getSession().getServletContext().getRealPath("/upload/files/");
        }
        //实例化文件夹
        File dir = new File(realpath);
        //如果不存在该文件夹就进行创建
        if (!dir.exists()) {
            dir.mkdir();
        }
        String fileNames = "";
        //进行文件的上传操作 数据转换
        for (MultipartFile file : files.values()) {
            //获取文件名

            String oname = file.getOriginalFilename();
            //把所有文件名以逗号进行拼接
            fileNames = fileNames + "," + oname;
            //创建上传的文件
            File f = new File(realpath, oname);
            //设置bytes
            byte[] buffer = file.getBytes();
            try {
                FileUtils.writeByteArrayToFile(f, buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("sasasas:" + fileNames);
        Results results = new Results();
        results.setResult(true);
        results.setMsg(fileNames);
        results.setObj(index);
        return results;
    }


    private Logger logger = LoggerFactory.getLogger(getClass());
//    @RequestMapping("/testExport111.do")
    public void testExports(ModelMap map, HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        System.out.println("进入测试页面");

        List<Brand> list = brandMapper.selectByExample(new BrandExample());

        ExportParams params = new ExportParams(null, "测试", ExcelType.XSSF);
        map.put(NormalExcelConstants.DATA_LIST, list);
        map.put(NormalExcelConstants.CLASS, Brand.class);
        map.put(NormalExcelConstants.PARAMS, params);
        PoiBaseView.render(map, request, response, NormalExcelConstants.EASYPOI_EXCEL_VIEW);

//        Workbook workbook = ExcelExportUtil.exportExcel(new ExportParams(), Brand.class, list);
//        FileOutputStream fos = new FileOutputStream("D:/testpro/test.xls");
//
////        String fileName = "商标.xls";
////        response.reset();
////        response.setCharacterEncoding("utf-8");
////        response.setHeader("content-type", "application/octet-stream");
////        response.setHeader("Content-Disposition", "attachment; filename=" + URLEncoder.encode(fileName, "UTF-8"));
////        ServletOutputStream out = response.getOutputStream();
//        workbook.write(fos);
//        fos.close();
//
//
//        ImportParams params = new ImportParams();
//        params.setNeedSave(true);
//        List<Brand> result = ExcelImportUtil.importExcel(
//                new File("D:/testpro/test.xls"),
//                Brand.class, params);
//        System.out.println(result.toString());
//        System.out.println(ReflectionToStringBuilder.toString(result.get(0)));

    }
}
