package com.wqy.hr.core.entity.primary;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author 王秋叶
 * @create 2019-02-19 16:06
 * @desc
 **/
@Entity
@Table(name = "Job")
@Data
public class Job {

    @Id
    @Column(name = "JobId")
    private String jobId;

    @Column(name = "Name")
    private String name;
}
