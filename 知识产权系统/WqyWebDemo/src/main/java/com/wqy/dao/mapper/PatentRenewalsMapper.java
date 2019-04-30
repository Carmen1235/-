package com.wqy.dao.mapper;

import com.wqy.entity.PatentRenewals;
import com.wqy.entity.PatentRenewalsExample;
import java.util.List;

import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface PatentRenewalsMapper {
    long countByExample(PatentRenewalsExample example);

    int deleteByExample(PatentRenewalsExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatentRenewals record);

    int insertSelective(PatentRenewals record);

    List<PatentRenewals> selectByExample(PatentRenewalsExample example);

    PatentRenewals selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatentRenewals record, @Param("example") PatentRenewalsExample example);

    int updateByExample(@Param("record") PatentRenewals record, @Param("example") PatentRenewalsExample example);

    int updateByPrimaryKeySelective(PatentRenewals record);

    int updateByPrimaryKey(PatentRenewals record);

    List<PatentRenewals> selectList(LimitElements limitElements);
    List<PatentRenewals> select(PatentRenewals record);
    Long selectCount(PatentRenewals renewals);
}