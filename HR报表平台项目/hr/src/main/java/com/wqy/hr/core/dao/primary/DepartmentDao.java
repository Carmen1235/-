package com.wqy.hr.core.dao.primary;

import com.wqy.hr.core.entity.primary.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:11
 * @desc
 **/
@Component
public interface DepartmentDao extends JpaRepository<Department,String> {
    List<Department> findByCorporationIdEquals(String corporationId);
    Department findByNameEquals(String name);
    Department findByNameEqualsAndCorporationIdEquals(String name,String corporationId);
}
