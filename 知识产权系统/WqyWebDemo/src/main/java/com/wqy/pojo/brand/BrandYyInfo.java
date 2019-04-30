package com.wqy.pojo.brand;

import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商标异议信息
 */
@Data
public class BrandYyInfo extends BrandBaseInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    /**
     * 异议方
     */
    private String yyf = "";
    /**
     * 被异议方
     */
    private String byyf = "";
    /**
     * 异议群组
     */
    private String yyqz = "";
    /**
     * 提异议日期
     */
    private Date tyyrq = null;
    /**
     * 异议代理机构
     */
    private String yydljg = "";
    /**
     * 异议结果
     */
    private String yyjg = "";

}
