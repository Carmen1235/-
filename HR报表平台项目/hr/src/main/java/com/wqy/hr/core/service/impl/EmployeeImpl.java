package com.wqy.hr.core.service.impl;

import com.wqy.hr.core.dao.primary.EmployeeDao;
import com.wqy.hr.core.entity.primary.Employee;
import com.wqy.hr.core.service.inf.IEmployee;
import com.wqy.hr.core.vo.PageVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:13
 * @desc
 **/
@Slf4j
@Service
public class EmployeeImpl implements IEmployee {

    @Autowired
    private EmployeeDao employeeDao;

    public void findAll(){
        List<Employee> all = employeeDao.findAll();
        log.info("数量："+all.size());
    }


    @Override
    public List<Employee> getListByDepartmentIdAndState(String departmentId, Set<String> states) {
        return employeeDao.findAllByDepartmentIdAndEmployeeStateIdIn(departmentId,states);
    }

    @Override
    public List<Employee> getListByDepartmentIdInAndState(Set<String> dIds, Set<String> states) {
        return employeeDao.findAllByDepartmentIdInAndEmployeeStateIdIn(dIds,states);
    }

    @Override
    public Page<Employee> getListPageByDepartmentIdAndState(String departmentId, Set<String> states, PageVO pageVO) {
        Page<Employee> page = employeeDao.findAllByDepartmentIdAndEmployeeStateIdIn(departmentId, states, PageRequest.of(pageVO.getPage() - 1, pageVO.getLimit()));
        return page;
    }

    @Override
    public Page<Employee> getListPageByDepartmentIdInAndState(Set<String> dIds, Set<String> states, PageVO pageVO) {
        Page<Employee> page = employeeDao.findAllByDepartmentIdInAndEmployeeStateIdIn(dIds, states, PageRequest.of(pageVO.getPage() - 1, pageVO.getLimit()));
        return page;
    }
}
