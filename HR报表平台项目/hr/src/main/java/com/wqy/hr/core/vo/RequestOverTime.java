package com.wqy.hr.core.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 王秋叶
 * @create 2019-02-22 13:41
 * @desc
 **/
@Getter
@Setter
@ToString
public class RequestOverTime extends ResponseOverTime {
    private String shortName;
    private String corporationCode;
    private String departmentId;
    public RequestOverTime(String code, String name, String departmentName, String jobName, String type, String vDay, String sDay, String sTime, String eDay, String eTime, String isMeals, String isPlan, String result) {
        super(code, name, departmentName, jobName, type, vDay, sDay, sTime, eDay, eTime, isMeals, isPlan, result);
    }
}
