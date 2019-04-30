package com.wqy.hr.core.entity.primary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:11
 * @desc
 **/
@Entity
@Table(name = "Department")
@Data
public class Department {

    @Id
    @Column(name = "DepartmentId")
    private String departmentId;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name = "CorporationId")
    private String corporationId;
}
