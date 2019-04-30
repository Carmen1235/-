package com.wqy.pojo.brand;

import com.wqy.pojo.base.BrandBaseInfo;
import lombok.Data;

/**
 * 商标许可信息
 */
@Data
public class BrandXkInfo extends BrandBaseInfo {
    private String id;
    private String pid;
    /**
     * 其他来源 BrandBaseInfo
     */
    private String bxkf;
    private String bxkqx;
    private String bxkspjfw;
}
