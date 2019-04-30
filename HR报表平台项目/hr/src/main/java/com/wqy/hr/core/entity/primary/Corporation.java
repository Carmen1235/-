package com.wqy.hr.core.entity.primary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:20
 * @desc
 **/
@Entity
@Table(name = "Corporation")
@Data
public class Corporation {

    @Id
    @Column(name = "CorporationId")
    private String corporationId;

    @Column(name = "ShortName")
    private String shortName;

    @Column(name = "Code")
    private String code;

    @Column(name = "Name")
    private String name;
}
