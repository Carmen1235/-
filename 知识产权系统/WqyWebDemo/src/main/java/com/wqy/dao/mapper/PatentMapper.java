package com.wqy.dao.mapper;

import com.wqy.entity.Patent;
import com.wqy.entity.PatentExample;
import java.util.List;

import com.wqy.model.patent.WebPatentInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 专利库
 */
@Component
public interface PatentMapper {
    long countByExample(PatentExample example);

    int deleteByExample(PatentExample example);

    int deleteByPrimaryKey(String id);

    int insert(Patent record);

    int insertSelective(Patent record);

    List<Patent> selectByExample(PatentExample example);

    Patent selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Patent record, @Param("example") PatentExample example);

    int updateByExample(@Param("record") Patent record, @Param("example") PatentExample example);

    int updateByPrimaryKeySelective(Patent record);

    int updateByPrimaryKey(Patent record);

    List<Patent> selectByXX(String zlSearchPantentName);//根据条件查询

    /**
     * 根据条件查询数据/显示数据列表list
     * @param webPatentInfo
     * @return
     */
    List<Patent> listEX(WebPatentInfo webPatentInfo);
}