package com.wqy.dao.mapper;

import com.wqy.entity.BrandSy;
import com.wqy.entity.BrandSyExample;
import com.wqy.entity.BrandSyKey;
import java.util.List;

import com.wqy.model.brand.WebBrandSyInfo;
import com.wqy.pojo.brand.BrandSyInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 *商标使用
 */
@Component
public interface BrandSyMapper {
    long countByExample(BrandSyExample example);

    int deleteByExample(BrandSyExample example);

    int deleteByPrimaryKey(BrandSyKey key);

    int insert(BrandSy record);

    int insertSelective(BrandSy record);

    List<BrandSy> selectByExample(BrandSyExample example);

    BrandSy selectByPrimaryKey(BrandSyKey key);

    int updateByExampleSelective(@Param("record") BrandSy record, @Param("example") BrandSyExample example);

    int updateByExample(@Param("record") BrandSy record, @Param("example") BrandSyExample example);

    int updateByPrimaryKeySelective(BrandSy record);

    int updateByPrimaryKey(BrandSy record);

    //查询商标使用信息数据列表
    List<BrandSyInfo> list(LimitElements limitElements);

    //查询商标使用信息数据列表
    List<BrandSyInfo> listEX(WebBrandSyInfo webBrandSyInfo);

    //查询商标使用数据总数
    Long count();
    List<BrandSyInfo> selectByXX(String searchBrandName);//根据条件查询
}