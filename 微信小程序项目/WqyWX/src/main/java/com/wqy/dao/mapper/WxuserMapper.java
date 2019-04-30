package com.wqy.dao.mapper;

import com.wqy.entity.Wxuser;
import com.wqy.entity.WxuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxuserMapper {
    long countByExample(WxuserExample example);

    int deleteByExample(WxuserExample example);

    int deleteByPrimaryKey(String tId);

    int insert(Wxuser record);

    int insertSelective(Wxuser record);

    List<Wxuser> selectByExample(WxuserExample example);

    Wxuser selectByPrimaryKey(String tId);

    int updateByExampleSelective(@Param("record") Wxuser record, @Param("example") WxuserExample example);

    int updateByExample(@Param("record") Wxuser record, @Param("example") WxuserExample example);

    int updateByPrimaryKeySelective(Wxuser record);

    int updateByPrimaryKey(Wxuser record);
}