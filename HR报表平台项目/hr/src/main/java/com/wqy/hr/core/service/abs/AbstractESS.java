package com.wqy.hr.core.service.abs;

import com.wqy.hr.core.service.inf.ICorporation;
import com.wqy.hr.core.service.inf.IDepartment;
import com.wqy.hr.core.service.inf.IEmployee;
import com.wqy.hr.core.service.inf.IJob;
import com.wqy.hr.core.vo.RequestOverTime;
import com.wqy.hr.core.vo.RequestOverTimePlan;
import com.wqy.hr.core.vo.ResponseOverTime;
import com.wqy.hr.core.vo.ResponseOverTimePlan;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:33
 * @desc
 **/
public abstract class AbstractESS {
    protected final static Set<String> states= new HashSet<>();

    static {
        states.add("EmployeeState1001");
        states.add("EmployeeState2001");
        states.add("EmployeeState4001");
    }

    @Autowired
    protected ICorporation corporation;
    @Autowired
    protected IDepartment department;
    @Autowired
    protected IEmployee employee;
    @Autowired
    protected IJob job;

    public abstract List<ResponseOverTimePlan> findByCondition(RequestOverTimePlan vo);
    public abstract List<ResponseOverTime> findOTByCondition(RequestOverTime vo);

    public String chenckIsNull(String str){
        return Optional.ofNullable(str).orElse("无");
    }
}
