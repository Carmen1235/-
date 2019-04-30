package com.wqy.dao.mapper;

import com.wqy.entity.PatentLawsuit;
import com.wqy.entity.PatentLawsuitExample;
import com.wqy.entity.PatentLawsuitKey;
import java.util.List;

import com.wqy.model.patent.WebPatentLawsuitInfo;
import com.wqy.pojo.patent.PatentLawsuitInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 专利诉讼
 */
@Component
public interface PatentLawsuitMapper {
    long countByExample(PatentLawsuitExample example);

    int deleteByExample(PatentLawsuitExample example);

    int deleteByPrimaryKey(PatentLawsuitKey key);

    int insert(PatentLawsuit record);

    int insertSelective(PatentLawsuit record);

    List<PatentLawsuit> selectByExample(PatentLawsuitExample example);

    PatentLawsuit selectByPrimaryKey(PatentLawsuitKey key);

    int updateByExampleSelective(@Param("record") PatentLawsuit record, @Param("example") PatentLawsuitExample example);

    int updateByExample(@Param("record") PatentLawsuit record, @Param("example") PatentLawsuitExample example);

    int updateByPrimaryKeySelective(PatentLawsuit record);

    int updateByPrimaryKey(PatentLawsuit record);

    /**
     * 查询专利诉讼数据列表 、显示数据列表
     * @param webPatentLawsuitInfo
     * @return
     */
    List<PatentLawsuitInfo> listEX(WebPatentLawsuitInfo webPatentLawsuitInfo);

    //查询专利诉讼数据列表
    List<PatentLawsuitInfo> list(LimitElements limitElements);
    //查询专利诉讼数据总数
    Long count();
    List<WebPatentLawsuitInfo> selectByXX(String searchPantentName);//根据条件查询
}