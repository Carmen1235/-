package com.wqy.pojo.base;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 王秋叶
 * @create 2018-12-12 9:12
 * @desc 商标维护 商标公共字段
 **/
@Data
public class BrandBaseInfo implements Serializable {
    private String id;
    private String pid;

    @Excel(name ="商标标样")
    private String brandStyle;
    @Excel(name ="商标名称" )
    private String brandName;
    @Excel(name ="群组" )
    private String groups;
    @Excel(name ="类别" )
    private String category;
    @Excel(name ="申请人" )
    private String applyName;
    @Excel(name ="操作地" )
    private String address;
    @Excel(name ="申请号" )
    private String applyNumber;
    @Excel(name ="申请日")
    private Date applyDate;
    @Excel(name ="初审公告日期")
    private Date cbsdggr;
    @Excel(name = "商标授权日")
    private Date authorization;
    @Excel(name ="注册公告日/注册日")
    private Date zcggr;
    @Excel(name ="专利权期限")
    private Date deadline;

}
