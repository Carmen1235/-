package com.wqy.controller.patent;

import com.wqy.model.easyui.EasyUIDataGrid;
import com.wqy.model.WebZLXZ;
import com.wqy.service.PatentRenewalsService;
import com.wqy.util.Results;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller

public class PatentIndemmifcationZLXZController {
    @Resource
    private PatentRenewalsService patentRenewalsService;

    @RequestMapping("/zlxzList.do")
    @ResponseBody
    public Map  selectList(EasyUIDataGrid easyUIDataGrid){
        Map map = patentRenewalsService.selectList(easyUIDataGrid);
        System.out.println(easyUIDataGrid.getPage()+"..........."+easyUIDataGrid.getRows());
        return  map;
    }

    @RequestMapping("/zlxzAdd.do")
    @ResponseBody
    public Results add(WebZLXZ webZLXZ){
        Results results = patentRenewalsService.add(webZLXZ);
//        System.out.println(webZLXZ.toString());
        return  results;
    }

    @RequestMapping("/zlxzDel.do")
    @ResponseBody
    public Results del(@RequestParam(value = "ids") String ids){
        Results results = patentRenewalsService.del(ids);
        return  results;
    }

    @RequestMapping("/zlxzSelect.do")
    @ResponseBody
    public Results select(WebZLXZ webZLXZ){
        Results results = patentRenewalsService.select(webZLXZ);
        System.out.println(webZLXZ.toString());
//        results.setMsg("select");
        return  results;
    }
}
