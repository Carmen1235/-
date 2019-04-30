package com.wqy.hr.core.service.impl;

import com.wqy.hr.core.dao.primary.CorporationDao;
import com.wqy.hr.core.dao.primary.EmployeeDao;
import com.wqy.hr.core.service.inf.ICorporation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeImplTest {

    @Autowired
    private CorporationDao corporationDao;

    @Autowired
    private ICorporation iCorporation;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void test() {
//        Corporation corporationByShortNameEquals = corporationDao.findCorporationByShortNameEquals("万汇休闲");
//        Corporation c = iCorporation.getByShortName("万汇休闲");
//        System.out.println(c.toString());
//        Set<String> sets = new HashSet<>();
//        sets.add("EmployeeState1001");
//        sets.add("EmployeeState2001");
//        employeeDao.findAllByDepartmentIdAndEmployeeStateIdIn("39ECB826-2E44-447F-96E1-A8542519F116",sets);
    }
}