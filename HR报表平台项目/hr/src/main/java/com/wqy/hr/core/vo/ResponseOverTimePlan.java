package com.wqy.hr.core.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author 王秋叶
 * @create 2019-02-20 9:50
 * @desc
 **/
@Data
@AllArgsConstructor
public class ResponseOverTimePlan{
    private String code;
    private String name;
    private String departmentName;

    private String jobName;

    private String type;
    private String vDay;
    private String sDay;
    private String sTime;
    private String eDay;
    private String eTime;

    private String isMeals;
    private String isPlan;
    private String result;
}
