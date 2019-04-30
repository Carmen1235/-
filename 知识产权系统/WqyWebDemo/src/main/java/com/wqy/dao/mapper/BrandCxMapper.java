package com.wqy.dao.mapper;

import com.wqy.entity.BrandCx;
import com.wqy.entity.BrandCxExample;
import com.wqy.entity.BrandCxKey;
import java.util.List;

import com.wqy.model.brand.WebBrandCxInfo;
import com.wqy.pojo.brand.BrandCxInfo;
import com.wqy.util.LimitElements;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
/**
 * 商标撤销
 */
@Component
public interface BrandCxMapper {
    long countByExample(BrandCxExample example);

    int deleteByExample(BrandCxExample example);

    int deleteByPrimaryKey(BrandCxKey key);

    int insert(BrandCx record);

    int insertSelective(BrandCx record);

    List<BrandCx> selectByExample(BrandCxExample example);

    BrandCx selectByPrimaryKey(BrandCxKey key);

    int updateByExampleSelective(@Param("record") BrandCx record, @Param("example") BrandCxExample example);

    int updateByExample(@Param("record") BrandCx record, @Param("example") BrandCxExample example);

    int updateByPrimaryKeySelective(BrandCx record);

    int updateByPrimaryKey(BrandCx record);

    //查询商标撤销数据列表
    List<BrandCxInfo> list(LimitElements limitElements);

    //查询商标撤销数据列表
    List<BrandCxInfo> listEX(WebBrandCxInfo webBrandCxInfo);

    //获取商标撤销数据总数
    long count();
    List<BrandCxInfo> selectByXX(String searchBrandName);//根据条件查询
}