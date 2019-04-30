package com.wqy.hr.core.service.inf;

import com.wqy.hr.core.entity.primary.Department;
import com.wqy.hr.core.vo.ResponseJson;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:28
 * @desc
 **/
public interface IDepartment {
    ResponseJson load(String code);
    Department getByDid(String dId);
    Department getByName(String departmentName);
    Department getByDnameAndCid(String dName,String cId);
}
