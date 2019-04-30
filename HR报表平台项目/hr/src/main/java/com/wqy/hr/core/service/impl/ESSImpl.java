package com.wqy.hr.core.service.impl;

import com.wqy.hr.core.entity.primary.Department;
import com.wqy.hr.core.entity.primary.Employee;
import com.wqy.hr.core.service.abs.AbstractESS;
import com.wqy.hr.core.vo.*;
import org.springframework.data.domain.Page;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:46
 * @desc
 **/
public class ESSImpl extends AbstractESS {

    @Override
    public List<ResponseOverTimePlan> findByCondition(RequestOverTimePlan vo) {
        String[] split = vo.getDepartmentId().split(",");
        Set<String> dIds = new HashSet<>();
        for (int i = 0; i <= split.length - 1; i++) {
            dIds.add(split[i]);
        }
        List<Employee> employees = employee.getListByDepartmentIdInAndState(dIds, states);
        return this.getResult(employees, vo);
    }

    @Override
    public List<ResponseOverTime> findOTByCondition(RequestOverTime vo) {
        List<Employee> employees = employee.getListByDepartmentIdAndState(vo.getDepartmentId(), states);
        return this.getResult2(employees, vo);
    }


    protected ResponseJson findByCondition(RequestOverTimePlan vo, PageVO pageVO) {
        String[] split = vo.getDepartmentId().split(",");
        Set<String> dIds = new HashSet<>();
        for (int i = 0; i <= split.length - 1; i++) {
            dIds.add(split[i]);
        }
        Page<Employee> page = employee.getListPageByDepartmentIdInAndState(dIds, states, pageVO);
        List<Employee> employees = page.getContent();
        ResponseJson responseJson = new ResponseJson();
        responseJson.setCount(page.getTotalElements());
        responseJson.setData(this.getResult(employees, vo));
        return responseJson;
    }

    protected ResponseJson findOTByCondition(RequestOverTime vo, PageVO pageVO) {
        Page<Employee> page = employee.getListPageByDepartmentIdAndState(vo.getDepartmentId(), states, pageVO);
        List<Employee> employees = page.getContent();
        ResponseJson responseJson = new ResponseJson();
        responseJson.setCount(page.getTotalElements());
        responseJson.setData(this.getResult2(employees, vo));
        return responseJson;
    }

    private List<ResponseOverTimePlan> getResult(List<Employee> employees, RequestOverTimePlan vo) {


        List<ResponseOverTimePlan> list = new ArrayList<>();
        employees.forEach(e -> {
            String jobName = job.getOne(e.getJobId()).getName();
            String dName = department.getByDid(e.getDepartmentId()).getName();
            ResponseOverTimePlan request = new ResponseOverTimePlan(
                    e.getCode(),
                    e.getCnName(),
                    chenckIsNull(dName),
                    chenckIsNull(jobName),
                    chenckIsNull(vo.getType()),
                    chenckIsNull(vo.getVDay()),
                    chenckIsNull(vo.getSDay()),
                    chenckIsNull(vo.getSTime()),
                    chenckIsNull(vo.getEDay()),
                    chenckIsNull(vo.getETime()),
                    chenckIsNull(vo.getIsMeals()),
                    chenckIsNull(vo.getIsPlan()),
                    chenckIsNull(vo.getResult())
            );
            list.add(request);
        });
        return list;
    }

    private List<ResponseOverTime> getResult2(List<Employee> employees, RequestOverTime vo) {
        List<ResponseOverTime> list = new ArrayList<>();
        employees.forEach(e -> {
            ResponseOverTime request = new ResponseOverTime(
                    e.getCode(),
                    e.getCnName(),
                    "",
                    "",
                    chenckIsNull(vo.getType()),
                    chenckIsNull(vo.getVDay()),
                    chenckIsNull(vo.getSDay()),
                    chenckIsNull(vo.getSTime()),
                    chenckIsNull(vo.getEDay()),
                    chenckIsNull(vo.getETime()),
                    chenckIsNull(vo.getIsMeals()),
                    chenckIsNull(vo.getIsPlan()),
                    chenckIsNull(vo.getResult())
            );
            list.add(request);
        });
        return list;
    }


}
