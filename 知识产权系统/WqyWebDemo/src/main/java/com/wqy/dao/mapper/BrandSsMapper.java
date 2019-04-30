package com.wqy.dao.mapper;

import com.wqy.entity.BrandSs;
import com.wqy.entity.BrandSsExample;
import com.wqy.entity.BrandSsKey;
import java.util.List;

import com.wqy.model.brand.WebBrandSsInfo;
import com.wqy.pojo.brand.BrandSsInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 商标诉讼
 */

@Component
public interface BrandSsMapper {
    long countByExample(BrandSsExample example);

    int deleteByExample(BrandSsExample example);

    int deleteByPrimaryKey(BrandSsKey key);

    int insert(BrandSs record);

    int insertSelective(BrandSs record);

    List<BrandSs> selectByExample(BrandSsExample example);

    BrandSs selectByPrimaryKey(BrandSsKey key);

    int updateByExampleSelective(@Param("record") BrandSs record, @Param("example") BrandSsExample example);

    int updateByExample(@Param("record") BrandSs record, @Param("example") BrandSsExample example);

    int updateByPrimaryKeySelective(BrandSs record);

    int updateByPrimaryKey(BrandSs record);

    //查询商标诉讼数据列表
    List<BrandSsInfo> list(LimitElements limitElements);

    //查询商标诉讼数据列表
    List<BrandSsInfo> listEX(WebBrandSsInfo webBrandSsInfo);

    //查询商标诉讼数据总数
    Long count();
    List<BrandSsInfo> selectByXX(String searchBrandName);//根据条件查询
}