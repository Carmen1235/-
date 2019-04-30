package com.wqy.pojo.brand;

import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

import java.util.Date;

/**
 * 商标使用信息
 */
@Data
public class BrandSyInfo extends BrandBaseInfo {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private String sbsydw;
    private String spjfw;
    private Date use_start_date;
    private String syzj;
}
