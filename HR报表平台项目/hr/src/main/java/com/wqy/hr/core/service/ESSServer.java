package com.wqy.hr.core.service;

import com.wqy.hr.core.service.impl.ESSImpl;
import com.wqy.hr.core.vo.PageVO;
import com.wqy.hr.core.vo.RequestOverTime;
import com.wqy.hr.core.vo.RequestOverTimePlan;
import com.wqy.hr.core.vo.ResponseJson;
import org.springframework.stereotype.Service;

/**
 * @author 王秋叶
 * @create 2019-02-20 9:59
 * @desc
 **/
@Service
public class ESSServer extends ESSImpl {

    public ResponseJson getResultByVo(RequestOverTimePlan vo){
        return ResponseJson.success(this.findByCondition(vo));
    }
    public ResponseJson getResultByVo(RequestOverTimePlan vo, PageVO pageVO){
        return this.findByCondition(vo,pageVO);
    }


    public ResponseJson getOTResultByVo(RequestOverTime vo, PageVO pageVO){
        return this.findOTByCondition(vo,pageVO);
    }
    public ResponseJson getOTResultByVo(RequestOverTime vo){
        return ResponseJson.success(this.findOTByCondition(vo));
    }

}
