package com.wqy.dao.mapper;

import com.wqy.entity.Wxtemplate;
import com.wqy.entity.WxtemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxtemplateMapper {
    long countByExample(WxtemplateExample example);

    int deleteByExample(WxtemplateExample example);

    int deleteByPrimaryKey(String id);

    int insert(Wxtemplate record);

    int insertSelective(Wxtemplate record);

    List<Wxtemplate> selectByExample(WxtemplateExample example);

    Wxtemplate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Wxtemplate record, @Param("example") WxtemplateExample example);

    int updateByExample(@Param("record") Wxtemplate record, @Param("example") WxtemplateExample example);

    int updateByPrimaryKeySelective(Wxtemplate record);

    int updateByPrimaryKey(Wxtemplate record);
}