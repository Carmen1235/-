package com.wqy.dao.mapper;

import com.wqy.entity.BrandJc;
import com.wqy.entity.BrandJcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrandJcMapper {
    long countByExample(BrandJcExample example);

    int deleteByExample(BrandJcExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrandJc record);

    int insertSelective(BrandJc record);

    List<BrandJc> selectByExample(BrandJcExample example);

    BrandJc selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrandJc record, @Param("example") BrandJcExample example);

    int updateByExample(@Param("record") BrandJc record, @Param("example") BrandJcExample example);

    int updateByPrimaryKeySelective(BrandJc record);

    int updateByPrimaryKey(BrandJc record);
}