package com.wqy.controller.brand;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.brand.WebBrandInfo;
import com.wqy.service.BrandService;
import com.wqy.util.Results;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Map;

/**
 * 商标Controller
 *
 * @author wangqiuye
 */
@RestController
public class BrandController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private BrandService brandService;

    /**
     * 显示商标库数据/根据条件查询数据
     */
    @PostMapping("/sbList.do")
    public Map list(WebBrandInfo web, EasyUIDataGrid dataGrid) {
        logger.info(web.toString());
        return brandService.list(web, dataGrid);
    }
    /**
     * 新增商标数据
     */
    @RequestMapping("/sbAdd.do")
    @ResponseBody
    public Results add(WebBrandInfo web) throws ParseException {
        return brandService.add(web);
    }

    /**
     * 商标库导出
     */
    @RequestMapping("/sbExport.do")
    public void export(HttpServletRequest request, HttpServletResponse response) throws IOException {
        brandService.exportEX(request, response);
    }

    /**
     * 商标库导入
     */
    @RequestMapping("/sbImport.do")
    @ResponseBody
    public Results importExcel(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MultipartHttpServletRequest multipartRequest;
        multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("excel");

        InputStream is = file.getInputStream();
        String fileName = file.getOriginalFilename();
        brandService.importExcelEX(is, fileName, request);

        Results results = new Results();
        results.setMsg("导入成功！");
        results.setResult(true);
        return results;
    }



    /**
     * 删除商标数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbDel.do")
    @ResponseBody
    public Results del(WebBrandInfo web) {
        return brandService.del(web);
    }

    /**
     * 查询选中的商标数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbSelectById.do")
    @ResponseBody
    public Results selectById(WebBrandInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }

    /**
     * 更新商标数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/sbUpdate.do")
    @ResponseBody
    public Results update(WebBrandInfo web) throws ParseException {
        System.out.println("更新:  " + web.toString());
        return brandService.update(web);
    }
}
