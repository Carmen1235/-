package com.wqy.controller.base;

import com.wqy.util.Export;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文件导出
 */
@Controller
public class ExportController {

    @RequestMapping("/testExport.do")
    public void export(HttpServletRequest request, HttpServletResponse response, String fileName) throws IOException {
        String imagePath = request.getSession().getServletContext().getRealPath("/upload/images/ok.png");
        //
        Export.export(imagePath);
    }
}
