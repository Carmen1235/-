package com.wqy.pojo.brand;

import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 商标撤销信息
 */
@Data
public class BrandCxInfo extends BrandBaseInfo implements Serializable {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private String cxf = "";
    private String bcxf = "";
    private String cxqz = "";
    private Date cxrq = null;
    private String cxdljg ="";
    private String cxjg = "";

}
