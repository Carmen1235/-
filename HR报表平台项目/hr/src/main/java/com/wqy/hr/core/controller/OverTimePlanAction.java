package com.wqy.hr.core.controller;

import com.wqy.hr.core.service.ESSServer;
import com.wqy.hr.core.util.ExcelUtil;
import com.wqy.hr.core.util.ExportFileUtil;
import com.wqy.hr.core.vo.PageVO;
import com.wqy.hr.core.vo.RequestOverTimePlan;
import com.wqy.hr.core.vo.ResponseJson;
import com.wqy.hr.core.vo.ResponseOverTimePlan;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author 王秋叶
 * @create 2019-02-20 10:03
 * @desc
 **/
@Controller
@RequestMapping("/otp")
@Slf4j
public class OverTimePlanAction {

    @Autowired
    private ESSServer server;


    @GetMapping("/page")
    @ResponseBody
    public ResponseJson getInfo(RequestOverTimePlan vo, PageVO pageVO){
        if(StringUtils.isEmpty(vo.getDepartmentId())){
            return ResponseJson.success("");
        }
        return server.getResultByVo(vo,pageVO);
    }

    @GetMapping("/export")
    public void export(RequestOverTimePlan vo, HttpServletRequest request, HttpServletResponse response) throws IOException {

        ResponseJson resultByVo = server.getResultByVo(vo);
        List<ResponseOverTimePlan> data = (List<ResponseOverTimePlan>) resultByVo.getData();

        String dirPath = "C:\\";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String format = sdf.format(new Date());
        String filePath = dirPath+format+ "加班计划申请.xlsx";
        ExcelUtil.otpExcel(data,filePath);

        ExportFileUtil.export(filePath,response,"加班计划申请");
        new File(filePath).delete();
    }

    @GetMapping("/print")
    public void print(RequestOverTimePlan vo, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ResponseJson resultByVo = server.getResultByVo(vo);

        String dirPath = "C:\\";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String format = sdf.format(new Date());
//        String filePath = dirPath+format+"加班计划申请打印文件.xlsx";
        String filePath = "加班计划申请打印文件.xlsx";
        ExcelUtil.otpPrint((List<ResponseOverTimePlan>) resultByVo.getData(),filePath);

        ExportFileUtil.export(filePath,response,"加班计划申请打印文件");

        File file = new File(filePath);
        System.out.println(file.getPath());
        if(!file.delete()){
            System.gc();
            boolean b = file.delete();
            System.out.println(b);
        }


    }


}
