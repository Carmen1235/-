package com.wqy.dao.mapper;

import com.wqy.entity.PatentRenewalsNew;
import com.wqy.entity.PatentRenewalsNewExample;
import java.util.List;

import com.wqy.model.patent.WebPatentRenewalsNewInfo;
import com.wqy.pojo.patent.PatentRenewalsNewInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 专利续展New
 */
@Component
public interface PatentRenewalsNewMapper {
    long countByExample(PatentRenewalsNewExample example);

    int deleteByExample(PatentRenewalsNewExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatentRenewalsNew record);

    int insertSelective(PatentRenewalsNew record);

    List<PatentRenewalsNew> selectByExample(PatentRenewalsNewExample example);

    PatentRenewalsNew selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatentRenewalsNew record, @Param("example") PatentRenewalsNewExample example);

    int updateByExample(@Param("record") PatentRenewalsNew record, @Param("example") PatentRenewalsNewExample example);

    int updateByPrimaryKeySelective(PatentRenewalsNew record);//根据主键更新 为null 的不更新

    int updateByPrimaryKey(PatentRenewalsNew record);

    /**
     *
     * @param webPatentRenewalsNewInfo
     * @return
     */
    List<PatentRenewalsNewInfo> listEX(WebPatentRenewalsNewInfo webPatentRenewalsNewInfo);
}