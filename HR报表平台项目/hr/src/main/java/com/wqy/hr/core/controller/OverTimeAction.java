package com.wqy.hr.core.controller;

import com.wqy.hr.core.service.ESSServer;
import com.wqy.hr.core.util.ExcelUtil;
import com.wqy.hr.core.util.ExportFileUtil;
import com.wqy.hr.core.vo.*;
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
@RequestMapping("/ot")
@Slf4j
public class OverTimeAction {

    @Autowired
    private ESSServer server;


    @GetMapping("/page")
    @ResponseBody
    public ResponseJson getInfo(RequestOverTime vo, PageVO pageVO){
        if(StringUtils.isEmpty(vo.getDepartmentId())){
            return ResponseJson.success("");
        }
        return server.getOTResultByVo(vo,pageVO);
    }
    @GetMapping("/export")
    public void export(RequestOverTime vo, HttpServletRequest request, HttpServletResponse response) throws IOException {

        ResponseJson resultByVo = server.getOTResultByVo(vo);
        List<ResponseOverTime> data = (List<ResponseOverTime>) resultByVo.getData();

        String dirPath = "C:\\";


        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String format = sdf.format(new Date());
        String filePath = dirPath+format+ "加班申请.xlsx";
        ExcelUtil.otExcel(data,filePath);

        ExportFileUtil.export(filePath,response,"加班申请");
        new File(filePath).delete();
    }
}
