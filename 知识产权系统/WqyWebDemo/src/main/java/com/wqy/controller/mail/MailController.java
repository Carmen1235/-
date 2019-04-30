package com.wqy.controller.mail;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.WebMailInfo;
import com.wqy.service.MailService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * @author WordK 王秋叶
 * @create 2018-07-04 15:22
 * @desc 邮件Controller
 **/
@Controller
public class MailController {
    @Autowired
    private MailService mailService;
    /**
     * 显示邮箱数据
     * @return
     */
    @RequestMapping("/mailList.do")
    @ResponseBody
    public Map list(EasyUIDataGrid easyUIDataGrid){
        return mailService.list(easyUIDataGrid);
    }

    /**
     * 更新商标提醒数据
     * @param web
     * @return
     * @throws ParseException
     */
    @RequestMapping("/mailUpdate.do")
    @ResponseBody
    public Results update(WebMailInfo web) throws ParseException {
        System.out.println("更新:  "+web.toString());
        return mailService.update(web);
    }

    /**
     * 查询选中的商标提醒数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/mailSelectById.do")
    @ResponseBody
    public Results selectById(WebMailInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }
}
