package com.wqy.hr.core.entity.primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 王秋叶
 * @create 2019-02-19 15:09
 * @desc
 **/
@Entity
@Table(name = "Employee")
@Data
@Accessors(chain = true)
public class Employee {

    @Id
    @Column(name = "EmployeeId")
    private String employeeId;

    @Column(name = "Code")
    private String code;

    @Column(name = "CnName")
    private String cnName;

    @Column(name = "EmployeeStateId")
    private String employeeStateId;

    @Column(name = "DepartmentId")
    private String departmentId;

    @Column(name = "JobId")
    private String jobId;
}
