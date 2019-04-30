package com.wqy.pojo.brand;

import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

import java.util.Date;

/**
 * 商标转让信息
 */
@Data
public class BrandZrInfo extends BrandBaseInfo {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private Date zrslr;
    private String srr;
    private String dljg;
    private String zryy;
    private Date zrwcr;
}
