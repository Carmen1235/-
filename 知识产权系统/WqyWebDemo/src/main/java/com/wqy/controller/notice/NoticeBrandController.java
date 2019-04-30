package com.wqy.controller.notice;

import com.wqy.model.notice.WebNoticeBrandInfo;
import com.wqy.service.NoticeBrandService;
import com.wqy.util.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.util.Map;

/**
 * 商标提醒Controller
 */
@Controller
public class NoticeBrandController {

    @Autowired
    private NoticeBrandService noticeBrandService;


    /**
     * 显示商标提醒数据
     * @return
     */
    @RequestMapping("/txssList.do")
    @ResponseBody
    public Map listEX(WebNoticeBrandInfo webNoticeBrandInfo,int page,int rows) throws ParseException {
        return noticeBrandService.listEX(webNoticeBrandInfo,page,rows);
    }

    /**
     * 更新商标提醒数据
     * @param web
     * @return
     * @throws ParseException
     */
    @RequestMapping("/txssUpdate.do")
    @ResponseBody
    public Results update(WebNoticeBrandInfo web) throws ParseException {
        System.out.println("更新:  "+web.toString());
        return noticeBrandService.update(web);
    }

    /**
     * 查询选中的商标提醒数据
     *
     * @param web
     * @return
     */
    @RequestMapping("/txssSelectById.do")
    @ResponseBody
    public Results selectById(WebNoticeBrandInfo web) {
        Results results = new Results();
        results.setObj(web);
        return results;
    }
}
