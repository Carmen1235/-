package com.wqy.controller.idea;

import com.wqy.service.IdeaService;
import com.wqy.util.JsonResult;
import com.wqy.vo.IdeaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * @author 王秋叶
 * @create 2018-08-08 10:17
 * @desc 意见/建议 Controller
 **/
@Controller("ideaController")
public class IdeaController {

    /**
     * 注入 意见/建议 Service
     */
    @Autowired
    private IdeaService ideaService;

    /**
     * 新增 意见/建议
     * @param ideaVO 前端 意见/建议 实体
     */
    @RequestMapping("/ideaAdd.do")
    @ResponseBody
    public JsonResult add(HttpServletRequest request, IdeaVO ideaVO) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");
        System.out.println("接收的数据："+ideaVO.toString());
        JsonResult result = ideaService.add(ideaVO);
        return result;
    }


}
