package com.wqy.pojo.brand;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 商标信息
 * @author wangqiuye
 * @desc 不需要，使用自带的实体
 */
@Deprecated
@Data
public class BrandInfo {
    @Excel(name ="主键ID")
    private String id;
    @Excel(name ="商标标样")
    private String brandStyle;
    @Excel(name ="商标名称" )
    private String brandName;
    @Excel(name ="群组" )
    private String groups;
    @Excel(name ="类别" )
    private String category;
    @Excel(name ="保护地域" )
    private String protectedAreas;
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
    @Excel(name ="注册公告日期")
    private Date zcggr;
    @Excel(name ="注册号" )
    private String regNumber;
    @Excel(name ="专利权期限" )
    private Date deadline;
    @Excel(name ="法律状态" )
    private String state;
    @Excel(name ="申请项目表" )
    private String sqxmb;
    @Excel(name ="代理机构" )
    private String agency;
    @Excel(name ="商标来源" )
    private String brandSource;
    @Excel(name ="备注" )
    private String bz;
    @Excel(name = "档案编号")
    private String fileNumber;
    @Excel(name = "商品/服务")
    private String commodity;
    @Excel(name = "档案编号")
    private String brandType;
    @Excel(name = "商标授权日")
    private Date authorization;
    @Excel(name = "共有人")
    private String partOwer;
    @Excel(name = "颜色")
    private String color;
    @Excel(name = "最早使用日期")
    private Date firstDate;
    @Excel(name = "项目申请编号")
    private String projectApplyNumber;
    @Excel(name = "受理日期")
    private Date acceptDate;
    @Excel(name = "国际注册日期")
    private Date intRegDate;
    @Excel(name = "后期指定日期")
    private Date lateDate;
    @Excel(name = "著名商标认定")
    private String faomousTrademark;
    @Excel(name = "驰名商标认定")
    private String reputedTrademark;
    @Excel(name = "驳回记录")
    private String reject;
    @Excel(name = "预留字段1")
    private String ext1;
    @Excel(name = "预留字段2")
    private String ext2;
    @Excel(name = "预留字段3")
    private String ext3;
    @Excel(name = "预留字段4")
    private String ext4;
    @Excel(name = "预留字段5")
    private String ext5;
    @Excel(name = "预留字段6")
    private String ext6;

    @Excel(name = " 已经过时，注册公告日期")
    private Date regDate;
    @Excel(name = " 已经过时，初步审定公告日 同初审公告日期")
    private Date noticeDate;
}
