package com.wqy.pojo.brand;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商标诉讼信息
 */
@Data
public class BrandSsInfo extends BrandBaseInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    @Excel(name ="诉讼类型" )
    private String sslx="";
    @Excel(name ="审级" )
    private String sj="";
    @Excel(name ="原告" )
    private String yg="";
    @Excel(name ="被告" )
    private String bg="";
    @Excel(name ="案由" )
    private String ay="";
    @Excel(name ="诉讼请求" )
    private String ssqq="";
    @Excel(name ="案件结果" )
    private String ajjg="";
    @Excel(name ="裁判日期" )
    private Date cprq= null;
    @Excel(name ="一审法院" )
    private String ysfy="";
    @Excel(name ="律师" )
    private String ls="";
    @Excel(name ="律师事务所" )
    private String lssws="";
    @Excel(name ="第三人" )
    private String dsr="";
    @Excel(name ="上诉信息" )
    private String ssxx="";
    @Excel(name ="申请单位" )
    private String applyUnit="";
    @Excel(name ="使用单位" )
    private String useUnit="";
    @Excel(name ="涉案商标" )
    private String sasb="";
    @Excel(name ="备注" )
    private String bz="";

}
