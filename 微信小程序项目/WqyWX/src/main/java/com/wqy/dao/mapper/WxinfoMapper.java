package com.wqy.dao.mapper;

import com.wqy.entity.Wxinfo;
import com.wqy.entity.WxinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxinfoMapper {
    long countByExample(WxinfoExample example);

    int deleteByExample(WxinfoExample example);

    int deleteByPrimaryKey(String tId);

    int insert(Wxinfo record);

    int insertSelective(Wxinfo record);

    List<Wxinfo> selectByExample(WxinfoExample example);

    Wxinfo selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") Wxinfo record, @Param("example") WxinfoExample example);

    int updateByExample(@Param("record") Wxinfo record, @Param("example") WxinfoExample example);

    int updateByPrimaryKeySelective(Wxinfo record);

    int updateByPrimaryKey(Wxinfo record);
}