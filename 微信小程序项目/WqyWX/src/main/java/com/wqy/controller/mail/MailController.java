package com.wqy.controller.mail;

import cn.afterturn.easypoi.entity.vo.NormalExcelConstants;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import cn.afterturn.easypoi.view.PoiBaseView;
import com.wqy.pojo.IdeaDO;
import com.wqy.service.IdeaService;
import com.wqy.service.MailService;
import com.wqy.vo.MailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:17
 * @desc 总经理信箱 Controller
 **/
@Controller("mailController")
public class MailController {
    /**
     * 注入ideaService
     */
    @Autowired
    private IdeaService ideaService;

    @Autowired
    private MailService mailService;


    /**
     * 显示idea数据列表
     *
     * @param page 网页端发送页码
     * @param rows 网页端发送的行数
     * @return
     */
    @RequestMapping("messageList.do")
    @ResponseBody
    public Map list(MailVO mailVO, int page, int rows) throws ParseException {
        Map list = null;
        System.out.println(mailVO.toString());

        if (mailVO.getUsername() == null & mailVO.getSort() == null & mailVO.getDepartment() == null & mailVO.getCreateDateStart() == null & mailVO.getCreateDateEnd() == null) {
            list = ideaService.list(page, rows);
            return list;
        }

        list = ideaService.list(mailVO, page, rows);
        return list;
    }

    /**
     * 根据查询条件导出数据
     * @param mailVO
     * @param map
     * @param request
     * @param response
     */
    @RequestMapping("export.do")
    public void export(MailVO mailVO, ModelMap map, HttpServletRequest request, HttpServletResponse response) throws ParseException {
        List<IdeaDO> list = mailService.export(mailVO);
        ExportParams params = new ExportParams("汇总", "汇总1", ExcelType.XSSF);
        params.setFreezeCol(1);
        map.put(NormalExcelConstants.DATA_LIST, list);
        map.put(NormalExcelConstants.CLASS, IdeaDO.class);
        map.put(NormalExcelConstants.PARAMS, params);
        PoiBaseView.render(map, request, response, NormalExcelConstants.EASYPOI_EXCEL_VIEW);
    }
}
