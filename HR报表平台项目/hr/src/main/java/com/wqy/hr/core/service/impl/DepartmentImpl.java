package com.wqy.hr.core.service.impl;

import com.wqy.hr.core.dao.primary.CorporationDao;
import com.wqy.hr.core.dao.primary.DepartmentDao;
import com.wqy.hr.core.entity.primary.Department;
import com.wqy.hr.core.service.inf.IDepartment;
import com.wqy.hr.core.vo.ResponseDepartment;
import com.wqy.hr.core.vo.ResponseJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:28
 * @desc
 **/
@Service
public class DepartmentImpl implements IDepartment {

    @Autowired
    private DepartmentDao departmentDao;
    @Autowired
    private CorporationDao corporationDao;

    @Override
    public ResponseJson load(String code) {
        if(!"".equals(code)){
            String cId = corporationDao.findByCode(code).getCorporationId();
            List<Department> list = departmentDao.findByCorporationIdEquals(cId);
           return ResponseJson.success(this.getResult(list));
        }

        return ResponseJson.error("无");
    }

    @Override
    public Department getByDid(String dId) {
        Department one = departmentDao.getOne(dId);
        return one;
    }

    private List<ResponseDepartment> getResult(List<Department> departments){
        List<ResponseDepartment> list = new ArrayList<>();
        departments.forEach(e->{
            ResponseDepartment res = new ResponseDepartment(e.getDepartmentId(),e.getCode()+"-"+e.getName());
            list.add(res);
        });
        return list;
    }

    @Override
    public Department getByName(String departmentName) {
        return departmentDao.findByNameEquals(departmentName.trim());
    }

    @Override
    public Department getByDnameAndCid(String dName, String cId) {
        return departmentDao.findByNameEqualsAndCorporationIdEquals(dName,cId);
    }
}
