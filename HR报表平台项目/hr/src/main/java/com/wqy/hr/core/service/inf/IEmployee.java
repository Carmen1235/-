package com.wqy.hr.core.service.inf;

import com.wqy.hr.core.entity.primary.Employee;
import com.wqy.hr.core.vo.PageVO;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:12
 * @desc
 **/
public interface IEmployee {
    List<Employee> getListByDepartmentIdAndState(String departmentId, Set<String> states);
    List<Employee> getListByDepartmentIdInAndState(Set<String> dIds, Set<String> states);
    Page<Employee> getListPageByDepartmentIdAndState(String departmentId, Set<String> states, PageVO pageVO);
    Page<Employee> getListPageByDepartmentIdInAndState(Set<String> dIds, Set<String> states, PageVO pageVO);
}
