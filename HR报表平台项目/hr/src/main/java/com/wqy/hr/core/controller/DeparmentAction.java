package com.wqy.hr.core.controller;

import com.wqy.hr.core.service.inf.IDepartment;
import com.wqy.hr.core.vo.ResponseJson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author 王秋叶
 * @create 2019-02-20 14:56
 * @desc
 **/
@RestController
@RequestMapping("/department")
@Slf4j
public class DeparmentAction {

    @Autowired
    private IDepartment iDepartment;

    @GetMapping("/load")
    public ResponseJson loadByKeyword(@RequestParam(defaultValue = "") String keyword){
        return iDepartment.load(keyword);
    }



}
