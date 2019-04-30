package com.wqy.dao.mapper;

import com.wqy.entity.PatentInvalidDeclare;
import com.wqy.entity.PatentInvalidDeclareExample;
import com.wqy.entity.PatentInvalidDeclareKey;
import com.wqy.model.patent.WebPatentInvalidDeclareInfo;
import com.wqy.pojo.patent.PatentInvalidDeclareInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 专利无效宣告
 */
@Component
public interface PatentInvalidDeclareMapper {
    long countByExample(PatentInvalidDeclareExample example);

    int deleteByExample(PatentInvalidDeclareExample example);

    int deleteByPrimaryKey(PatentInvalidDeclareKey key);

    int insert(PatentInvalidDeclare record);

    int insertSelective(PatentInvalidDeclare record);

    List<PatentInvalidDeclare> selectByExample(PatentInvalidDeclareExample example);

    PatentInvalidDeclare selectByPrimaryKey(PatentInvalidDeclareKey key);

    int updateByExampleSelective(@Param("record") PatentInvalidDeclare record, @Param("example") PatentInvalidDeclareExample example);

    int updateByExample(@Param("record") PatentInvalidDeclare record, @Param("example") PatentInvalidDeclareExample example);

    int updateByPrimaryKeySelective(PatentInvalidDeclare record);

    int updateByPrimaryKey(PatentInvalidDeclare record);



    /**
     * 根据条件查询专利无效宣告数据/显示数据list
     * @param webPatentInvalidDeclareInfo
     * @return
     */
    List<PatentInvalidDeclareInfo> listEX(WebPatentInvalidDeclareInfo webPatentInvalidDeclareInfo);


    //查询专利无效宣告数据全部数据，不分页
    List<PatentInvalidDeclareInfo> exportAll();

}