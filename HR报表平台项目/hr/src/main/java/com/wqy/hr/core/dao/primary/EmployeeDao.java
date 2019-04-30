package com.wqy.hr.core.dao.primary;

import com.wqy.hr.core.entity.primary.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:11
 * @desc
 **/
@Component
public interface EmployeeDao extends JpaRepository<Employee,String> {
    List<Employee> findAllByDepartmentId(String departmentId);
    List<Employee> findAllByDepartmentIdAndEmployeeStateIdIn(String departmentId, Set<String> employeeStateIds );
    List<Employee> findAllByDepartmentIdInAndEmployeeStateIdIn(Set<String> departmentIds, Set<String> employeeStateIds );
    Page<Employee> findAllByDepartmentIdAndEmployeeStateIdIn(String departmentId, Set<String> employeeStateIds, Pageable pageable);
    Page<Employee> findAllByDepartmentIdInAndEmployeeStateIdIn(Set<String> departmentIds, Set<String> employeeStateIds, Pageable pageable);
}
