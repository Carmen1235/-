package com.wqy.dao.mapper;

import com.wqy.entity.PatentAccept;
import com.wqy.entity.PatentAcceptExample;
import java.util.List;

import com.wqy.model.patent.WebPatentAcceptInfo;
import com.wqy.pojo.patent.PatentAcceptInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * 专利转让
 */
@Component
public interface PatentAcceptMapper {
    long countByExample(PatentAcceptExample example);

    int deleteByExample(PatentAcceptExample example);

    int deleteByPrimaryKey(String id);

    int insert(PatentAccept record);

    int insertSelective(PatentAccept record);

    List<PatentAccept> selectByExample(PatentAcceptExample example);

    PatentAccept selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PatentAccept record, @Param("example") PatentAcceptExample example);

    int updateByExample(@Param("record") PatentAccept record, @Param("example") PatentAcceptExample example);

    int updateByPrimaryKeySelective(PatentAccept record);

    int updateByPrimaryKey(PatentAccept record);


    /**
     * 根据条件查询数据、显示数据列表
     * @param webPatentAcceptInfo
     * @return
     */
    List<PatentAcceptInfo> listEX(WebPatentAcceptInfo webPatentAcceptInfo);

    //查询专利转让数据列表
    List<PatentAcceptInfo> list(LimitElements limitElements);
    //获取专利转让数据总数
    Long count();
    List<WebPatentAcceptInfo> selectByXX(String searchPantentName);//根据条件查询
}